package com.dopamine.record;

import com.dopamine.record.service.OrderRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderRecorder {

  private final OrderRecordService orderRecordService;

  public void recordOrderInformation() {
    orderRecordService.addRecentOrderResult(30);
  }


}
