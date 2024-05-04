package com.dopamine.trade.service;

import static com.dopamine.tool.ShuffleStream.toShuffledList;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.common.service.CommonService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuotationService {

  private final CommonService commonService;
  private final CandleResearchService candleResearchService;
  private final StatisticsService statisticsService;

  public Map<String, String> getBidCoinList(Double krw) {
    List<MarketCode> marketCodeList = QuotationRequestManager.getMarketCodeList().stream()
        .filter(market -> market.getMarket().startsWith("KRW")).toList();

    Map<String, String> coinNameChartTypeMap = new LinkedHashMap<>();
    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
            marketCodeList.stream().map(MarketCode::getMarket).collect(Collectors.toList())).stream()
        .sorted(
            Comparator.comparing(CurrentPrice::getSignedChangeRate).reversed())
        .collect(Collectors.toList());

    int totalCount = currentPriceList.size();
    long currentRiseCoinCount = currentPriceList.stream()
        .filter(price -> price.getChange().equals("RISE")).count();
    double riseCoinPercent = Double.parseDouble(
        commonService.getConfig("BID", "rise_coin_percent"));
    if (currentRiseCoinCount < totalCount * riseCoinPercent) {
      return coinNameChartTypeMap;
    }

    String valueLevel = commonService.getConfig("BID", "value_level").trim();
    if (valueLevel.equals("상위")) {
      currentPriceList = new ArrayList<>(
          currentPriceList.subList(0, (int) ((double) totalCount * (1d / 3d))));
    } else if (valueLevel.equals("중위")) {
      currentPriceList = new ArrayList<>(
          currentPriceList.subList((int) ((double) totalCount * (1d / 3d)),
              (int) ((double) totalCount * (2d / 3d))));
    } else if (valueLevel.equals("하위")) {
      currentPriceList = new ArrayList<>(
          currentPriceList.subList((int) ((double) totalCount * (2d / 3d)),
              (int) ((double) totalCount * (3d / 3d))));
    }
    currentPriceList = currentPriceList.stream().collect(toShuffledList());

    int coinOwnLimit = Integer.parseInt(commonService.getConfig("BID", "coin_own_limit"));
    for (CurrentPrice currentPrice : currentPriceList) {
      if (currentPrice.getTradePrice() > 1000000d) {
        continue;
      }

      if (coinNameChartTypeMap.size() > coinOwnLimit * 2) {
        break;
      }

      String chartType = candleResearchService.getPositiveChartType(currentPrice.getMarket());

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

      coinNameChartTypeMap.put(currentPrice.getMarket(), chartType);
    }
    return coinNameChartTypeMap;
  }

}
