package com.dopamine.trade;

import com.dopamine.api_call.AccountRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import com.dopamine.trade.service.QuotationService;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
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

  public static Queue<String> exceptCoinQueue = new LinkedList();
  public static Map<String, String> bidList = new HashMap<>();

  @Async
  @Scheduled(fixedRate = 1691)
  public void bidTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    int coinOwnCount = coinAccountList.size();
    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));
    if (coinOwnCount < coinOwnLimit) {
      double krw = accountService.getKRWStatus();
      List<String> askCoinList = quotationService.getBidCoinList(krw);
      if (askCoinList.isEmpty()) {
        return;
      }

      for (String market : askCoinList) {
        if (exceptCoinQueue.contains(market)
            || coinAccountList.stream().map(Accounts::getCurrency).collect(Collectors.toList())
            .contains(market)) {
          continue;
        }

        Order order = orderService.bidPriceCoin(market,
            krw * 0.999d * ((100d / (coinOwnLimit - coinOwnCount)) / 100d));
        if (order.isSuccess()) {
          log.info("[매수주문] 코인명 : {}, 구매총액 : {}", order.getMarket(), order.getPrice());
          bidList.put(order.getMarket(), order.getUuid());
          if (!exceptCoinQueue.contains(market)) {
            exceptCoinQueue.add(market);
          }
          coinOwnCount++;
          krw = accountService.getKRWStatus();
        }

        if (exceptCoinQueue.size() > coinOwnLimit) {
          exceptCoinQueue.poll();
        }

        if (coinOwnCount == coinOwnLimit) {
          break;
        }

      }
    }
  }

}
