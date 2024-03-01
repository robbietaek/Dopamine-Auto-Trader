package com.dopamine.api_call.model.response.quotation.current_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentPrice implements Serializable {

  /*
    market	종목 구분 코드	String
    trade_date	최근 거래 일자(UTC)
    포맷: yyyyMMdd	String
    trade_time	최근 거래 시각(UTC)
    포맷: HHmmss	String
    trade_date_kst	최근 거래 일자(KST)
    포맷: yyyyMMdd	String
    trade_time_kst	최근 거래 시각(KST)
    포맷: HHmmss	String
    trade_timestamp	최근 거래 일시(UTC)
    포맷: Unix Timestamp	Long
    opening_price	시가	Double
    high_price	고가	Double
    low_price	저가	Double
    trade_price	종가(현재가)	Double
    prev_closing_price	전일 종가(UTC 0시 기준)	Double
    change	EVEN : 보합
    RISE : 상승
    FALL : 하락	String
    change_price	변화액의 절대값	Double
    change_rate	변화율의 절대값	Double
    signed_change_price	부호가 있는 변화액	Double
    signed_change_rate	부호가 있는 변화율	Double
    trade_volume	가장 최근 거래량	Double
    acc_trade_price	누적 거래대금(UTC 0시 기준)	Double
    acc_trade_price_24h	24시간 누적 거래대금	Double
    acc_trade_volume	누적 거래량(UTC 0시 기준)	Double
    acc_trade_volume_24h	24시간 누적 거래량	Double
    highest_52_week_price	52주 신고가	Double
    highest_52_week_date	52주 신고가 달성일
    포맷: yyyy-MM-dd	String
    lowest_52_week_price	52주 신저가	Double
    lowest_52_week_date	52주 신저가 달성일
    포맷: yyyy-MM-dd	String
    timestamp	타임스탬프	Long
   */
  
  @Serial
  private static final long serialVersionUID = -6772403928368852933L;

  @JsonProperty("market")
  private String market;

  @JsonProperty("trade_date")
  private String tradeDate;

  @JsonProperty("trade_time")
  private String tradeTime;

  @JsonProperty("trade_date_kst")
  private String tradeDateKst;

  @JsonProperty("trade_time_kst")
  private String tradeTimeKst;

  @JsonProperty("trade_timestamp")
  private String tradeTimestamp;

  @JsonProperty("opening_price")
  private Double openingPrice;

  @JsonProperty("high_price")
  private Double highPrice;

  @JsonProperty("low_price")
  private Double lowPrice;

  @JsonProperty("trade_price")
  private Double tradePrice;

  @JsonProperty("prev_closing_price")
  private Double prevClosingPrice;

  @JsonProperty("change")
  private String change;

  @JsonProperty("change_price")
  private Double changePrice;

  @JsonProperty("change_rate")
  private Double changeRate;

  @JsonProperty("signed_change_price")
  private Double signedChangePrice;

  @JsonProperty("signed_change_rate")
  private Double signedChangeRate;

  @JsonProperty("trade_volume")
  private Double tradeVolume;

  @JsonProperty("acc_trade_price")
  private Double accTradePrice;

  @JsonProperty("acc_trade_price_24h")
  private Double accTradePrice24h;

  @JsonProperty("acc_trade_volume")
  private Double accTradeVolume;

  @JsonProperty("acc_trade_volume_24h")
  private Double accTradeVolume24h;

  @JsonProperty("highest_52_week_price")
  private Double highest52WeekPrice;

  @JsonProperty("highest_52_week_date")
  private String highest52WeekDate;

  @JsonProperty("lowest_52_week_price")
  private Double lowest52WeekPrice;

  @JsonProperty("lowest_52_week_date")
  private String lowest52WeekDate;

  @JsonProperty("timestamp")
  private Double timestamp;

}
