package com.dopamine.api_call.model.response.quotation.order_book;

import com.dopamine.api_call.model.response.order.order.OrderBookUnits;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBook implements Serializable {

  /*
    market	마켓 코드	String
    timestamp	호가 생성 시각	Long
    total_ask_size	호가 매도 총 잔량	Double
    total_bid_size	호가 매수 총 잔량	Double
    orderbook_units	호가	List of Objects
    ask_price	매도호가	Double
    bid_price	매수호가	Double
    ask_size	매도 잔량	Double
    bid_size	매수 잔량	Double
    level	호가 모아보기 단위 (default: 0, 기본 호가단위)
    *호가 모아보기 기능은 원화마켓(KRW)에서만 지원하므로 BTC, USDT 마켓의 경우 0만 존재합니다.
    *종목별 지원하는 모아보기 단위는 v1/orderbook/supported_levels 에서 확인하실 수 있습니다.	Double
   */

  @Serial
  private static final long serialVersionUID = -1094995074566094275L;

  @JsonProperty("market")
  private String market;

  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("total_ask_size")
  private Double totalAskSize;

  @JsonProperty("total_bid_size")
  private Double totalBidSize;

  @JsonProperty("orderbook_units")
  private List<OrderBookUnits> orderbookUnits;

  @JsonProperty("level")
  private Double level;

}
