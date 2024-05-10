package com.dopamine.trade.model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class OrderHistory implements Serializable {

  @Serial
  private static final long serialVersionUID = 4494925685373273725L;

  private String uuid;
  private String orderSide;
  private String orderType;
  private String market;
  private String price;
  private String volume;
  private LocalDateTime orderTime;
  private String profitRate;
  private String lossRate;
  private String timeLimit;
  private boolean isCanceled;
  private boolean isExpired;

}
