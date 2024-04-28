package com.dopamine.trade.service;

import static com.dopamine.tool.ShuffleStream.toShuffledList;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.api_call.model.response.statistics.UpbitMarketIndexCandle;
import com.dopamine.common.service.CommonService;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
    Map<String, String> coinNameChartTypeMap = new LinkedHashMap<>();
    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
        bidCoinList);

    List<UpbitMarketIndexCandle> upbitMarketIndexCandleList = statisticsService.getOneDayUpbitMarektIndexCandleList();
    double currentTradePrice = upbitMarketIndexCandleList.get(0).getTradePrice();
    double fiveMinuteBeforeTradePrice = upbitMarketIndexCandleList.get(1).getTradePrice();

    if (currentTradePrice < fiveMinuteBeforeTradePrice) {
      log.info("[주문대기] 현재 UBMI 차트 값 : {}, 5분 전 UBMI 차트 값 : {}", currentTradePrice,
          fiveMinuteBeforeTradePrice);
      return coinNameChartTypeMap;
    }

    long totalCount = currentPriceList.size();
    long currentRiseCoinCount = currentPriceList.stream()
        .filter(price -> price.getChange().equals("RISE")).count();
    double riseCoinPercent = Double.parseDouble(
        commonService.getConfig("BID", "rise_coin_percent"));

    if (currentRiseCoinCount < totalCount * riseCoinPercent) {
      log.info("[주문대기] 전체 코인 수량 : {}, 상승 코인 수량 : {}, 설정 퍼센트 : {}", totalCount, currentRiseCoinCount,
          riseCoinPercent);
      return coinNameChartTypeMap;
    }

    List<String> topThirtyMarketList = statisticsService.getTopThirtyMarketList();
    currentPriceList = currentPriceList.stream()
        .filter(currentPrice -> !topThirtyMarketList.contains(currentPrice.getMarket())).toList();

    currentPriceList = currentPriceList.stream()
        .filter(currentPrice -> currentPrice.getChange().equals("RISE"))
        .sorted(Comparator.comparing(CurrentPrice::getSignedChangeRate).reversed())
        .limit(10)
        .sorted(Comparator.comparing(CurrentPrice::getAccTradePrice24h).reversed())
        .limit(5)
        .collect(toShuffledList());

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
