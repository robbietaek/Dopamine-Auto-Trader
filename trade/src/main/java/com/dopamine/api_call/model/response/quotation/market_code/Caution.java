package com.dopamine.api_call.model.response.quotation.market_code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Caution implements Serializable {

  @Serial
  private static final long serialVersionUID = 7464916029173759871L;

  @JsonProperty("PRICE_FLUCTUATIONS")
  private boolean priceFluctuations;

  @JsonProperty("TRADING_VOLUME_SOARING")
  private boolean tradingVolumeSoaring;

  @JsonProperty("DEPOSIT_AMOUNT_SOARING")
  private boolean depositAmountSoaring;

  @JsonProperty("GLOBAL_PRICE_DIFFERENCES")
  private boolean globalPricedifferences;

  @JsonProperty("CONCENTRATION_OF_SMALL_ACCOUNTS")
  private boolean concentrationOfSmallAccounts;

}
