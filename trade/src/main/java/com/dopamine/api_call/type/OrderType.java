package com.dopamine.api_call.type;

public enum OrderType {

  LIMIT("limit"),
  PRICE("price"),
  MARKET("market");

  private final String value;

  OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
