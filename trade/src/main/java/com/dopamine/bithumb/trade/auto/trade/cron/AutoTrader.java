package com.dopamine.bithumb.trade.auto.trade.cron;

import com.dopamine.bithumb.trade.auto.model.account.Account;
import com.dopamine.bithumb.trade.auto.model.ask_price.AskPriceDetail;
import com.dopamine.bithumb.trade.auto.model.buy.Buy;
import com.dopamine.bithumb.trade.auto.model.order_success_info.OrderSuccessInfo;
import com.dopamine.bithumb.trade.auto.trade.cron.service.TradeService;
import com.dopamine.bithumb.trade.auto.type.CoinName;
import com.dopamine.bithumb.trade.common.ApiCaller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AutoTrader {

  private final TradeService tradeService;

  private static List<String> tradedList = new ArrayList<>();

  @Value("${bithumb.apiKey}")
  private String apiKey;
  @Value("${bithumb.apiSecret}")
  private String apiSecret;

  //  @Scheduled(cron = "*/1 * * * * *")
  public void autoTrading() {

    Account account = ApiCaller.getAccountInfo(apiKey, apiSecret);
    Map<String, Double> myCoinMap = account.getData().getMyCoinMap();
    Double krw = myCoinMap.get("KRW");
    myCoinMap.remove("KRW");

    if (!myCoinMap.isEmpty()) {
      for (String coinName : myCoinMap.keySet()) {
        OrderSuccessInfo orderSuccessInfo = ApiCaller.getOrderSuccessInfo(apiKey, apiSecret, "1",
            coinName);
        String boughtUnits = orderSuccessInfo.getData().get(0).getUnits();
        double boughtPrice = orderSuccessInfo.getData().get(0).getPrice();
        AskPriceDetail askPriceDetail = ApiCaller.getAskPrice().getData().getCoinAskPrice(coinName);
        Double buyRequestPrice = Double.parseDouble(askPriceDetail.getBids().get(0).getPrice());
        Double sellRequestPrice = Double.parseDouble(askPriceDetail.getAsks().get(0).getPrice());
        // 수수료보다 많이 벌었으면
        if (boughtPrice * 1.003 < buyRequestPrice) {
          ApiCaller.addCurrentPriceSellOrder(apiKey, apiSecret, boughtUnits, coinName);
          log.info("[익절매도] 코인 이름 : {}, 구매가격 : {}, 판매가격 : {}, 판매량 : {}", coinName, boughtPrice,
              buyRequestPrice,
              boughtUnits);
          tradedList.add(coinName);
        } else if (boughtPrice * 0.96 > buyRequestPrice) {
          ApiCaller.addCurrentPriceSellOrder(apiKey, apiSecret, boughtUnits, coinName);
          log.info("[손절매도] 코인 이름 : {}, 구매가격 : {}, 판매가격 : {}, 판매량 : {}", coinName, boughtPrice,
              buyRequestPrice,
              boughtUnits);
          tradedList.add(coinName);
        } else {
//          log.info("[매도대기] 코인 이름 : {}, 구매가격 : {}, 현재가격 : {}", coinName, boughtPrice,
//              buyRequestPrice);
        }
      }
    } else {
      log.info("현재 원화 : {}", krw);
      CoinName coin;
      if (tradedList.isEmpty()) {
        coin = tradeService.getMostFluctateCoinName(null);
      } else {
        coin = tradeService.getMostFluctateCoinName(tradedList.get(0));
        log.info("[일시적 제외코인] 코인 이름 : {}", tradedList.get(0));
        tradedList.clear();
      }
      AskPriceDetail askPriceDetail = ApiCaller.getAskPrice().getData()
          .getCoinAskPrice(coin.name());
      Double sellRequestPrice = Double.parseDouble(askPriceDetail.getAsks().get(0).getPrice());
      String toBuyUnits = String.format("%.5f", (krw / sellRequestPrice) * 0.75);
      Buy buyReceipt = ApiCaller.addCurrentPriceBuyOrder(apiKey, apiSecret, toBuyUnits,
          coin.name());
      if (buyReceipt.getMessage() == null) {
        log.info("[코인매수 성공] 코인 이름 : {}, 주문가격 : {}, 주문량 : {}", coin.name(), sellRequestPrice,
            toBuyUnits);
      } else {
        log.info("[코인매수 실패] 코인 이름 : {}, 주문가격 : {}, 주문량 : {}, 사유 : {}", coin.name(),
            sellRequestPrice,
            toBuyUnits, buyReceipt.getMessage());
      }


    }


  }

}
