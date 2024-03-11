package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.model.response.order.cancel.Cancel;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.trade.dao.OrderDao;
import com.dopamine.trade.model.OrderHistory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

  private final OrderDao orderDao;

  public Order bidPriceCoin(String market, double price) {
    Order order = OrderRequestManager.orderCoin(market, OrderSide.BID, null, price,
        OrderType.PRICE);
    if (order.isSuccess()) {
      orderDao.insertOrderInformation(order);
    }
    return order;
  }

  public Order bidLimitCoin(String market, String volume, double price) {

    Order order = OrderRequestManager.orderCoin(market, OrderSide.BID, volume, price,
        OrderType.LIMIT);
    if (order.isSuccess()) {
      orderDao.insertOrderInformation(order);
    }
    return order;
  }

  public Order askMarketCoin(String market, String volume) {
    Order order = OrderRequestManager.orderCoin(market, OrderSide.ASK, volume, 0, OrderType.MARKET);
    if (order.isSuccess()) {
      orderDao.insertOrderInformation(order);
    }
    return order;
  }

  public Order askLimitCoin(String market, String volume, double price) {
    Order order = OrderRequestManager.orderCoin(market, OrderSide.ASK, volume, price,
        OrderType.LIMIT);
    if (order.isSuccess()) {
      orderDao.insertOrderInformation(order);
    }
    return order;
  }

  public Cancel cancelOrder(String uuid) {
    Cancel cancel = OrderRequestManager.cancelOrder(uuid);
    if (cancel.isSuccess()) {
      orderDao.updateOrderCancel(cancel.getUuid());
    }
    return cancel;
  }

  public OrderHistory getLastOrder(String market, String orderSide) {
    return orderDao.selectLastOrderHistory(market, orderSide);
  }

}
