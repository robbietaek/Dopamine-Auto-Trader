package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.api_call.type.Side;
import com.dopamine.trade.dao.OrderDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

  private final OrderDao orderDao;

  public Order orderCoin(String market, Side side, String volume, double price,
      OrderType ordType) {

    Order order = OrderRequestManager.orderCoin(market, side, volume, price, ordType);
    orderDao.insertOrderInformation(order);

    return order;
  }

}
