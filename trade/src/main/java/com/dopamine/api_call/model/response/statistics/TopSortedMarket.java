package com.dopamine.api_call.model.response.statistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopSortedMarket implements Serializable {

  @Serial
  private static final long serialVersionUID = -20169399482409340L;

  private String date;
  private List<TopSortedMarketDetail> markets;

  public List<String> getTopTenMarketList() {
    List<String> marketList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      String marketCode = markets.get(i).getCode();
      String[] codeSplit = marketCode.split("\\.");
      marketList.add(codeSplit[2]);
    }

    return marketList;
  }

  public List<String> getTopTwentyMarketList() {
    List<String> marketList = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      String marketCode = markets.get(i).getCode();
      String[] codeSplit = marketCode.split("\\.");
      marketList.add(codeSplit[2]);
    }

    return marketList;
  }

  public List<String> getTopThirtyMarketList() {
    List<String> marketList = new ArrayList<>();
    for (TopSortedMarketDetail topSortedMarketDetail : markets) {
      String marketCode = topSortedMarketDetail.getCode();
      String[] codeSplit = marketCode.split("\\.");
      marketList.add(codeSplit[2]);
    }

    return marketList;
  }

}
