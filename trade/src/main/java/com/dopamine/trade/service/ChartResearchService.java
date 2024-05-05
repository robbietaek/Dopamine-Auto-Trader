package com.dopamine.trade.service;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.quotation.candles.minute.Minute;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Slf4j
@Service
public class ChartResearchService {

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

  public Double getRsiByMinutes(List<Minute> minuteCandleList, int period) {
    if (CollectionUtils.isEmpty(minuteCandleList)) {
      return null;
    }

    // 지수 이동 평균은 과거 데이터부터 구해주어야 합니다.
    minuteCandleList = minuteCandleList.stream()
        .sorted(Comparator.comparing(Minute::getTimestamp))  // 오름차순 (과거 순)
        .collect(Collectors.toList());  // Sort

    double zero = 0;
    List<Double> upList = new ArrayList<>();  // 상승 리스트
    List<Double> downList = new ArrayList<>();  // 하락 리스트
    for (int i = 0; i < minuteCandleList.size() - 1; i++) {
      // 최근 종가 - 전일 종가 = gap 값이 양수일 경우 상승했다는 뜻 / 음수일 경우 하락이라는 뜻
      double gapByTradePrice =
          minuteCandleList.get(i + 1).getTradePrice().doubleValue() - minuteCandleList.get(i)
              .getTradePrice().doubleValue();
      if (gapByTradePrice > 0) {  // 종가가 전일 종가보다 상승일 경우
        upList.add(gapByTradePrice);
        downList.add(zero);
      } else if (gapByTradePrice < 0) {  // 종가가 전일 종가보다 하락일 경우
        downList.add(gapByTradePrice * -1);  // 음수를 양수로 변환해준다.
        upList.add(zero);
      } else {  // 상승, 하락이 없을 경우 종가 - 전일 종가 = gap은 0이므로 0값을 넣어줍니다.
        upList.add(zero);
        downList.add(zero);
      }
    }

    double a = (double) 1 / (1 + (period
        - 1));  // 지수 이동 평균의 정식 공식은 a = 2 / 1 + day 이지만 업비트에서 사용하는 수식은 a = 1 / (1 + (day - 1))

    // AU값 구하기
    double upEma = 0;  // 상승 값의 지수이동평균
    if (!CollectionUtils.isEmpty(upList)) {
      upEma = upList.get(0).doubleValue();
      if (upList.size() > 1) {
        for (int i = 1; i < upList.size(); i++) {
          upEma = (upList.get(i).doubleValue() * a) + (upEma * (1 - a));
        }
      }
    }

    // AD값 구하기
    double downEma = 0;  // 하락 값의 지수이동평균
    if (!CollectionUtils.isEmpty(downList)) {
      downEma = downList.get(0).doubleValue();
      if (downList.size() > 1) {
        for (int i = 1; i < downList.size(); i++) {
          downEma = (downList.get(i).doubleValue() * a) + (downEma * (1 - a));
        }
      }
    }

    // rsi 계산
    double au = upEma;
    double ad = downEma;
    double rs = au / ad;
    double rsi = 100 - (100 / (1 + rs));

    return rsi;
  }

  public List<Double> isBollingerBandByMinutes(List<Minute> minuteCandleList, int period,
      int multiplier) {

    List<Double> tradePriceList = minuteCandleList.subList(0, period).stream()
        .map(Minute::getTradePrice)
        .collect(Collectors.toList());

    double movingAverageLine =
        tradePriceList.stream().mapToDouble(d -> d).sum() / tradePriceList.size();
    double standardDeviation = 0;
    for (double tradePrice : tradePriceList) {
      standardDeviation += Math.pow(movingAverageLine - tradePrice, 2);
    }

    double gap = Math.sqrt(standardDeviation / tradePriceList.size()) * multiplier;

    double upMovingAverageLine = movingAverageLine + gap;
    double downMovingAverageLine = movingAverageLine - gap;

    return List.of(upMovingAverageLine, movingAverageLine, downMovingAverageLine);
  }

}
