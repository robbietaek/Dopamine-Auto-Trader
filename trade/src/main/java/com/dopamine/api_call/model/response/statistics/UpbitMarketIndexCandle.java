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
public class UpbitMarketIndexCandle implements Serializable {

  @Serial
  private static final long serialVersionUID = 282085947761398449L;

  private String candleDateTime;
  private String candleDateTimeKst;
  private Double openingPrice;
  private Double highPrice;
  private Double lowPrice;
  private Double tradePrice;
  private Double candleAccTradeVolume;
  private Double candleAccTradePrice;
  private Double timestamp;
  private String code;
  private Integer unit;

}
