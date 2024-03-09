package com.dopamine.api_call.model.response.quotation.candles.minute;

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
public class Minute implements Serializable {

  /*
    market	마켓명	String
    candle_date_time_utc	캔들 기준 시각(UTC 기준)
    포맷: yyyy-MM-dd'T'HH:mm:ss	String
    candle_date_time_kst	캔들 기준 시각(KST 기준)
    포맷: yyyy-MM-dd'T'HH:mm:ss	String
    opening_price	시가	Double
    high_price	고가	Double
    low_price	저가	Double
    trade_price	종가	Double
    timestamp	해당 캔들에서 마지막 틱이 저장된 시각	Long
    candle_acc_trade_price	누적 거래 금액	Double
    candle_acc_trade_volume	누적 거래량	Double
    unit	분 단위(유닛)	Integer
   */

  @Serial
  private static final long serialVersionUID = 6108120571973556816L;

  @JsonProperty("market")
  private String market;

  @JsonProperty("candle_date_time_utc")
  private String candleDateTimeUtc;

  @JsonProperty("candle_date_time_kst")
  private String candleDateTimeKst;

  @JsonProperty("opening_price")
  private Double openingPrice;

  @JsonProperty("high_price")
  private Double highPrice;

  @JsonProperty("low_price")
  private Double lowPrice;

  @JsonProperty("trade_price")
  private Double tradePrice;

  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("candle_acc_trade_price")
  private Double candleAccTradePrice;

  @JsonProperty("candle_acc_trade_volume")
  private Double candleAccTradeVolume;

  @JsonProperty("unit")
  private Integer unit;

}
