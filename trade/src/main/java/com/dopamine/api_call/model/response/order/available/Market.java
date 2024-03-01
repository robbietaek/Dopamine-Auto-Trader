package com.dopamine.api_call.model.response.order.available;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Market implements Serializable {

  @Serial
  private static final long serialVersionUID = 5948289253309135429L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("ask_types")
  private List<String> askTypes;

  @JsonProperty("bid_types")
  private List<String> bidTypes;

  @JsonProperty("order_sides")
  private List<String> orderSides;

  @JsonProperty("bid")
  private Bid bid;

  @JsonProperty("ask")
  private Ask ask;

  @JsonProperty("max_total")
  private String maxTotal;

  @JsonProperty("state")
  private String state;

}
