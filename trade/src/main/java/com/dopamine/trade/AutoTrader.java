package com.dopamine.trade;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
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

  @Scheduled(cron = "*/1 * * * * *")
  public void autoTrading() {

    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();

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
        log.info("[매수주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(), order.getUuid());
        stopWatch.reset();
        stopWatch.start();

        exceptionCoin.add(market);
        break;
      }
    } else {
      double askRateValue = Double.parseDouble(commonService.getConfig("ASK", "rate"));
      double bidRateValue = Double.parseDouble(commonService.getConfig("BID", "rate"));
      double askTimeLimitSecond = Integer.parseInt(commonService.getConfig("ASK", "time_limit"));

      for (Accounts account : coinAccountList) {
        if (!exceptionCoin.contains("KRW-" + account.getCurrency())) {
          exceptionCoin.add("KRW-" + account.getCurrency());
        }

        double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
        CurrentPrice currentPrice = QuotationRequestManager.getOneTickerCurrentPrice(
            account.getCurrency());
        if (avgBuyPrice * askRateValue < currentPrice.getTradePrice()) {
          Order order = orderService.askMarketCoin(account.getCurrency(),
              account.getBalance());
          log.info("[익절매도 주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(), order.getUuid());
        } else if (avgBuyPrice * bidRateValue > currentPrice.getTradePrice()) {
          Order order = orderService.askMarketCoin(account.getCurrency(),
              account.getBalance());
          log.info("[손절매도 주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(),
              order.getUuid());
          stopWatch.stop();
        } else if (stopWatch.getTime(TimeUnit.SECONDS) > askTimeLimitSecond) {
          Order order = orderService.askMarketCoin(account.getCurrency(),
              account.getBalance());
          log.info("[시간초과 손절매도 주문완료] 코인명 : {}, 고유아이디 : {}, 제한시간초 : {}", order.getMarket(),
              order.getUuid(), askTimeLimitSecond);
          stopWatch.stop();
        }
      }
    }


  }

}
