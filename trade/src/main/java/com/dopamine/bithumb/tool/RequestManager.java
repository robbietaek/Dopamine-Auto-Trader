package com.dopamine.bithumb.tool;


import com.dopamine.bithumb.trade.model.account.Account;
import com.dopamine.bithumb.trade.model.ask_price.AskPrice;
import com.dopamine.bithumb.trade.model.buy.Buy;
import com.dopamine.bithumb.trade.model.current_price.CurrentPrice;
import com.dopamine.bithumb.trade.model.order_success_info.OrderSuccessInfo;
import com.dopamine.bithumb.trade.model.sell.Sell;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Slf4j
public final class RequestManager {

  public static Account getAccountInfo(String apiConnectKey, String apiSecretKey) {
    Account account = new Account();
    ApiClient api = new ApiClient(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("currency", "ALL");

    try {
      account = (Account) api.callBithumbApi("/info/balance", rgParams, Account.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return account;
  }

  public static OrderSuccessInfo getOrderSuccessInfo(String apiConnectKey,
      String apiSecretKey, String searchGb, String coinName) {
    OrderSuccessInfo orderSuccessInfo = new OrderSuccessInfo();
    ApiClient api = new ApiClient(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("offset", "0");
    rgParams.put("count", "5");
    // searchGb 0 : 전체, 1 : 매수 완료, 2 : 매도 완료
    rgParams.put("searchGb", searchGb);
    rgParams.put("order_currency", coinName);
    rgParams.put("payment_currency", "KRW");

    try {
      orderSuccessInfo = (OrderSuccessInfo) api.callBithumbApi("/info/user_transactions", rgParams,
          OrderSuccessInfo.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return orderSuccessInfo;
  }

  public static Sell addCurrentPriceSellOrder(String apiConnectKey,
      String apiSecretKey, String sellUnits, String coinName) {
    Sell sellInfo = new Sell();
    ApiClient api = new ApiClient(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("units", sellUnits);
    rgParams.put("order_currency", coinName);
    rgParams.put("payment_currency", "KRW");

    try {
      sellInfo = (Sell) api.callBithumbApi("/trade/market_sell", rgParams,
          Sell.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return sellInfo;
  }

  public static Sell addSelectPriceSellOrder(String apiConnectKey,
      String apiSecretKey, String sellUnits, String price, String coinName) {
    Sell sellInfo = new Sell();
    ApiClient api = new ApiClient(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("order_currency", coinName);
    rgParams.put("payment_currency", "KRW");
    rgParams.put("units", sellUnits);
    rgParams.put("price", price);
    rgParams.put("type", "ask");

    try {
      sellInfo = (Sell) api.callBithumbApi("/trade/place", rgParams,
          Sell.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return sellInfo;
  }

  public static Buy addCurrentPriceBuyOrder(String apiConnectKey,
      String apiSecretKey, String buyUnits, String coinName) {
    Buy buyInfo = new Buy();
    ApiClient api = new ApiClient(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("units", buyUnits);
    rgParams.put("order_currency", coinName);
    rgParams.put("payment_currency", "KRW");

    try {
      buyInfo = (Buy) api.callBithumbApi("/trade/market_buy", rgParams,
          Buy.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return buyInfo;
  }

  public static Buy addSelectPriceBuyOrder(String apiConnectKey,
      String apiSecretKey, String buyUnits, String price, String coinName) {
    Buy buyInfo = new Buy();
    ApiClient api = new ApiClient(apiConnectKey, apiSecretKey);

    HashMap<String, String> rgParams = new HashMap<String, String>();
    rgParams.put("order_currency", coinName);
    rgParams.put("payment_currency", "KRW");
    rgParams.put("units", buyUnits);
    rgParams.put("price", price);
    rgParams.put("type", "bid");

    try {
      buyInfo = (Buy) api.callBithumbApi("/trade/place", rgParams,
          Buy.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return buyInfo;
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

  public static CurrentPrice getCurrentPrice() {

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<CurrentPrice> responseEntity = null;
    try {
      responseEntity = restTemplate.getForEntity("https://api.bithumb.com/public/ticker/ALL_KRW",
          CurrentPrice.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    if (responseEntity.getStatusCode().value() == 400) {
      log.error("response status : {}", responseEntity.getStatusCode().value());
    }

    return responseEntity.getBody();
  }


}
