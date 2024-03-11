package com.dopamine.trade;

import static com.dopamine.trade.BidTrader.bidList;
import static com.dopamine.trade.BidTrader.exceptCoin;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.order_book.OrderBook;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.common.service.CommonService;
import com.dopamine.tool.CalcUnit;
import com.dopamine.trade.model.OrderHistory;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AskTrader {


  private final AccountService accountService;
  private final OrderService orderService;
  private final CommonService commonService;

  @Async
  @Scheduled(fixedRate = 2783)
  public void askTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    if (coinAccountList.size() == 0) {
      return;
    }

    double askLossRateValue = Double.parseDouble(commonService.getConfig("ASK", "loss_rate"));
    int askTimeoutLimitValue = Integer.parseInt(commonService.getConfig("ASK", "time_limit"));

    List<OrderBook> currentPriceList = QuotationRequestManager.getOrderBookList(
        coinAccountList.stream().map(Accounts::getCurrency).collect(
            Collectors.toList()));

    if (currentPriceList.isEmpty()) {
      return;
    }

    for (Accounts account : coinAccountList) {
      double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
      OrderBook currentPrice = currentPriceList.stream()
          .filter(a -> a.getMarket().equals(account.getCurrency())).findFirst().orElseThrow();

      OrderHistory askOrderHistory = orderService.getLastOrder(account.getCurrency(),
          OrderSide.ASK.getValue());

      if (askOrderHistory == null) {
        // 아직 매도 주문을 안했거나 손절, 시간초과로 시장가로 던진상태
        continue;
      }

      LocalDateTime bidTime = orderService.getLastOrder(account.getCurrency(),
          OrderSide.BID.getValue()).getOrderTime();

      Double currentBidPrice = currentPrice.getOrderbookUnits().get(0).getBidPrice();
      if (avgBuyPrice * askLossRateValue > currentBidPrice) {
        orderService.cancelOrder(askOrderHistory.getUuid());

        Order order = orderService.askMarketCoin(account.getCurrency(), account.getBalance());
        if (order.isSuccess()) {
          log.info("[손절매도] 코인명 : {}, 설정 손절률 : {}", order.getMarket(), askLossRateValue);
          if (!exceptCoin.contains(account.getCurrency())) {
            exceptCoin.add(account.getCurrency());
          }
        }

      } else if (bidTime.isBefore(LocalDateTime.now().minusSeconds(askTimeoutLimitValue))) {
        orderService.cancelOrder(askOrderHistory.getUuid());

        Order order = orderService.askMarketCoin(account.getCurrency(),
            account.getBalance());
        if (order.isSuccess()) {
          log.info("[시간초과] 코인명 : {}, 설정 초과시간(초) : {}", order.getMarket(), askTimeoutLimitValue);
          if (!exceptCoin.contains(account.getCurrency())) {
            exceptCoin.add(account.getCurrency());
          }
        }

      }
    }
  }

  @Async
  @Scheduled(fixedRate = 1871)
  public void askLimitTrader() {
    if (bidList.isEmpty()) {
      return;
    }

    List<OrderBook> currentPriceList = QuotationRequestManager.getOrderBookList(
        new ArrayList<>(bidList.keySet()));

    if (currentPriceList.isEmpty()) {
      return;
    }

    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    double askProfitRateValue = Double.parseDouble(commonService.getConfig("ASK", "profit_rate"));

    for (Accounts account : coinAccountList) {
      double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
      double sellPrice = CalcUnit.exchangeMarketUnit(avgBuyPrice * askProfitRateValue);

      Order order = orderService.askLimitCoin(account.getCurrency(),
          account.getBalance(), sellPrice);
      if (order.isSuccess()) {
        log.info("[매수완료] 코인명 : {}, 매수단가 : {}, 매도단가 : {}, 설정 수익률 : {}", order.getMarket(),
            avgBuyPrice,
            sellPrice,
            askProfitRateValue);
        bidList.remove(order.getMarket());
      }
    }
  }

}
