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

  void insertOrderInformationWithChartType(@Param("order") Order order,
      @Param("chartType") String chartType);

  void updateBidPriceCoinOrderHistoryExpired(@Param("market") String market);

  void updateAskLimitCoinOrderHistoryExpired();

  void updateCoinOrderHistoryExpiredByUuid(@Param("uuid") String uuid);

  void updateOrderCancel(@Param("uuid") String uuid);

  void updateOrderIsExpired();

  OrderHistory selectLastOrderHistory(@Param("market") String market,
      @Param("orderSide") String orderSide, @Param("orderType") String orderType);

  List<OrderHistory> selectAskTargetCoin();

  List<OrderHistoryGroupByMarket> selectOrderHistoryGroupByMarket(@Param("limit") Integer limit);

}
