package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class QuotationService {

  public List<String> getAskCoinList(Double krw) {
    List<MarketCode> marketCodeList = QuotationRequestManager.getMarketCodeList();
    List<String> askCoinList = new LinkedList<>();

    for (MarketCode marketCode : marketCodeList) {
      //가격 급등락
      boolean priceFluctuations = marketCode.getMarketEvent().getCaution().isPriceFluctuations();
      //거래량 급등
      boolean tradingVolumeSoaring = marketCode.getMarketEvent().getCaution()
          .isTradingVolumeSoaring();
      //입금량 급등
      boolean depositAmountSoaring = marketCode.getMarketEvent().getCaution()
          .isDepositAmountSoaring();
      //해외와 가격차이 경보
      boolean globalPricedifferences = marketCode.getMarketEvent().getCaution()
          .isGlobalPricedifferences();
      //소수 계정에 집중되어있음
      boolean concentrationOfSmallAccounts = marketCode.getMarketEvent().getCaution()
          .isConcentrationOfSmallAccounts();

      if (!priceFluctuations
          && !concentrationOfSmallAccounts
          && marketCode.getMarket()
          .startsWith("KRW")) {
        askCoinList.add(marketCode.getMarket());
      }
    }

    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
            askCoinList).stream().filter(a -> a.getChange().equals("RISE"))
        .sorted(Comparator.comparing(CurrentPrice::getSignedChangeRate).reversed()).toList();
    askCoinList.clear();

    for (CurrentPrice currentPrice : currentPriceList) {
      OrderAvailable orderAvailable = OrderRequestManager.getOrderAvailable(
          currentPrice.getMarket());

      if (Double.parseDouble(orderAvailable.getBidFee()) > 0.0005d
          || Double.parseDouble(orderAvailable.getAskFee()) > 0.0005d) {
        continue;
      }

      if (!orderAvailable.getMarket().getAskTypes().contains("limit")
          || !orderAvailable.getMarket().getAskTypes().contains("market")
          || !orderAvailable.getMarket().getBidTypes().contains("limit")
          || !orderAvailable.getMarket().getBidTypes().contains("price")
          || !orderAvailable.getMarket().getOrderSides().contains("ask")
          || !orderAvailable.getMarket().getOrderSides().contains("bid")) {
        continue;
      }

      if (Double.parseDouble(orderAvailable.getMarket().getAsk().getMinTotal()) > krw) {
        continue;
      }

      askCoinList.add(currentPrice.getMarket());
    }

    return askCoinList;
  }


}
