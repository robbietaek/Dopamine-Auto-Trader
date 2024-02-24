package com.dopamine.trade.auto.model.Account;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class Account implements Serializable {

  @Serial
  private static final long serialVersionUID = 1698038664804692630L;

  private String status;
  private AccountData data;

}
