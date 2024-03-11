package com.dopamine.tool;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CalcUnit {

  public static Map<String, String> exchangePriceVolumeUnit(String market, double krw) {
    CurrentPrice currentPrice = QuotationRequestManager.getTickerCurrentPrice(List.of(market))
        .get(0);
    Map<String, String> returnMap = new HashMap<>();

    double tradePrice = currentPrice.getTradePrice();
    String price = "";

    if (tradePrice >= 1000000) {
      price = String.valueOf((Math.floor(krw * 0.001) / 0.001));
      price = price.substring(0, price.indexOf("."));
    } else if (tradePrice >= 100000) {
      price = String.valueOf((Math.floor(krw * 0.01) / 0.01));
      price = price.substring(0, price.indexOf("."));
    } else if (tradePrice >= 10000) {
      price = String.valueOf((Math.floor(krw * 0.1) / 0.1));
      price = price.substring(0, price.indexOf("."));
    } else if (tradePrice >= 1000) {
      price = String.valueOf((Math.floor(krw)));
      price = price.substring(0, price.indexOf("."));
    } else if (tradePrice >= 100) {
      price = String.valueOf((Math.floor(krw * 10) / 10));
    } else if (tradePrice >= 10) {
      price = String.valueOf((Math.floor(krw * 100) / 100));
    } else if (tradePrice >= 1) {
      price = String.valueOf((Math.floor(krw * 1000) / 1000));
    } else if (tradePrice >= 0.1d) {
      price = String.valueOf((Math.floor(krw * 10000) / 10000));
    } else if (tradePrice >= 0.01d) {
      price = String.valueOf((Math.floor(krw * 100000) / 100000));
    } else if (tradePrice >= 0.001d) {
      price = String.valueOf((Math.floor(krw * 1000000) / 1000000));
    } else if (tradePrice >= 0.0001d) {
      price = String.valueOf((Math.floor(krw * 1000000) / 10000000));
    }

    String volume = String.valueOf(Double.valueOf(price) / tradePrice);

    returnMap.put("price", price);
    returnMap.put("volume", volume);
    returnMap.put("tradePrice", String.valueOf(tradePrice));

    return returnMap;
  }

  public static double exchangeMarketUnit(double orderBook) {
    Map<String, String> returnMap = new HashMap<>();

    String price = "";

    if (orderBook >= 1000000) {
      price = String.valueOf((Math.floor(orderBook * 0.001) / 0.001));
      price = price.substring(0, price.indexOf("."));
    } else if (orderBook >= 100000) {
      price = String.valueOf((Math.floor(orderBook * 0.01) / 0.01));
      price = price.substring(0, price.indexOf("."));
    } else if (orderBook >= 10000) {
      price = String.valueOf((Math.floor(orderBook * 0.1) / 0.1));
      price = price.substring(0, price.indexOf("."));
    } else if (orderBook >= 1000) {
      price = String.valueOf((Math.floor(orderBook)));
      price = price.substring(0, price.indexOf("."));
    } else if (orderBook >= 100) {
      price = String.valueOf((Math.floor(orderBook * 10) / 10));
    } else if (orderBook >= 10) {
      price = String.valueOf((Math.floor(orderBook * 100) / 100));
    } else if (orderBook >= 1) {
      price = String.valueOf((Math.floor(orderBook * 1000) / 1000));
    } else if (orderBook >= 0.1d) {
      price = String.valueOf((Math.floor(orderBook * 10000) / 10000));
    } else if (orderBook >= 0.01d) {
      price = String.valueOf((Math.floor(orderBook * 100000) / 100000));
    } else if (orderBook >= 0.001d) {
      price = String.valueOf((Math.floor(orderBook * 1000000) / 1000000));
    } else if (orderBook >= 0.0001d) {
      price = String.valueOf((Math.floor(orderBook * 1000000) / 10000000));
    }

    return Double.parseDouble(price);
  }

}
