package com.dopamine.upbit.trade.model.order.chance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BidAccount implements Serializable {

  @Serial
  private static final long serialVersionUID = 7137721040868581531L;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("balance")
  private String balance;

  @JsonProperty("locked")
  private String locked;

  @JsonProperty("avg_buy_price")
  private String avgBuyPrice;

  @JsonProperty("avg_buy_price_modified")
  private boolean avgBuyPriceModified;

  @JsonProperty("unit_currency")
  private String unitCurrency;

}
