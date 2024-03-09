package com.dopamine.record.dao;

import com.dopamine.api_call.model.response.order.numerous.NumerousOrderStatus;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecordDao {

  void insertOrderResultList(
      @Param("numerousOrderStatusList") List<NumerousOrderStatus> numerousOrderStatusList);

  List<NumerousOrderStatus> selectOrderResultListByState(@Param("state") String state);

  NumerousOrderStatus selectOrderResultByUuid(@Param("uuid") String uuid);

}
