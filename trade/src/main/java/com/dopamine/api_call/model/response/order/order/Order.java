package com.dopamine.api_call.model.response.order.order;

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
public class Order implements Serializable {

  /*
    uuid	주문의 고유 아이디	String
    side	주문 종류	String
    ord_type	주문 방식	String
    price	주문 당시 화폐 가격	NumberString
    state	주문 상태	String
    market	마켓의 유일키	String
    created_at	주문 생성 시간	String
    volume	사용자가 입력한 주문 양	NumberString
    remaining_volume	체결 후 남은 주문 양	NumberString
    reserved_fee	수수료로 예약된 비용	NumberString
    remaining_fee	남은 수수료	NumberString
    paid_fee	사용된 수수료	NumberString
    locked	거래에 사용중인 비용	NumberString
    executed_volume	체결된 양	NumberString
    trades_count	해당 주문에 걸린 체결 수	Integer
   */

  @Serial
  private static final long serialVersionUID = -377726314145218826L;

  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("side")
  private String side;

  @JsonProperty("ord_type")
  private String ordType;

  @JsonProperty("price")
  private String price;

  @JsonProperty("state")
  private String state;

  @JsonProperty("market")
  private String market;

  @JsonProperty("created_at")
  private String createdAt;

  @JsonProperty("volume")
  private String volume;

  @JsonProperty("remaining_volume")
  private String remainingVolume;

  @JsonProperty("reserved_fee")
  private String reservedFee;

  @JsonProperty("remaining_fee")
  private String remainingFee;

  @JsonProperty("paid_fee")
  private String paidFee;

  @JsonProperty("locked")
  private String locked;

  @JsonProperty("executed_volume")
  private String executedVolume;

  @JsonProperty("trades_count")
  private Integer tradesCount;
}

