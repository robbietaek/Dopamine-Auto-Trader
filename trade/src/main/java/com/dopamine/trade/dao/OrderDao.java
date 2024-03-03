package com.dopamine.trade.dao;

import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.trade.model.OrderHistory;
import com.dopamine.trade.model.OrderHistoryGroupByMarket;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

  void insertOrderInformation(@Param("order") Order order);

  List<OrderHistory> selectOrderHistory(@Param("limit") Integer limit);

  List<OrderHistoryGroupByMarket> selectOrderHistoryGroupByMarket(@Param("limit") Integer limit);

}
