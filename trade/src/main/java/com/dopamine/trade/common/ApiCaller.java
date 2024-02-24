package com.dopamine.trade.common;


import com.dopamine.trade.auto.model.Account.Account;
import com.dopamine.trade.auto.model.AskPrice.AskPrice;
import com.dopamine.trade.bithumb.Api_Client;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Slf4j
public final class ApiCaller {

  public static Account getAccountInfo(String apiConnectKey, String apiSecretKey) {
    Account account = new Account();
    Api_Client api = new Api_Client(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("currency", "ALL");

    try {
      account = api.callApi("/info/balance", rgParams);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return account;
  }

  public static AskPrice getAskPrice() {

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<AskPrice> responseEntity = null;
    try {
      responseEntity = restTemplate.getForEntity("https://api.bithumb.com/public/orderbook/ALL_KRW",
          AskPrice.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    if (responseEntity.getStatusCode().value() == 400) {
      log.error("response status : {}", responseEntity.getStatusCode().value());
    }

    return responseEntity.getBody();
  }


}
