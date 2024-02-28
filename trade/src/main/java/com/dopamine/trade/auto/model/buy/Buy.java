package com.dopamine.trade.auto.model.buy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class Buy implements Serializable {

  @Serial
  private static final long serialVersionUID = 1003023741930252771L;

  private String status;
  @JsonProperty("order_id")
  private String orderId;
  private String message;

}
