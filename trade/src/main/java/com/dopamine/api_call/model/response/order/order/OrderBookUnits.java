package com.dopamine.api_call.model.response.order.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Getter
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBookUnits implements Serializable {

  @Serial
  private static final long serialVersionUID = -8090267816630969421L;

  @JsonProperty("ask_price")
  private Double askPrice;

  @JsonProperty("bid_price")
  private Double bidPrice;

  @JsonProperty("ask_size")
  private Double askSize;
  
  @JsonProperty("bid_size")
  private Double bidSize;

}
