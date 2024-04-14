package com.dopamine.trade;

import static com.dopamine.trade.BidTrader.ownCoin;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.order_book.OrderBook;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.common.service.CommonService;
import com.dopamine.tool.CalcUnit;
import com.dopamine.trade.dao.OrderDao;
import com.dopamine.trade.model.OrderHistory;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import java.time.LocalDateTime;
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
  private final OrderDao orderDao;

  @Scheduled(fixedDelay = 2783)
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

    if (currentPriceList.size() == 0) {
      return;
    }

    for (Accounts account : coinAccountList) {
      double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
      OrderBook currentPrice = currentPriceList.stream()
          .filter(a -> a.getMarket().equals(account.getCurrency())).findFirst().get();

      OrderHistory askOrderHistory = orderService.getLastOrder(account.getCurrency(),
          OrderSide.ASK.getValue(), OrderType.LIMIT.getValue());

      if (askOrderHistory == null) {
        // 아직 매도 주문을 안했거나 손절, 시간초과로 시장가로 던진상태
        continue;
      }

      LocalDateTime limitAskOrderTime = askOrderHistory.getOrderTime();
      Double currentBidPrice = currentPrice.getOrderbookUnits().get(0).getBidPrice();

      if (avgBuyPrice * askLossRateValue > currentBidPrice) {
        OrderHistory orderHistory = orderDao.selectLastOrderHistory(account.getCurrency(), "ask",
            "limit");
        double purchaseCoinKrw = accountService.getPurchaseCoinKrw(account.getCurrency());
        Order order = orderService.askMarketCoin(account.getCurrency(),
            Double.parseDouble(account.getBalance()) > 0d ? account.getBalance()
                : account.getLocked(), askOrderHistory.getUuid());

        if (order.isSuccess()) {
          log.info("[손절매도] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 손해금액 : {}, 손절설정값 : {}, 차트종류 : {}",
              order.getMarket(),
              String.format("%,.2f", purchaseCoinKrw),
              String.format("%,.2f",
                  currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                      ? Double.parseDouble(account.getBalance())
                      : Double.parseDouble(account.getLocked())) / 0.9995d),
              String.format("%,.2f",
                  -1 * (purchaseCoinKrw - (
                      currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                          ? Double.parseDouble(account.getBalance())
                          : Double.parseDouble(account.getLocked())) / 0.9995d))),
              askLossRateValue,
              orderHistory.getChartType()
          );
          ownCoin.remove(account.getCurrency());
        }

      } else if (limitAskOrderTime.isBefore(
          LocalDateTime.now().minusSeconds(askTimeoutLimitValue))) {
        OrderHistory orderHistory = orderDao.selectLastOrderHistory(account.getCurrency(), "ask",
            "limit");
        double purchaseCoinKrw = accountService.getPurchaseCoinKrw(account.getCurrency());
        Order order = orderService.askMarketCoin(account.getCurrency(),
            Double.parseDouble(account.getBalance()) > 0d ? account.getBalance()
                : account.getLocked(), askOrderHistory.getUuid());

        if (order.isSuccess()) {
          log.info("[시간초과] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 손해금액 : {}, 시간설정값 : {}초, 차트종류 : {}",
              order.getMarket(),
              String.format("%,.2f", purchaseCoinKrw),
              String.format("%,.2f",
                  currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                      ? Double.parseDouble(account.getBalance())
                      : Double.parseDouble(account.getLocked())) / 0.9995d),
              String.format("%,.2f",
                  -1 * (purchaseCoinKrw - (
                      currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                          ? Double.parseDouble(account.getBalance())
                          : Double.parseDouble(account.getLocked())) / 0.9995d))),
              askTimeoutLimitValue,
              orderHistory.getChartType()
          );

          ownCoin.remove(account.getCurrency());
        }

      }
    }
  }

  @Async
  @Scheduled(fixedRate = 1871)
  public void askLimitTrader() {
    List<OrderHistory> askTargetCoin = orderService.getAskTargetCoin();
    if (askTargetCoin.isEmpty()) {
      return;
    }

    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    if (coinAccountList.size() == 0) {
      return;
    }

    double askProfitRateValue = Double.parseDouble(commonService.getConfig("ASK", "profit_rate"));
    for (OrderHistory orderHistory : askTargetCoin) {
      boolean accountExist = coinAccountList.stream()
          .filter(a -> a.getCurrency().equals(orderHistory.getMarket())).findAny().isPresent();

      if (!accountExist) {
        orderDao.updateCoinOrderHistoryExpiredByUuid(orderHistory.getUuid());
        continue;
      }

      Accounts account = coinAccountList.stream()
          .filter(a -> a.getCurrency().equals(orderHistory.getMarket())).findFirst().get();

      double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
      double sellPrice = CalcUnit.exchangeMarketUnit(avgBuyPrice * askProfitRateValue);

      Order order = orderService.askLimitCoin(orderHistory.getMarket(), orderHistory.getChartType(),
          account.getBalance(), sellPrice);

      if (order.isSuccess()) {
        ownCoin.add(orderHistory.getMarket());
      }
    }
  }

}
