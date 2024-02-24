package com.dopamine.trade.auto.model.AskPrice;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class Bids implements Serializable {

  @Serial
  private static final long serialVersionUID = 1405819500108607988L;

  private String price;
  private String quantity;
}
