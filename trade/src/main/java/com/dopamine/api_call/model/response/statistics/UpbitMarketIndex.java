package com.dopamine.api_call.model.response.statistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpbitMarketIndex implements Serializable {

  /*
    Upbit Market Index (ubmi)
    code 통계 코드 String
    dateTime 시간 String
    openingPrice	시가	Double
    highPrice	고가	Double
    lowPrice	저가	Double
    trade_price	종가(현재가)	Double
    prevClosingPrice	전일 종가(UTC 0시 기준)	Double
    change	EVEN : 보합 RISE : 상승 FALL : 하락	String
    changePrice	변화액의 절대값	Double
    timestamp	타임스탬프	Long
    signedChangePrice	부호가 있는 변화액	Double
    changeRate 변화율	Double
    signedChangeRate 부호가 있는 변화율	Double
    포맷: yyyy-MM-dd	String
   */

  @Serial
  private static final long serialVersionUID = 82435509887598497L;

  private String code;
  private String dateTime;
  private Double openingPrice;
  private Double highPrice;
  private Double lowPrice;
  private Double tradePrice;
  private Double prevClosingPrice;
  private String change;
  private Double changePrice;
  private Double timestamp;
  private Double signedChangePrice;
  private Double changeRate;
  private Double signedChangeRate;

}
