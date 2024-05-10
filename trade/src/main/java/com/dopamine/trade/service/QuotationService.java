package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.quotation.candle.Candle;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.api_call.model.response.statistics.UpbitMarketIndex;
import com.dopamine.common.service.CommonService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuotationService {

  private final CommonService commonService;
  private final ChartResearchService chartResearchService;
  private final StatisticsService statisticsService;

  public Map<String, List<String>> getBidCoinList(Double krw, List<Accounts> coinAccountList,
      int ownLimit) {

    Map<String, List<String>> marketMap = new LinkedHashMap<>();
    List<CurrentPrice> currentPriceList = new ArrayList<>();
    String pickMarket = commonService.getConfig("BID", "pick_market").trim();

    if (StringUtils.isNoneEmpty(pickMarket)) {
      List<String> pickMarketList = Arrays.asList(pickMarket.trim().split(","));
      currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
              pickMarketList.stream().filter(market -> StringUtils.isNoneEmpty(market))
                  .map(market -> "KRW-" + market.trim().toUpperCase())
                  .collect(Collectors.toList()))
          .stream()
          .collect(Collectors.toList());

    } else {
      Map<String, Double> marketFearMap = statisticsService.getFearGreed()
          .getMarketFearScoreMap();
      if (marketFearMap.isEmpty()) {
        return marketMap;
      }

      UpbitMarketIndex upbitAltMarketIndex = statisticsService.getUpbitAltMarketIndex();
      if (upbitAltMarketIndex == null || upbitAltMarketIndex.getChange().equals("FALL")) {
        return marketMap;
      }

      List<MarketCode> marketCodeList = QuotationRequestManager.getMarketCodeList().stream()
          .filter(market -> market.getMarket().startsWith("KRW")).toList();

      if (marketCodeList == null || marketCodeList.isEmpty()) {
        return marketMap;
      }

      currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
              marketCodeList.stream().map(MarketCode::getMarket).collect(Collectors.toList())).stream()
          .filter(market -> market.getAccTradePrice24h() >= 4.000000000000000E10d)
          .filter(market -> Objects.nonNull(marketFearMap.get(market.getMarket()))
              && marketFearMap.get(market.getMarket()) >= 40d
              && marketFearMap.get(market.getMarket()) < 60d)
          .sorted(Comparator.comparing(CurrentPrice::getAccTradePrice24h).reversed())
          .collect(Collectors.toList());
    }

    for (CurrentPrice currentPrice : currentPriceList) {
      if (marketMap.size() >= ownLimit) {
        break;
      }

      if (currentPrice.getTradePrice() > 1000000d) {
        continue;
      }

      if (coinAccountList.stream().map(Accounts::getCurrency).collect(Collectors.toList())
          .contains(currentPrice.getMarket())) {
        continue;
      }

      String candleUnit = commonService.getConfig("BID", "candle_unit").trim();
      List<Candle> minuteCandleList = QuotationRequestManager.getMinuteCandleList(
          currentPrice.getMarket(), "200",
          candleUnit);
      List<Candle> dayCandleList = QuotationRequestManager.getDayCandleList(
          currentPrice.getMarket(), "5");
      if (minuteCandleList == null || minuteCandleList.isEmpty() || dayCandleList == null
          || dayCandleList.isEmpty()) {
        continue;
      }

      double rsi = chartResearchService.getRsiByMinutes(minuteCandleList, 20);
      if (rsi > 50) {
        continue;
      }

      List<Double> bollingerBandValue = chartResearchService.getBollingerBandByMinutes(
          minuteCandleList, 20,
          2);
      boolean isBottomBollingerBandValue =
          minuteCandleList.get(0).getTradePrice() <= bollingerBandValue.get(2);
      if (!isBottomBollingerBandValue) {
        continue;
      }

      boolean isPositiveMovingAverage = chartResearchService.isPositiveMovingAverage(dayCandleList,
          5);
      if (!isPositiveMovingAverage) {
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

      marketMap.put(currentPrice.getMarket(),
          List.of(String.valueOf(rsi), String.valueOf(bollingerBandValue.get(2))));
    }
    return marketMap;
  }

}
