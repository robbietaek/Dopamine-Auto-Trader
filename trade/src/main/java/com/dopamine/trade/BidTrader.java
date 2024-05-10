package com.dopamine.trade;

import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.dao.OrderDao;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import com.dopamine.trade.service.QuotationService;
import java.util.List;
import java.util.Map;
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
  private final OrderDao orderDao;

  @Scheduled(fixedDelay = 3383)
  public void bidTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    List<String> coinOwnList = coinAccountList.stream().map(Accounts::getCurrency).toList();

    if (coinOwnList.isEmpty() || coinOwnList.size() == 0) {
      orderDao.updateOrderIsExpired();
    }

    int coinOwnCount = coinAccountList.size();
    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));
    if (coinOwnCount < coinOwnLimit) {

      double krw = accountService.getKRWStatus();
      if (krw <= 5000d) {
        return;
      }

      Map<String, List<String>> askCoinMap = quotationService.getBidCoinList(krw, coinAccountList,
          coinOwnLimit - coinOwnCount);
      if (askCoinMap.isEmpty()) {
        return;
      }

      for (String market : askCoinMap.keySet()) {
        Order order = orderService.bidFokCoin(market,
            krw * 0.999d * ((100d / (coinOwnLimit - coinOwnCount)) / 100d));
        double afterKrw = accountService.getKRWStatus();
        if (order.isSuccess() && krw != afterKrw) {
          orderDao.insertBidOrderInformation(order);
          coinOwnCount++;
          krw = accountService.getKRWStatus();
          log.info("[매수완료] 코인명 : {}, RSI : {}, 하단 볼린저밴드 값 : {}",
              market.replace("KRW-", ""),
              askCoinMap.get(market).get(0),
              askCoinMap.get(market).get(1));
        }

        if (coinOwnCount == coinOwnLimit) {
          break;
        }

      }
    }
  }

}
