package com.dopamine.api_call.model.response.order.available;

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
public class Ask implements Serializable {

  @Serial
  private static final long serialVersionUID = -99722018757547615L;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("price_unit")
  private String priceUnit;

  @JsonProperty("min_total")
  private String minTotal;

}
