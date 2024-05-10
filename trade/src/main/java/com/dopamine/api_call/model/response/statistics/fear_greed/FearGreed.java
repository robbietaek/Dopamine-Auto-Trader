package com.dopamine.api_call.model.response.statistics.fear_greed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class FearGreed implements Serializable {

  @Serial
  private static final long serialVersionUID = 3224781544474741523L;

  private String at;
  private Today today;
  private List<Pairs> pairs;

  public Map<String, Double> getMarketFearScoreMap() {
    Map<String, Double> marketScoreMap = new HashMap<>();
    if (pairs == null || pairs.isEmpty()) {
      return marketScoreMap;
    }

    for (Pairs pair : this.getPairs()) {
      marketScoreMap.put(pair.getCurrency(), pair.getScore());
    }
    return marketScoreMap;
  }

}
