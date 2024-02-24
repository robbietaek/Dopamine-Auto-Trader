package com.dopamine.trade.auto.model.AskPrice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class AskPriceDetail implements Serializable {

  @Serial
  private static final long serialVersionUID = -1576801640096434554L;

  @JsonProperty("order_currency")
  private String orderCurrency;
  @JsonProperty("bids")
  private List<Bids> bids;
  @JsonProperty("asks")
  private List<Asks> asks;

}
