package com.dopamine.api_call.type;

public enum OrderBy {
  ASC("asc"),
  DESC("desc");

  OrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  private String orderBy;

}
