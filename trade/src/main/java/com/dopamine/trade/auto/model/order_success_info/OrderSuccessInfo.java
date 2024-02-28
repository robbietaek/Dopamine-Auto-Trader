package com.dopamine.trade.auto.model.order_success_info;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class OrderSuccessInfo implements Serializable {

  /*
    거래 체결내역 조회

    status	결과 상태 코드 (정상: 0000, 그 외 에러 코드 참조)	String
    search	검색 구분
    (0 : 전체, 1 : 매수 완료, 2 : 매도 완료, 3 : 출금 중
    4 : 입금, 5 : 출금, 9 : KRW 입금 중)	Number (String)
    transfer_date	거래 일시 타임 스탬프
    YYYY-MM-DD HH:MM:SS	Integer
    order_currency	주문 통화 (코인)	String
    payment_currency	결제 통화 (마켓)	String
    units	거래요청 Currency 수량	String
    price	1Currency당 가격	Number (String)
    amount	거래 금액	Number (String)
    fee_currency	수수료 통화	String
    fee	거래 수수료	Number (String)
    order_balance	주문 통화 잔액	Number (String)
    payment_balance	결제 통화 잔액	Number (String)

   */

  @Serial
  private static final long serialVersionUID = -7603261114646306291L;

  private String status;
  private List<OrderSuccessInfoDetail> data;
}
