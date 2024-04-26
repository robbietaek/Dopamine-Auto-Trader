package com.dopamine.trade.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.model.response.order.cancel.Cancel;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.type.OrderSide;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.trade.dao.OrderDao;
import com.dopamine.trade.model.OrderHistory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

  private final OrderDao orderDao;

  public Order bidPriceCoin(String market, String chartType, double price) {
    Order order = OrderRequestManager.orderCoin(market, OrderSide.BID, null, price,
        OrderType.PRICE);
    if (order.isSuccess()) {
      orderDao.insertOrderInformationWithChartType(order, chartType);
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

  public Order bidFokCoin(String market, String chartType, double price) {
    Order order = OrderRequestManager.orderCoin(market, OrderSide.BID, null, price,
        OrderType.BEST);
    if (order.isSuccess()) {
      orderDao.insertOrderInformationWithChartType(order, chartType);
    }
    return order;
  }

  public Order askMarketCoin(String market, String volume, String cancelUuid) {
    Cancel cancelOrder = cancelOrder(cancelUuid);
    if (!cancelOrder.isSuccess()) {
      for (int i = 0; i < 5; i++) {
        cancelOrder = cancelOrder(cancelUuid);
        if (cancelOrder.isSuccess()) {
          break;
        }
      }
    }

    if (cancelOrder.isSuccess()) {
      orderDao.updateOrderCancel(cancelUuid);
    }

    Order order = OrderRequestManager.orderCoin(market, OrderSide.ASK, volume, 0, OrderType.MARKET);
    if (!order.isSuccess()) {
      for (int i = 0; i < 5; i++) {
        order = OrderRequestManager.orderCoin(market, OrderSide.ASK, volume, 0, OrderType.MARKET);
        if (order.isSuccess()) {
          break;
        }
      }
    }

    if (order.isSuccess()) {
      orderDao.insertOrderInformation(order);
    }

    return order;
  }

  public Order askLimitCoin(String market, String chartType, String volume, double price) {
    Order order = OrderRequestManager.orderCoin(market, OrderSide.ASK, volume, price,
        OrderType.LIMIT);
    if (order.isSuccess()) {
      orderDao.updateBidPriceCoinOrderHistoryExpired(market);
      orderDao.insertOrderInformationWithChartType(order, chartType);
    }
    return order;
  }

  public Cancel cancelOrder(String uuid) {
    return OrderRequestManager.cancelOrder(uuid);
  }

  public OrderHistory getLastOrder(String market, String orderSide, String orderType) {
    return orderDao.selectLastOrderHistory(market, orderSide, orderType);
  }

  public List<OrderHistory> getAskTargetCoin() {
    return orderDao.selectAskTargetCoin();
  }

}
