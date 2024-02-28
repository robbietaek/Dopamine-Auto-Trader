package com.dopamine.bithumb.trade.model.ask_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class Bids implements Serializable {

  @Serial
  private static final long serialVersionUID = 1405819500108607988L;

  private String price;
  private String quantity;
}
