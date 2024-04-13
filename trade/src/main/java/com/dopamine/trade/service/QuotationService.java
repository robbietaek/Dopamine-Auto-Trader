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
            bidCoinList).stream()
        .sorted(Comparator.comparing(CurrentPrice::getAccTradePrice24h).reversed()).limit(30)
        .toList();

    bidCoinList.clear();
    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));

    for (CurrentPrice currentPrice : currentPriceList) {
      boolean isTailCandle = false;
      if (currentPrice.getTradePrice() > 1000000d) {
        continue;
      }

      if (bidCoinList.size() > coinOwnLimit * 2) {
        break;
      }

      List<Minute> minuteCandleList = QuotationRequestManager.getMinuteCandleList(
          currentPrice.getMarket(), "2", "1");
      Minute currentCandle = minuteCandleList.get(0);
      Minute beforeOneMinuteCandle = minuteCandleList.get(1);

      double openingPrice = beforeOneMinuteCandle.getOpeningPrice();
      double tradePrice = beforeOneMinuteCandle.getTradePrice();
      double highPrice = beforeOneMinuteCandle.getHighPrice();
      double lowPrice = beforeOneMinuteCandle.getLowPrice();

      if (lowPrice < tradePrice
          && currentCandle.getTradePrice() > beforeOneMinuteCandle.getTradePrice()) {
        double highPriceSubLowPrice = Math.abs(highPrice - lowPrice);

        if (openingPrice > tradePrice) {
          double openingPriceSubHighPrice = Math.abs(openingPrice - highPrice);
          double tradePriceSubLowPrice = Math.abs(tradePrice - lowPrice);

          if (openingPriceSubHighPrice < tradePriceSubLowPrice
              && (highPriceSubLowPrice * 0.5 < tradePriceSubLowPrice)) {
            isTailCandle = true;
          }

        } else if (tradePrice > openingPrice) {
          double tradePriceSubHighPrice = Math.abs(tradePrice - highPrice);
          double openingPriceSubLowPrice = Math.abs(openingPrice - lowPrice);

          if (tradePriceSubHighPrice < openingPriceSubLowPrice
              && (highPriceSubLowPrice * 0.5 < openingPriceSubLowPrice)) {
            isTailCandle = true;
          }
        }
      }

      if (!isTailCandle) {
        continue;
      }

      OrderAvailable orderAvailable = OrderRequestManager.getOrderAvailable(
          currentPrice.getMarket());
      if (orderAvailable == null) {
        continue;
      }
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
