package com.dopamine.trade.auto.model.AskPrice;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class Asks implements Serializable {

  @Serial
  private static final long serialVersionUID = 3645333214493670596L;

  private String price;
  private String quantity;
}
