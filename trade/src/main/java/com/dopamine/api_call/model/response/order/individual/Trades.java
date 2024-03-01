package com.dopamine.api_call.model.response.order.individual;

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
public class Trades implements Serializable {

  @Serial
  private static final long serialVersionUID = 6651530746831741404L;

  @JsonProperty("market")
  private String market;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("price")
  private String price;

  @JsonProperty("volume")
  private String volume;

  @JsonProperty("funds")
  private String funds;

  @JsonProperty("side")
  private String side;

  @JsonProperty("created_at")
  private String createdAt;
}
