package com.dopamine.api_call.type;

public enum OrderSide {
  BID("bid"),
  ASK("ask");

  private final String value;

  OrderSide(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
