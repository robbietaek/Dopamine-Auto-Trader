package com.dopamine.upbit.trade.model.order.chance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bid implements Serializable {

  @Serial
  private static final long serialVersionUID = 599362910193573718L;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("price_unit")
  private String priceUnit;

  @JsonProperty("min_total")
  private Integer minTotal;

}
