package com.dopamine.trade.service;

import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.OrderRequestManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

  public boolean isCoinOrderAvailable(String market, Double krw) {
    OrderAvailable orderAvailable = OrderRequestManager.getOrderAvailable(market);

    if (Double.parseDouble(orderAvailable.getBidFee()) > 0.0005d
        || Double.parseDouble(orderAvailable.getAskFee()) > 0.0005d) {
      return false;
    }

    if (!orderAvailable.getMarket().getAskTypes().contains("limit")
        || !orderAvailable.getMarket().getAskTypes().contains("market")
        || !orderAvailable.getMarket().getBidTypes().contains("limit")
        || !orderAvailable.getMarket().getBidTypes().contains("price")
        || !orderAvailable.getMarket().getOrderSides().contains("ask")
        || !orderAvailable.getMarket().getOrderSides().contains("bid")) {
      return false;
    }

    if (Double.parseDouble(orderAvailable.getMarket().getAsk().getMinTotal()) > krw) {
      return false;
    }

    return true;
  }


}
