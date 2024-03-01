package com.dopamine.api_call.type;

public enum OrderStatus {
  WAIT("wait"),
  WATCH("watch"),
  DONE("done"),
  CANCEL("cancel");

  private final String value;

  OrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
