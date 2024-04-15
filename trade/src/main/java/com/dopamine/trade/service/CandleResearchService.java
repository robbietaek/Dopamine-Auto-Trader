package com.dopamine.trade.service;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.quotation.candles.minute.Minute;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CandleResearchService {

  public String getPositiveChartType(String market) {
    List<Minute> minuteCandleList = QuotationRequestManager.getMinuteCandleList(market, "5", "1");
    String chartType = "NONE";

    if (isHammerChart(minuteCandleList)) {
      chartType = "HAMMER";
    } else if (isInverseHammerChart(minuteCandleList)) {
      chartType = "INVERSE_HAMMER";
    } else if (isBullishEngulfingChart(minuteCandleList)) {
      chartType = "BULLISH_ENGULFING";
    } else if (isMorningStarChart(minuteCandleList)) {
      chartType = "MORNING_STAR";
    } else if (isThreeWhiteSoldiersChart(minuteCandleList)) {
      chartType = "THREE_WHITE_SOLDIERS";
    }

    return chartType;
  }


  private boolean isHammerChart(List<Minute> minuteCandleList) {
    boolean isChart = false;

    Minute beforeOneMinuteCandle = minuteCandleList.get(1);
    double openingPrice = beforeOneMinuteCandle.getOpeningPrice();
    double tradePrice = beforeOneMinuteCandle.getTradePrice();
    double highPrice = beforeOneMinuteCandle.getHighPrice();
    double lowPrice = beforeOneMinuteCandle.getLowPrice();

    if (lowPrice < tradePrice) {

      if (tradePrice > openingPrice) {
        double highPriceSubTradePrice = Math.abs(highPrice - tradePrice);
        double lowPriceSubOpeningPrice = Math.abs(lowPrice - openingPrice);
        double highPriceSubLowPrice = Math.abs(highPrice - lowPrice);
        double tradePriceSubOpeningPrice = Math.abs(tradePrice - openingPrice);

        if (highPriceSubTradePrice < lowPriceSubOpeningPrice
            && highPriceSubLowPrice * 0.6 <= lowPriceSubOpeningPrice
            && highPriceSubLowPrice * 0.3 <= tradePriceSubOpeningPrice) {
          isChart = true;
        }
      }
    }

    return isChart;
  }

  private boolean isInverseHammerChart(List<Minute> minuteCandleList) {
    boolean isChart = false;

    Minute beforeTwoMinuteCandle = minuteCandleList.get(2);

    double twoMinuteOpeningPrice = beforeTwoMinuteCandle.getOpeningPrice();
    double twoMinuteTradePrice = beforeTwoMinuteCandle.getTradePrice();
    double twoMinuteHighPrice = beforeTwoMinuteCandle.getHighPrice();
    double twoMinuteLowPrice = beforeTwoMinuteCandle.getLowPrice();

    if (twoMinuteOpeningPrice > twoMinuteTradePrice) {

      double highPriceSubLowPrice = Math.abs(twoMinuteHighPrice - twoMinuteLowPrice);
      double tradePriceSubOpeningPrice = Math.abs(twoMinuteTradePrice - twoMinuteOpeningPrice);

      if (highPriceSubLowPrice * 0.7 <= tradePriceSubOpeningPrice) {
        isChart = true;
      }
    }

    if (!isChart) {
      return false;
    } else {
      isChart = false;
    }

    Minute beforeOneMinuteCandle = minuteCandleList.get(1);

    double oneMinuteOpeningPrice = beforeOneMinuteCandle.getOpeningPrice();
    double oneMinuteTradePrice = beforeOneMinuteCandle.getTradePrice();
    double oneMinuteHighPrice = beforeOneMinuteCandle.getHighPrice();
    double oneMinuteLowPrice = beforeOneMinuteCandle.getLowPrice();

    if (oneMinuteLowPrice < oneMinuteTradePrice) {

      if (oneMinuteTradePrice > oneMinuteOpeningPrice) {

        double highPriceSubTradePrice = Math.abs(oneMinuteHighPrice - oneMinuteTradePrice);
        double openingPriceSubLowPrice = Math.abs(oneMinuteOpeningPrice - oneMinuteLowPrice);
        double highPriceSubLowPrice = Math.abs(oneMinuteHighPrice - oneMinuteLowPrice);
        double highPriceSubtradePrice = Math.abs(oneMinuteTradePrice - oneMinuteOpeningPrice);
        double tradePriceSubOpeningPrice = Math.abs(oneMinuteTradePrice - oneMinuteOpeningPrice);

        if (highPriceSubTradePrice > openingPriceSubLowPrice
            && highPriceSubLowPrice * 0.4 >= highPriceSubtradePrice
            && highPriceSubLowPrice * 0.2 <= tradePriceSubOpeningPrice) {
          isChart = true;
        }
      }
    }

    return isChart;
  }

  private boolean isBullishEngulfingChart(List<Minute> minuteCandleList) {
    boolean isChart = false;

    Minute beforeTwoMinuteCandle = minuteCandleList.get(2);

    double twoMinuteOpeningPrice = beforeTwoMinuteCandle.getOpeningPrice();
    double twoMinuteTradePrice = beforeTwoMinuteCandle.getTradePrice();

    if (twoMinuteOpeningPrice > twoMinuteTradePrice) {

      Minute beforeOneMinuteCandle = minuteCandleList.get(1);

      double oneMinuteOpeningPrice = beforeOneMinuteCandle.getOpeningPrice();
      double oneMinuteTradePrice = beforeOneMinuteCandle.getTradePrice();
      double oneMinuteHighPrice = beforeOneMinuteCandle.getHighPrice();
      double oneMinuteLowPrice = beforeOneMinuteCandle.getLowPrice();

      if (twoMinuteTradePrice > oneMinuteOpeningPrice
          && twoMinuteOpeningPrice < oneMinuteTradePrice) {

        double highPriceSubLowPrice = Math.abs(oneMinuteHighPrice - oneMinuteLowPrice);
        double tradePriceSubOpeningPrice = Math.abs(oneMinuteTradePrice - oneMinuteOpeningPrice);

        if (highPriceSubLowPrice * 0.8 <= tradePriceSubOpeningPrice) {
          isChart = true;
        }
      }

    }

    return isChart;
  }

  private boolean isMorningStarChart(List<Minute> minuteCandleList) {
    boolean isChart = false;

    Minute beforeThreeMinuteCandle = minuteCandleList.get(3);

    double threeMinuteOpeningPrice = beforeThreeMinuteCandle.getOpeningPrice();
    double threeMinuteTradePrice = beforeThreeMinuteCandle.getTradePrice();
    double threeMinuteHighPrice = beforeThreeMinuteCandle.getHighPrice();
    double threeMinuteLowPrice = beforeThreeMinuteCandle.getLowPrice();

    if (threeMinuteOpeningPrice > threeMinuteTradePrice) {

      double highPriceSubLowPrice = Math.abs(threeMinuteHighPrice - threeMinuteLowPrice);
      double openingPriceSubTradePrice = Math.abs(threeMinuteOpeningPrice - threeMinuteTradePrice);

      if (highPriceSubLowPrice * 0.9 <= openingPriceSubTradePrice) {
        isChart = true;
      }
    }

    if (!isChart) {
      return false;
    } else {
      isChart = false;
    }

    Minute beforeTwoMinuteCandle = minuteCandleList.get(2);

    double twoMinuteOpeningPrice = beforeTwoMinuteCandle.getOpeningPrice();
    double twoMinuteTradePrice = beforeTwoMinuteCandle.getTradePrice();
    double twoMinuteHighPrice = beforeTwoMinuteCandle.getHighPrice();
    double twoMinuteLowPrice = beforeTwoMinuteCandle.getLowPrice();

    if (twoMinuteOpeningPrice < twoMinuteTradePrice) {

      if (twoMinuteOpeningPrice >= twoMinuteLowPrice * 1.1
          && twoMinuteTradePrice <= twoMinuteHighPrice * 0.9) {
        isChart = true;
      }
    }

    if (!isChart) {
      return false;
    } else {
      isChart = false;
    }

    Minute beforeOneMinuteCandle = minuteCandleList.get(1);

    double oneMinuteOpeningPrice = beforeOneMinuteCandle.getOpeningPrice();
    double oneMinuteTradePrice = beforeOneMinuteCandle.getTradePrice();
    double oneMinuteHighPrice = beforeOneMinuteCandle.getHighPrice();
    double oneMinuteLowPrice = beforeOneMinuteCandle.getLowPrice();

    if (oneMinuteOpeningPrice < oneMinuteTradePrice) {

      double highPriceSubLowPrice = Math.abs(oneMinuteHighPrice - oneMinuteLowPrice);
      double tradePriceSubOpeningPrice = Math.abs(oneMinuteTradePrice - oneMinuteOpeningPrice);

      if (highPriceSubLowPrice * 0.8 <= tradePriceSubOpeningPrice) {
        isChart = true;
      }
    }

    return isChart;
  }

  private boolean isThreeWhiteSoldiersChart(List<Minute> minuteCandleList) {
    boolean isChart = false;

    Minute beforeThreeMinuteCandle = minuteCandleList.get(3);

    double threeMinuteOpeningPrice = beforeThreeMinuteCandle.getOpeningPrice();
    double threeMinuteTradePrice = beforeThreeMinuteCandle.getTradePrice();
    double threeMinuteHighPrice = beforeThreeMinuteCandle.getHighPrice();
    double threeMinuteLowPrice = beforeThreeMinuteCandle.getLowPrice();

    if (threeMinuteOpeningPrice < threeMinuteTradePrice) {

      double highPriceSubLowPrice = Math.abs(threeMinuteHighPrice - threeMinuteLowPrice);
      double tradePriceSubOpeningPrice = Math.abs(threeMinuteTradePrice - threeMinuteOpeningPrice);

      if (highPriceSubLowPrice * 0.8 <= tradePriceSubOpeningPrice) {
        isChart = true;
      }
    }

    if (!isChart) {
      return false;
    } else {
      isChart = false;
    }

    Minute beforeTwoMinuteCandle = minuteCandleList.get(2);

    double twoMinuteOpeningPrice = beforeTwoMinuteCandle.getOpeningPrice();
    double twoMinuteTradePrice = beforeTwoMinuteCandle.getTradePrice();
    double twoMinuteHighPrice = beforeTwoMinuteCandle.getHighPrice();
    double twoMinuteLowPrice = beforeTwoMinuteCandle.getLowPrice();

    if (twoMinuteOpeningPrice < twoMinuteTradePrice) {

      double highPriceSubLowPrice = Math.abs(twoMinuteHighPrice - twoMinuteLowPrice);
      double tradePriceSubOpeningPrice = Math.abs(twoMinuteTradePrice - twoMinuteOpeningPrice);

      if (highPriceSubLowPrice * 0.8 <= tradePriceSubOpeningPrice) {
        isChart = true;
      }
    }

    if (!isChart) {
      return false;
    } else {
      isChart = false;
    }

    Minute beforeOneMinuteCandle = minuteCandleList.get(1);

    double oneMinuteOpeningPrice = beforeOneMinuteCandle.getOpeningPrice();
    double oneMinuteTradePrice = beforeOneMinuteCandle.getTradePrice();
    double oneMinuteHighPrice = beforeOneMinuteCandle.getHighPrice();
    double oneMinuteLowPrice = beforeOneMinuteCandle.getLowPrice();

    if (oneMinuteOpeningPrice < oneMinuteTradePrice) {

      double highPriceSubLowPrice = Math.abs(oneMinuteHighPrice - oneMinuteLowPrice);
      double tradePriceSubOpeningPrice = Math.abs(oneMinuteTradePrice - oneMinuteOpeningPrice);

      if (highPriceSubLowPrice * 0.8 <= tradePriceSubOpeningPrice) {
        isChart = true;
      }
    }

    return isChart;
  }

}
