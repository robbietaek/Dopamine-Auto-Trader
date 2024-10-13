package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.quotation.candle.Candle;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.common.service.CommonService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  public List<String> getBidCoinList(Double krw, List<Accounts> coinAccountList) {
    List<CurrentPrice> currentPriceList = new ArrayList<>();
    String pickMarket = commonService.getConfig("BID", "pick_market").trim();

    if (StringUtils.isNoneEmpty(pickMarket)) {
      // 코인을 지정한 경우
      List<String> pickMarketList = Arrays.asList(pickMarket.trim().split(","));
      currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
              pickMarketList.stream().filter(market -> StringUtils.isNoneEmpty(market))
                  .map(market -> "KRW-" + market.trim().toUpperCase())
                  .collect(Collectors.toList()))
          .stream()
          .collect(Collectors.toList());

    } else {
      // 코인을 지정하지 않은 경우
      List<MarketCode> marketCodeList = QuotationRequestManager.getMarketCodeList().stream()
          .filter(market -> market.getMarket().startsWith("KRW")).toList();

      if (marketCodeList == null || marketCodeList.isEmpty()) {
        return new ArrayList<>();
      }

      currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
              marketCodeList.stream().map(MarketCode::getMarket).collect(Collectors.toList())).stream()
          .filter(market -> market.getAccTradePrice24h() >= 2.000000000000000E10d)
          .sorted(Comparator.comparing(CurrentPrice::getAccTradePrice24h).reversed())
          .collect(Collectors.toList());
    }

    Map<String, Double> coinRaiseMap = new HashMap<>();

    for (CurrentPrice currentPrice : currentPriceList) {
      OrderAvailable orderAvailable = OrderRequestManager.getOrderAvailable(
          currentPrice.getMarket());
      if (orderAvailable == null) {
        continue;
      }

      if (Double.parseDouble(orderAvailable.getMarket().getAsk().getMinTotal()) > krw) {
        continue;
      }

      if (currentPrice.getTradePrice() > 1000000d) {
        continue;
      }

      if (coinAccountList.stream().map(Accounts::getCurrency).collect(Collectors.toList())
          .contains(currentPrice.getMarket())) {
        continue;
      }

      List<Candle> bitCoinCandleList = QuotationRequestManager.getDayCandleList(
          currentPrice.getMarket(), "120");
      if (bitCoinCandleList == null || bitCoinCandleList.isEmpty()) {
        continue;
      }

      boolean isPositiveMoving = chartResearchService.isPositiveMovingAverage(bitCoinCandleList,
          bitCoinCandleList.size());
      if (!isPositiveMoving) {
        continue;
      }

      List<Candle> dayCandleList = QuotationRequestManager.getDayCandleList(
          currentPrice.getMarket(), "7");
      if (dayCandleList == null || dayCandleList.isEmpty()) {
        continue;
      }

      double currentTradePrice = dayCandleList.get(0).getTradePrice();
      double servenDayBeforeTradePrice = dayCandleList.get(dayCandleList.size() - 1)
          .getTradePrice();
      double divPercent = (currentTradePrice / servenDayBeforeTradePrice) * 100;
      if (divPercent < 100d) {
        continue;
      }

      coinRaiseMap.put(currentPrice.getMarket(), divPercent);
    }

    List<String> marketList = new ArrayList<>(coinRaiseMap.keySet());
    marketList.sort((o1, o2) -> coinRaiseMap.get(o2).compareTo(coinRaiseMap.get(o1)));

    return marketList;
  }

}