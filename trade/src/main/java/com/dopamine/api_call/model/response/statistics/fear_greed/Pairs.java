package com.dopamine.api_call.model.response.statistics.fear_greed;

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
public class Pairs implements Serializable {

  @Serial
  private static final long serialVersionUID = 2321580319265049081L;

  private String code;
  private String date;

  @JsonProperty("change_rate")
  private Double changeRate;

  @JsonProperty("updated_at")
  private String updated_At;

  @JsonProperty("cls_prc")
  private Double clsPrc;

  private Double score;

  private String currency;

  private String stage;

  private String stage_en;

  @JsonProperty("korean_name")
  private String koreanName;

  @JsonProperty("english_name")
  private String englishName;

  public String getCurrency() {
    return "KRW-" + this.currency;
  }

}
