package com.dopamine.trade;

import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import com.dopamine.trade.service.QuotationService;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BidTrader {

  private final AccountService accountService;
  private final OrderService orderService;
  private final QuotationService quotationService;
  private final CommonService commonService;

  public static Queue<String> exceptCoin = new LinkedList<>();


  @Scheduled(fixedDelay = 2383)
  public void bidTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    int coinOwnCount = coinAccountList.size();
    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));
    if (coinOwnCount < coinOwnLimit) {
      double krw = accountService.getKRWStatus();
      if (krw <= 5000d) {
        return;
      }

      List<String> askCoinList = quotationService.getBidCoinList(krw);
      if (askCoinList.isEmpty()) {
        return;
      }

      for (String market : askCoinList) {
        if (coinAccountList.stream().map(Accounts::getCurrency).collect(Collectors.toList())
            .contains(market) || exceptCoin.contains(market)) {
          continue;
        }

        Order order = orderService.bidPriceCoin(market,
            krw * 0.999d * ((100d / (coinOwnLimit - coinOwnCount)) / 100d));
        if (order.isSuccess()) {
          coinOwnCount++;
          krw = accountService.getKRWStatus();

          if (exceptCoin.size() > coinOwnLimit / 2) {
            exceptCoin.poll();
          }

          if (!exceptCoin.contains(market)) {
            exceptCoin.add(market);
          }

        } else {
          log.info("매수 실패 : {}", order);
        }
        if (coinOwnCount == coinOwnLimit) {
          break;
        }

      }
    }
  }

}
