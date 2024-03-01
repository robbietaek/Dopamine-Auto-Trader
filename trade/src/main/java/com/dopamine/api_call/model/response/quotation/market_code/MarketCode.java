package com.dopamine.api_call.model.response.quotation.market_code;

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
public class MarketCode implements Serializable {

  /*
    market	업비트에서 제공중인 시장 정보	String
    korean_name	거래 대상 디지털 자산 한글명	String
    english_name	거래 대상 디지털 자산 영문명	String
    market_warning	유의 종목 여부
    NONE (해당 사항 없음), CAUTION(투자유의)
    *deprecated	String
    market_event.warning	업비트 시장경보 > 유의종목 지정 여부

    *주의 경보 타입은 아래와 같으며, 자세한 정보는 관련 공지사항을 참고 하시기 바랍니다.
    - PRICE_FLUCTUATIONS: 가격 급등락 경보 발령 여부
    - TRADING_VOLUME_SOARING: 거래량 급등 경보 발령 여부
    - DEPOSIT_AMOUNT_SOARING: 입금량 급등 경보 발령 여부
    - GLOBAL_PRICE_DIFFERENCES: 가격 차이 경보 발령 여부
    - CONCENTRATION_OF_SMALL_ACCOUNTS: 소수 계정 집중 경보 발령 여부
   */

  @Serial
  private static final long serialVersionUID = -719508611097302372L;

  @JsonProperty("market")
  private String market;

  @JsonProperty("korean_name")
  private String koreanName;

  @JsonProperty("english_name")
  private String englishName;

  @JsonProperty("market_event")
  private MarketEvent marketEvent;

}
