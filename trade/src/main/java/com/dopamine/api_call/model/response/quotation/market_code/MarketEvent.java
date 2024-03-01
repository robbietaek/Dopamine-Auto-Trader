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
public class MarketEvent implements Serializable {

  @Serial
  private static final long serialVersionUID = -5501406338843670432L;

  @JsonProperty("caution")
  private Caution caution;

}
