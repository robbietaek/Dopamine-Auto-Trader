package com.dopamine;

import static com.dopamine.trade.AutoTrader.stopWatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TradeApplication {

  public static void main(String[] args) {
    SpringApplication.run(TradeApplication.class, args);
    stopWatch.start();
  }

}
