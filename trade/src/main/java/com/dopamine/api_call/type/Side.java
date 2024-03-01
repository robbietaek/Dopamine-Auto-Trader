package com.dopamine.api_call.type;

public enum Side {
  BID("bid"),
  ASK("ask");

  private final String value;

  Side(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
