package com.dopamine.trade;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.api_call.type.Side;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import com.dopamine.trade.service.QuotationService;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AutoTrader {

  private final AccountService accountService;
  private final OrderService orderService;
  private final QuotationService quotationService;

  static Queue<String> exceptionCoin = new LinkedList<>();

  @Scheduled(cron = "*/1 * * * * *")
  public void autoTrading() {

    List<Accounts> coinAccountList = accountService.getCoinAccountList();

    if (coinAccountList.size() == 0) {
      double krw = accountService.getKRWStatus();
      List<String> askCoinList = quotationService.getBidCoinList(krw);
      for (String market : askCoinList) {
        if (exceptionCoin.contains(market)) {
          continue;
        }

        if (exceptionCoin.size() > 3) {
          exceptionCoin.poll();
        }

        Order order = orderService.orderCoin(market, Side.BID, null, krw * 0.99, OrderType.PRICE);
        log.info("[매수주문완료] 코인명 : {}, 고유아이디 : {}", order.getMarket(), order.getUuid());

        exceptionCoin.add(market);
        break;
      }
    } else {
      for (Accounts account : coinAccountList) {
        double avgBuyPrice = Double.parseDouble(account.getAvgBuyPrice());
        CurrentPrice currentPrice = QuotationRequestManager.getTickerCurrentPrice(
            List.of(account.getCurrency())).get(0);
        if (avgBuyPrice * 1.003 < currentPrice.getTradePrice()) {
          Order order = orderService.orderCoin(account.getCurrency(), Side.ASK,
              account.getBalance(),
              1000000000d,
              OrderType.MARKET);
          log.info("[익절매도 주문완료] 코인명 : {}, 매도 가격 : {}, 고유아이디 : {}", order.getMarket(),
              order.getPrice(),
              order.getUuid());
          continue;
        } else if (avgBuyPrice * 0.97 > currentPrice.getTradePrice()) {
          Order order = orderService.orderCoin(account.getCurrency(), Side.ASK,
              account.getBalance(),
              1000000000d,
              OrderType.MARKET);
          log.info("[손절매도 주문완료] 코인명 : {}, 매도 가격 : {}, 고유아이디 : {}", order.getMarket(),
              order.getPrice(),
              order.getUuid());
          continue;
        }

//        log.info("[매도대기] 코인명 : {}, 구매 가격 : {}, 현재 가격 : {}", "KRW-" + account.getCurrency(),
//            avgBuyPrice, currentPrice.getTradePrice());
      }
    }


  }

}
