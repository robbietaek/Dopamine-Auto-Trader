package com.dopamine.api_call.model.response.order.available;

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
public class OrderAvailable implements Serializable {

  /*
    bid_fee	매수 수수료 비율	NumberString
    ask_fee	매도 수수료 비율	NumberString
    market	마켓에 대한 정보	Object
    market.id	마켓의 유일 키	String
    market.name	마켓 이름	String
    market.order_types	지원 주문 방식 (만료)	Array[String]
    ask_types	매도 주문 지원 방식	Array[String]
    bid_types	매수 주문 지원 방식	Array[String]
    market.order_sides	지원 주문 종류	Array[String]
    market.bid	매수 시 제약사항	Object
    market.bid.currency	화폐를 의미하는 영문 대문자 코드	String
    market.bid.price_unit	주문금액 단위	String
    market.bid.min_total	최소 매도/매수 금액	Number
    market.ask	매도 시 제약사항	Object
    market.ask.currency	화폐를 의미하는 영문 대문자 코드	String
    market.ask.price_unit	주문금액 단위	String
    market.ask.min_total	최소 매도/매수 금액	Number
    market.max_total	최대 매도/매수 금액	NumberString
    market.state	마켓 운영 상태	String
    bid_account	매수 시 사용하는 화폐의 계좌 상태	Object
    bid_account.currency	화폐를 의미하는 영문 대문자 코드	String
    bid_account.balance	주문가능 금액/수량	NumberString
    bid_account.locked	주문 중 묶여있는 금액/수량	NumberString
    bid_account.avg_buy_price	매수평균가	NumberString
    bid_account.avg_buy_price_modified	매수평균가 수정 여부	Boolean
    bid_account.unit_currency	평단가 기준 화폐	String
    ask_account	매도 시 사용하는 화폐의 계좌 상태	Object
    ask_account.currency	화폐를 의미하는 영문 대문자 코드	String
    ask_account.balance	주문가능 금액/수량	NumberString
    ask_account.locked	주문 중 묶여있는 금액/수량	NumberString
    ask_account.avg_buy_price	매수평균가	NumberString
    ask_account.avg_buy_price_modified	매수평균가 수정 여부	Boolean
    ask_account.unit_currency	평단가 기준 화폐	String
   */

  @JsonProperty("bid_fee")
  private String bidFee;

  @JsonProperty("ask_fee")
  private String askFee;

  @JsonProperty("market")
  private Market market;

  @JsonProperty("bid_account")
  private BidAccount bidAccount;

  @JsonProperty("ask_account")
  private AskAccount askAccount;

}
