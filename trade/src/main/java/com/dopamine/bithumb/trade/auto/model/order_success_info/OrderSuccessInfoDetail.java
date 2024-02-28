package com.dopamine.bithumb.trade.auto.model.order_success_info;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class OrderSuccessInfoDetail implements Serializable {

  @Serial
  private static final long serialVersionUID = 6431211996681236270L;

  private String search;
  @JsonProperty("transfer_date")
  private double transferDate;
  @JsonProperty("order_currency")
  private String orderCurrency;
  @JsonProperty("payment_currency")
  private String paymentCurrency;
  @JsonProperty("units")
  private String units;
  @JsonProperty("price")
  private double price;
  @JsonProperty("amount")
  private double amount;
  @JsonProperty("fee_currency")
  private String feeCurrency;
  @JsonProperty("fee")
  private double fee;
  @JsonProperty("order_balance")
  private double orderBalance;
  @JsonProperty("payment_balance")
  private double paymentBalance;
}
