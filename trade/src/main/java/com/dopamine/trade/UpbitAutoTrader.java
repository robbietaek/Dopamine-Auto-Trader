package com.dopamine.trade;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.trade.service.AccountService;
import com.dopamine.trade.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UpbitAutoTrader {

  private final AccountService accountService;
  private final OrderService orderService;

  @Scheduled(cron = "*/5 * * * * *")
  public void autoTrading() {

    System.out.println(QuotationRequestManager.getMarketCodeList());
  }

}
