package com.dopamine.record.service;

import com.dopamine.api_call.OrderRequestManager;
import com.dopamine.api_call.model.response.order.individual.IndividualOrderStatus;
import com.dopamine.api_call.model.response.order.numerous.NumerousOrderStatus;
import com.dopamine.api_call.type.OrderBy;
import com.dopamine.api_call.type.OrderStatus;
import com.dopamine.record.dao.RecordDao;
import com.dopamine.trade.dao.OrderDao;
import com.dopamine.trade.model.OrderHistoryGroupByMarket;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderRecordService {

  private final OrderDao orderDao;
  private final RecordDao recordDao;

  public void addRecentOrderResult(Integer limit) {
    List<OrderHistoryGroupByMarket> orderHistoryGroupByMarket = orderDao.selectOrderHistoryGroupByMarket(
        limit);

    if (orderHistoryGroupByMarket.isEmpty()) {
      return;
    }

    for (OrderHistoryGroupByMarket order : orderHistoryGroupByMarket) {
      List<NumerousOrderStatus> numerousOrderStatuseList = OrderRequestManager.getNumerousOrderStatus(
          order.getMarket(), order.getUuidList(), null,
          new OrderStatus[]{OrderStatus.CANCEL, OrderStatus.DONE}, 1, limit, OrderBy.DESC
      );

      for (NumerousOrderStatus numerousOrderStatus : numerousOrderStatuseList) {
        if (numerousOrderStatus.getPrice() == null || numerousOrderStatus.getVolume() == null) {
          IndividualOrderStatus individualOrderStatus = OrderRequestManager.getIndividualOrderStatus(
              numerousOrderStatus.getUuid());

          numerousOrderStatus.setPrice(String.valueOf(individualOrderStatus.getTrades().stream()
              .mapToDouble(funds -> Double.parseDouble(funds.getFunds())).sum()));

          numerousOrderStatus.setVolume(String.valueOf(individualOrderStatus.getTrades().stream()
              .mapToDouble(volume -> Double.parseDouble(volume.getVolume())).sum()));
        }
      }
      if (!numerousOrderStatuseList.isEmpty()) {
        recordDao.insertOrderResultList(numerousOrderStatuseList);
      }
    }
  }

  public NumerousOrderStatus getOrderResultByUuid(String uuid) {
    return recordDao.selectOrderResultByUuid(uuid);
  }

}
