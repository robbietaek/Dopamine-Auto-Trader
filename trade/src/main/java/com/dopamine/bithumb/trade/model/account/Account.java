package com.dopamine.bithumb.trade.model.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class Account implements Serializable {

  /*
    보유자산 조회

    status	결과 상태 코드 (정상: 0000, 그 외 에러 코드 참조)	String
    total_{currency}	전체 가상자산 수량	Number (String)
    total_krw	전체 원화(KRW) 금액	Number (String)
    inuse{currency}	주문 중 묶여있는 가상자산 수량	Number (String)
    in_use_krw	주문 중 묶여있는 원화(KRW) 금액	Number (String)
    available_{currency}	주문 가능 가상자산 수량	Number (String)
    available_krw	주문 가능 원화(KRW) 금액	Number (String)
    xcoinlast{currency}	마지막 체결된 거래 금액
    ALL 호출 시 필드 명 – xcoinlast{currency}	Number (String)
   */

  @Serial
  private static final long serialVersionUID = 1698038664804692630L;

  private String status;
  private AccountData data;

}
