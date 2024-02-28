package com.dopamine.bithumb.trade.model.ask_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class AskPrice implements Serializable {

  /*
    호가 정보 조회 (ALL)

    status	결과 상태 코드
    (정상: 0000, 그 외 에러 코드 참조)	String
    timestamp	타임 스탬프	Integer(String)
    order_currency	주문 통화 (코인)	String
    payment_currency	결제 통화 (마켓)	String
    bids	매수 요청 내역	Array[Object]
    asks	매도 요청 내역	Array[Object]
    quantity	Currency 수량	Number (String)
    price	Currency 거래가	Number (String)
   */

  @Serial
  private static final long serialVersionUID = -5178999272666478393L;

  private String status;
  private AskPriceData data;

}
