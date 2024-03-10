package com.dopamine.trade;

import static com.dopamine.trade.BidTrader.exceptCoinQueue;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.order_book.OrderBook;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AskTrader {

  private final AccountService accountService;
  private final OrderService orderService;
  private final CommonService commonService;

  @Scheduled(fixedDelay = 334)
  public void askTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();

    if (coinAccountList.size() == 0) {
      return;
    }

    double askProfitRateValue = Double.parseDouble(commonService.getConfig("ASK", "profit_rate"));
    double askLossRateValue = Double.parseDouble(commonService.getConfig("ASK", "loss_rate"));
    int askTimeoutLimitValue = Integer.parseInt(commonService.getConfig("ASK", "time_limit"));
    for (Accounts account : coinAccountList) {
      double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
      OrderBook currentPrice = QuotationRequestManager.getOrderBookList(
          List.of(account.getCurrency())).get(0);
      Double currentBidPrice = currentPrice.getOrderbookUnits().get(0).getBidPrice();

      if (avgBuyPrice * askProfitRateValue < currentBidPrice) {
        Order order = orderService.askLimitCoin(account.getCurrency(),
            account.getBalance(), currentBidPrice);
        if (order.isSuccess()) {
          log.info("[익절매도] 코인명 : {}, 매수단가 : {}, 매도단가 : {}, 설정 수익률 : {}", order.getMarket(),
              avgBuyPrice,
              currentBidPrice,
              askProfitRateValue);

          if (!exceptCoinQueue.contains("KRW-" + account.getCurrency())) {
            exceptCoinQueue.add("KRW-" + account.getCurrency());
          }
        }

      } else if (avgBuyPrice * askLossRateValue > currentBidPrice) {
        Order order = orderService.askMarketCoin(account.getCurrency(),
            account.getBalance());
        if (order.isSuccess()) {
          log.info("[손절매도] 코인명 : {}, 설정 손절률 : {}", order.getMarket(), askLossRateValue);
          if (!exceptCoinQueue.contains("KRW-" + account.getCurrency())) {
            exceptCoinQueue.add("KRW-" + account.getCurrency());
          }
        }

      } else if (orderService.getLastOrder("KRW-" + account.getCurrency(),
              OrderSide.BID.getValue()).getOrderTime().plusSeconds(askTimeoutLimitValue)
          .isBefore(LocalDateTime.now())) {

        // 관련하여 모든 주문 취소
        orderService.cancelOrder(orderService.getLastOrder("KRW-" + account.getCurrency(),
            OrderSide.ASK.getValue()).getUuid());

        Order order = orderService.askMarketCoin(account.getCurrency(),
            account.getBalance());
        if (order.isSuccess()) {
          log.info("[시간초과] 코인명 : {}, 설정 초과시간(초) : {}", order.getMarket(), askTimeoutLimitValue);
          if (!exceptCoinQueue.contains("KRW-" + account.getCurrency())) {
            exceptCoinQueue.add("KRW-" + account.getCurrency());
          }
        }

      }
    }
  }

}
