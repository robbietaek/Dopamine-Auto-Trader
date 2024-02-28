package com.dopamine.upbit.trade;

import com.dopamine.upbit.tool.RequestManager;
import com.dopamine.upbit.trade.model.accounts.Accounts;
import com.dopamine.upbit.trade.model.order.chance.Chance;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UpbitAutoTrader {

  @Value("${upbit.accessKey}")
  private String accessKey;
  @Value("${upbit.secretKey}")
  private String secretKey;

  @Scheduled(cron = "*/10 * * * * *")
  public void autoTrading() {

    List<Accounts> accounts = RequestManager.getAccounts(accessKey, secretKey);
    System.out.println(accounts);

    Chance chance = RequestManager.getChance(accessKey, secretKey);
    System.out.println(chance);
  }

}
