package com.dopamine.bithumb.trade.auto.model.sell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class Sell implements Serializable {

  @Serial
  private static final long serialVersionUID = 2843898825112969361L;

  private String status;
  @JsonProperty("order_id")
  private String orderId;
  private String message;
}
