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
public class TopSortedMarketDetail implements Serializable {

  @Serial
  private static final long serialVersionUID = -4497975834192674972L;

  private String code;
  private Double weight;
  private Double componentRatio;
  private String koreanName;
  private String englishName;

}
