package com.dopamine.api_call.type;

public enum OrderStatus {
  WAIT("wait"),
  WATCH("watch"),
  DONE("done"),
  CANCEL("cancel");

  private String status;

  OrderStatus(String status) {
    this.status = status;
  }
}
