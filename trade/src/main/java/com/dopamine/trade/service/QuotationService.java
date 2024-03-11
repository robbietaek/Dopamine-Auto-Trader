package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.quotation.candles.minute.Minute;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.common.service.CommonService;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuotationService {

  private final CommonService commonService;

  public List<String> getBidCoinList(Double krw) {
    List<MarketCode> marketCodeList = QuotationRequestManager.getMarketCodeList();
    List<String> bidCoinList = new LinkedList<>();

    for (MarketCode marketCode : marketCodeList) {
      //소수 계정에 집중되어있음
      boolean concentrationOfSmallAccounts = marketCode.getMarketEvent().getCaution()
          .isConcentrationOfSmallAccounts();

      if (!concentrationOfSmallAccounts
          && marketCode.getMarket()
          .startsWith("KRW")) {
        bidCoinList.add(marketCode.getMarket());
      }
    }

    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
            bidCoinList).stream().filter(a -> a.getChange().equals("RISE"))
        .sorted(Comparator.comparing(CurrentPrice::getSignedChangeRate).reversed()).toList();
    bidCoinList.clear();
    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));

    for (CurrentPrice currentPrice : currentPriceList) {

      if (currentPrice.getTradePrice() > 1000000d) {
        continue;
      }

      if (bidCoinList.size() > coinOwnLimit * 3) {
        break;
      }

      List<Minute> minuteCandleList = QuotationRequestManager.getMinuteCandleList(
          currentPrice.getMarket(), "2");

      double tradePrice = 0d;
      boolean pass = true;
      for (Minute minute : minuteCandleList) {
        if (tradePrice == 0d) {
          tradePrice = minute.getTradePrice();
          continue;
        }

        if (tradePrice >= minute.getTradePrice()) {
          tradePrice = minute.getTradePrice();
        } else {
          pass = false;
          break;
        }
      }

      if (!pass) {
        continue;
      }

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

      bidCoinList.add(currentPrice.getMarket());
    }
    return bidCoinList;
  }


}
