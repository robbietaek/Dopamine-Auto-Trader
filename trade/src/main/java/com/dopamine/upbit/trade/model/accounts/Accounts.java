package com.dopamine.upbit.trade.model.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
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
  private String avg_buy_price;

  @JsonProperty("avg_buy_price_modified")
  private String avg_buy_price_modified;

  @JsonProperty("unit_currency")
  private String unit_currency;

}
