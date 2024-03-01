package com.dopamine.api_call.model.response.accounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts implements Serializable {

  /*
  currency	화폐를 의미하는 영문 대문자 코드	String
  balance	주문가능 금액/수량	NumberString
  locked	주문 중 묶여있는 금액/수량	NumberString
  avg_buy_price	매수평균가	NumberString
  avg_buy_price_modified	매수평균가 수정 여부	Boolean
  unit_currency	평단가 기준 화폐	String
   */

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("balance")
  private String balance;

  @JsonProperty("locked")
  private String locked;

  @JsonProperty("avg_buy_price")
  private String avgBuyPrice;

  @JsonProperty("avg_buy_price_modified")
  private String avgBuyPriceModified;

  @JsonProperty("unit_currency")
  private String unitCurrency;

}
