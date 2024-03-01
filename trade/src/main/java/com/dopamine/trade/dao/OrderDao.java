package com.dopamine.trade.dao;

import com.dopamine.trade.model.OrderHistory;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {

  List<OrderHistory> selectOrderHistory();

}
