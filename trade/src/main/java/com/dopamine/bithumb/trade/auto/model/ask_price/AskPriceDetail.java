package com.dopamine.bithumb.trade.auto.model.ask_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties
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
