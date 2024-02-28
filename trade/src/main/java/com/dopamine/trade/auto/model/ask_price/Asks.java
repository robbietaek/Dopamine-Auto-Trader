package com.dopamine.trade.auto.model.ask_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class Asks implements Serializable {

  @Serial
  private static final long serialVersionUID = 3645333214493670596L;

  private String price;
  private String quantity;
}
