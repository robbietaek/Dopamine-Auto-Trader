package com.dopamine.trade;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.order_book.OrderBook;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import com.dopamine.trade.service.QuotationService;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AutoTrader {

  private final AccountService accountService;
  private final OrderService orderService;
  private final QuotationService quotationService;
  private final CommonService commonService;

  static Queue<String> exceptionCoin = new LinkedList<>();
  public static StopWatch stopWatch = new StopWatch();

  @Scheduled(fixedDelay = 100)
  public void autoTrading() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();

    if (coinAccountList.size() == 0) {
      double krw = accountService.getKRWStatus();
      log.info("현금보유량 : {}", krw);
      List<String> askCoinList = quotationService.getBidCoinList(krw);
      for (String market : askCoinList) {
        if (exceptionCoin.contains(market)) {
          continue;
        }
        if (exceptionCoin.size() > 3) {
          exceptionCoin.poll();
        }

        Order order = orderService.bidPriceCoin(market, krw * 0.999);

        if (order.isSuccess()) {
          log.info("[매수주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(), order.getUuid());
          stopWatch.reset();
          stopWatch.start();

          exceptionCoin.add(market);
          break;
        }

      }
    } else {
      double askProfitRateValue = Double.parseDouble(commonService.getConfig("ASK", "profit_rate"));
      double askLossRateValue = Double.parseDouble(commonService.getConfig("ASK", "loss_rate"));
      double askTimeLimitSecond = Integer.parseInt(commonService.getConfig("ASK", "time_limit"));

      for (Accounts account : coinAccountList) {
        if (!exceptionCoin.contains("KRW-" + account.getCurrency())) {
          exceptionCoin.add("KRW-" + account.getCurrency());
        }

        double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
        OrderBook currentPrice = QuotationRequestManager.getOrderBookList(
            List.of(account.getCurrency())).get(0);
        Double currentBidPrice = currentPrice.getOrderbookUnits().get(0).getBidPrice();

        if (avgBuyPrice * askProfitRateValue < currentBidPrice) {
          Order order = orderService.askLimitCoin(account.getCurrency(),
              account.getBalance(), currentBidPrice);
          if (order.isSuccess()) {
            log.info("[익절매도 주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(), order.getUuid());
          }

        } else if (avgBuyPrice * askLossRateValue > currentBidPrice) {
          orderService.cancelOrder(orderService.getLastOrderUuid());
          Order order = orderService.askMarketCoin(account.getCurrency(),
              account.getBalance());
          if (order.isSuccess()) {
            log.info("[손절매도 주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(),
                order.getUuid());
            stopWatch.stop();
          }

        } else if (stopWatch.getTime(TimeUnit.SECONDS) > askTimeLimitSecond) {
          orderService.cancelOrder(orderService.getLastOrderUuid());
          Order order = orderService.askMarketCoin(account.getCurrency(),
              account.getBalance());
          if (order.isSuccess()) {
            log.info("[시간초과 손절매도 주문완료] 코인명 : {}, 고유아이디 : {}, 제한시간초 : {}", order.getMarket(),
                order.getUuid(), askTimeLimitSecond);
            stopWatch.stop();
          }
        }
      }
    }


  }

}
