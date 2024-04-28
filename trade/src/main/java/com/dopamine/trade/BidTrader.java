package com.dopamine.trade;

import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.dao.OrderDao;
import com.dopamine.trade.model.OrderHistory;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import com.dopamine.trade.service.QuotationService;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
  private final OrderDao orderDao;

  public static Set<String> ownCoin = new HashSet<>();

  @Scheduled(fixedDelay = 2383)
  public void bidTrader() {
    List<Accounts> coinAccountList = accountService.getCoinAccountList();
    List<String> coinOwnList = coinAccountList.stream().map(Accounts::getCurrency).toList();

    if (ownCoin.isEmpty() && coinOwnList.isEmpty()) {
      orderDao.updateAskLimitCoinOrderHistoryExpired();
    } else if (ownCoin.isEmpty() && coinOwnList.size() > 0) {
      ownCoin.addAll(coinOwnList);
    }

    int coinOwnCount = coinAccountList.size();
    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));
    if (coinOwnCount < coinOwnLimit) {

      for (String market : ownCoin.stream().filter(market -> !coinOwnList.contains(market))
          .toList()) {
        OrderHistory orderHistory = orderDao.selectLastOrderHistory(market,
            OrderSide.ASK.getValue(), OrderType.LIMIT.getValue());

        if (orderHistory == null) {
          ownCoin.remove(market);
          break;
        }
        orderDao.updateCoinOrderHistoryExpiredByUuid(orderHistory.getUuid());

        log.info("[익절매도] 코인명 : {}, 구매금액 : {}, 정산금액 : {}, 이득금액 : {}, 차트종류 : {}", market,
            String.format("%,.2f",
                (Double.parseDouble(orderHistory.getPrice()) / (
                    Double.parseDouble(orderHistory.getProfitRate()) - 0.0005d))
                    * Double.parseDouble(
                    orderHistory.getVolume())
            ),
            String.format("%,.2f", Double.parseDouble(orderHistory.getPrice()) * Double.parseDouble(
                orderHistory.getVolume()) / 1.0005d),
            String.format("%,.2f",
                (Double.parseDouble(orderHistory.getPrice()) * Double.parseDouble(
                    orderHistory.getVolume()) / 1.0005d)
                    - (Double.parseDouble(orderHistory.getPrice()) / (
                    Double.parseDouble(orderHistory.getProfitRate()) - 0.0005d))
                    * Double.parseDouble(
                    orderHistory.getVolume())
            ),
            orderHistory.getChartType()
        );
        double currentTotalAccountKrw = accountService.getCurrentTotalAccountKrw();
        log.info("[자산가치] : {}원", String.format("%,.0f", currentTotalAccountKrw));
        ownCoin.remove(market);
      }

      double krw = accountService.getKRWStatus();
      if (krw <= 5000d) {
        return;
      }

      Map<String, String> askCoinMap = quotationService.getBidCoinList(krw);

      if (askCoinMap.isEmpty()) {
        return;
      }

      double currentTotalAccountKrw = accountService.getCurrentTotalAccountKrw();

      for (String market : askCoinMap.keySet()) {
        if (coinAccountList.stream().map(Accounts::getCurrency).collect(Collectors.toList())
            .contains(market)) {
          continue;
        }
        krw = accountService.getKRWStatus();
        Order order = orderService.bidFokCoin(market, askCoinMap.get(market),
            krw * 0.999d * ((100d / (coinOwnLimit - coinOwnCount)) / 100d));
        if (order.isSuccess()) {
          coinOwnCount++;
          krw = accountService.getKRWStatus();
          ownCoin.add(market);
        }

        if (coinOwnCount == coinOwnLimit) {
          break;
        }

      }
    }
  }

}
