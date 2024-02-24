package com.dopamine.trade.auto.model.AskPrice;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class AskPrice implements Serializable {

  @Serial
  private static final long serialVersionUID = -5178999272666478393L;

  private String status;
  private AskPriceData data;

}
