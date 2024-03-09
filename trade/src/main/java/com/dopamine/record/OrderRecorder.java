package com.dopamine.record;

import com.dopamine.record.service.OrderRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderRecorder {

  private final OrderRecordService orderRecordService;

  @Scheduled(cron = "*/5 * * * * *")
  public void recordOrderInformation() {
    orderRecordService.addRecentOrderResult(5);
  }


}
