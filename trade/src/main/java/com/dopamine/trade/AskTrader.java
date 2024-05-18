package com.dopamine.trade;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.candle.Candle;
import com.dopamine.api_call.model.response.quotation.order_book.OrderBook;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.model.OrderHistory;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.ChartResearchService;
import com.dopamine.trade.service.OrderService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
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
  private final ChartResearchService chartResearchService;

  @Scheduled(fixedDelay = 1771)
  public void askTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    if (coinAccountList.size() == 0) {
      return;
    }

    double askProfitRateValue = Double.parseDouble(commonService.getConfig("ASK", "profit_rate"));
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

      OrderHistory bidOrderHistory = orderService.getLastOrder(account.getCurrency(),
          OrderSide.BID.getValue(), OrderType.BEST.getValue());

      if (bidOrderHistory == null) {
        continue;
      }

      LocalDateTime limitAskOrderTime = bidOrderHistory.getOrderTime();
      Double currentBidPrice = currentPrice.getOrderbookUnits().get(0).getBidPrice();

      String candleUnit = commonService.getConfig("BID", "candle_unit").trim();
      List<Candle> minuteCandleList = QuotationRequestManager.getMinuteCandleList(
          currentPrice.getMarket(), "200",
          candleUnit);
      if (minuteCandleList == null || minuteCandleList.isEmpty()) {
        continue;
      }
      double rsi = chartResearchService.getRsiByMinutes(minuteCandleList, 14);
      Integer bollingerBandPeriod = Integer.parseInt(
          commonService.getConfig("BID", "bollinger_band_period").trim());
      List<Double> bollingerBandValue = chartResearchService.getBollingerBandByMinutes(
          minuteCandleList,
          bollingerBandPeriod, 2);
      boolean isTopBollingerBandValue =
          bollingerBandValue.get(0) <= minuteCandleList.get(0).getHighPrice();

      if (avgBuyPrice * askProfitRateValue < currentBidPrice) {
        double purchaseCoinKrw = accountService.getPurchaseCoinKrw(account.getCurrency());
        Order order = orderService.askMarketCoin(account.getCurrency(),
            Double.parseDouble(account.getBalance()) > 0d ? account.getBalance()
                : account.getLocked());
        if (order.isSuccess()) {
          log.info("[익절매도] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 차액 : {}, 익절 설정값 : {}",
              order.getMarket().replace("KRW-", ""),
              String.format("%,.2f", purchaseCoinKrw),
              String.format("%,.2f",
                  currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                      ? Double.parseDouble(account.getBalance())
                      : Double.parseDouble(account.getLocked())) / 0.9995d),
              String.format("%,.2f",
                  (currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                      ? Double.parseDouble(account.getBalance())
                      : Double.parseDouble(account.getLocked())) / 0.9995d) - purchaseCoinKrw),
              askProfitRateValue
          );

        }
      } else if (rsi >= 70 || (avgBuyPrice * 1.002 < currentBidPrice && isTopBollingerBandValue)) {
        double purchaseCoinKrw = accountService.getPurchaseCoinKrw(account.getCurrency());
        Order order = orderService.askMarketCoin(account.getCurrency(),
            Double.parseDouble(account.getBalance()) > 0d ? account.getBalance()
                : account.getLocked());
        if (order.isSuccess()) {
          log.info("[차트매도] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 차액 : {}, RSI : {}, 상단 볼린저밴드 값 : {}",
              order.getMarket().replace("KRW-", ""),
              String.format("%,.2f", purchaseCoinKrw),
              String.format("%,.2f",
                  currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                      ? Double.parseDouble(account.getBalance())
                      : Double.parseDouble(account.getLocked())) / 0.9995d),
              String.format("%,.2f",
                  (currentBidPrice * (Double.parseDouble(account.getBalance()) > 0d
                      ? Double.parseDouble(account.getBalance())
                      : Double.parseDouble(account.getLocked())) / 0.9995d) - purchaseCoinKrw),
              rsi,
              bollingerBandValue.get(0)
          );

        }
      } else if (avgBuyPrice * askLossRateValue > currentBidPrice) {
        double purchaseCoinKrw = accountService.getPurchaseCoinKrw(account.getCurrency());
        Order order = orderService.askMarketCoin(account.getCurrency(),
            Double.parseDouble(account.getBalance()) > 0d ? account.getBalance()
                : account.getLocked());

        if (order.isSuccess()) {
          log.info("[손절매도] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 차액 : {}, 손절설정값 : {}",
              order.getMarket().replace("KRW-", ""),
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
              askLossRateValue
          );
        }

      } else if (limitAskOrderTime.isBefore(
          LocalDateTime.now().minusSeconds(askTimeoutLimitValue))) {
        double purchaseCoinKrw = accountService.getPurchaseCoinKrw(account.getCurrency());
        Order order = orderService.askMarketCoin(account.getCurrency(),
            Double.parseDouble(account.getBalance()) > 0d ? account.getBalance()
                : account.getLocked());
        if (order.isSuccess()) {
          log.info("[시간초과] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 차액 : {}, 시간설정값 : {}초",
              order.getMarket().replace("KRW-", ""),
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
              askTimeoutLimitValue
          );

        }
      }
    }
  }

}
