package com.dopamine.trade.model;


import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class OrderHistoryGroupByMarket implements Serializable {

  @Serial
  private static final long serialVersionUID = -3993069487204943247L;

  private String market;
  private String uuidList;

  public String[] getUuidList() {
    if (uuidList.isEmpty()) {
      return new String[0];
    }

    return uuidList.split(",");
  }

}
