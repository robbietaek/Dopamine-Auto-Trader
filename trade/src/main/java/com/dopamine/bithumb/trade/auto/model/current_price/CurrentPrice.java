package com.dopamine.bithumb.trade.auto.model.current_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class CurrentPrice implements Serializable {

  /*
    현재가 정보 조회 (ALL)

    status	결과 상태 코드
    (정상: 0000, 그 외 에러 코드 참조)	String
    opening_price	시가 00시 기준	Number (String)
    closing_price	종가 00시 기준	Number (String)
    min_price	저가 00시 기준	Number (String)
    max_price	고가 00시 기준	Number (String)
    units_traded	거래량 00시 기준	Number (String)
    acc_trade_value	거래금액 00시 기준	Number (String)
    prev_closing_price	전일종가	Number (String)
    units_traded_24H	최근 24시간 거래량	Number (String)
    acc_trade_value_24H	최근 24시간 거래금액	Number (String)
    fluctate_24H	최근 24시간 변동가	Number (String)
    fluctate_rate_24H	최근 24시간 변동률	Number (String)
    date	타임 스탬프	Integer(String)

   */

  @Serial
  private static final long serialVersionUID = -4507012607637012453L;

  private String status;
  private CurrentPriceData data;

}
