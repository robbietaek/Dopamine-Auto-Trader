package com.dopamine.api_call;

import com.dopamine.api_call.model.response.order.available.OrderAvailable;
import com.dopamine.api_call.model.response.order.cancel.Cancel;
import com.dopamine.api_call.model.response.order.individual.IndividualOrderStatus;
import com.dopamine.api_call.model.response.order.numerous.NumerousOrderStatus;
import com.dopamine.api_call.model.response.order.order.Order;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.type.OrderBy;
import com.dopamine.api_call.type.OrderStatus;
import com.dopamine.api_call.type.OrderType;
import com.dopamine.api_call.type.Side;
import com.dopamine.tool.JwtTokenManager;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public final class OrderRequestManager {

  private static final String serverUrl = "https://api.upbit.com";
  private static final ObjectMapper objectMapper = new ObjectMapper();

  private static String accessKey;
  private static String secretKey;

  @Value("${upbit.accessKey}")
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  @Value("${upbit.secretKey}")
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public static OrderAvailable getOrderAvailable(String market) {
    HashMap<String, String> params = new HashMap<>();
    params.put("market", market);

    ArrayList<String> queryElements = new ArrayList<>();
    for (Map.Entry<String, String> entity : params.entrySet()) {
      queryElements.add(entity.getKey() + "=" + entity.getValue());
    }
    String queryString = String.join("&", queryElements.toArray(new String[0]));
    String authenticationToken = JwtTokenManager.getJwtToken(accessKey, secretKey, queryString);
    OrderAvailable orderAvailable = new OrderAvailable();

    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(serverUrl + "/v1/orders/chance?" + queryString);
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      orderAvailable = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"),
          OrderAvailable.class);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return orderAvailable;
  }

  public static IndividualOrderStatus getIndividualOrderStatus(String uuid) {
    HashMap<String, String> params = new HashMap<>();
    params.put("uuid", uuid);

    ArrayList<String> queryElements = new ArrayList<>();
    for (Map.Entry<String, String> entity : params.entrySet()) {
      queryElements.add(entity.getKey() + "=" + entity.getValue());
    }

    String queryString = String.join("&", queryElements.toArray(new String[0]));
    String authenticationToken = JwtTokenManager.getJwtToken(accessKey, secretKey, queryString);
    IndividualOrderStatus individualOrderStatus = new IndividualOrderStatus();

    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(serverUrl + "/v1/order?" + queryString);
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      individualOrderStatus = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"),
          IndividualOrderStatus.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return individualOrderStatus;
  }

  public static List<NumerousOrderStatus> getNumerousOrderStatus(String market, String[] uuids,
      OrderStatus state, OrderStatus[] states, Integer page, Integer limit, OrderBy orderBy) {
    HashMap<String, Object> params = new HashMap<>();
    params.put("market", market);
    params.put("page", page);
    params.put("limit", limit);
    params.put("order_by", orderBy.getValue());
    if (state != null) {
      params.put("state", state.getValue());
    }

    ArrayList<String> queryElements = new ArrayList<>();
    for (Map.Entry<String, Object> entity : params.entrySet()) {
      queryElements.add(entity.getKey() + "=" + entity.getValue());
    }
    for (String uuid : uuids) {
      queryElements.add("uuids[]=" + uuid);
    }

    for (OrderStatus stat : states) {
      queryElements.add("states[]=" + stat.getValue());
    }

    String queryString = String.join("&", queryElements.toArray(new String[0]));
    String authenticationToken = JwtTokenManager.getJwtToken(accessKey, secretKey, queryString);
    List<NumerousOrderStatus> numerousOrderStatus = new ArrayList<>();

    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(serverUrl + "/v1/orders?" + queryString);
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      numerousOrderStatus = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"),
          new TypeReference<List<NumerousOrderStatus>>() {
          });
    } catch (IOException e) {
      e.printStackTrace();
    }

    return numerousOrderStatus;
  }

  public static Order orderCoin(String market, Side side, String volume, double price,
      OrderType ordType) {

    HashMap<String, String> params = new HashMap<>();
    //코인명
    if (market.startsWith("KRW-")) {
      params.put("market", market);
    } else {
      params.put("market", "KRW-" + market);
    }

    //매수 bid, 매도 ask
    params.put("side", side.getValue());

    //주문타입 (limit : 지정가 주문, price : 시장가 주문(매수), market : 시장가 주문(매도))
    params.put("ord_type", ordType.getValue());

    // 시장가 주문(매수)
    if (ordType.equals(OrderType.PRICE)) {
      //시장가 매수 주문의 경우 ord_type을 price로 설정하고 volume을 null 혹은 제외해야됩니다.
      params.put("price", exchangeUnit(market, price));
    }
    //지정가 주문(매수)
    else if (ordType.equals(OrderType.LIMIT) && side.equals(Side.BID)) {
      params.put("price", exchangeUnit(market, price));
      params.put("volume", volume);
    }
    //시장가 주문(매도)
    else if (ordType.equals(OrderType.MARKET)) {
      //시장가 매도 주문의 경우 ord_type을 market로 설정하고 price을 null 혹은 제외해야됩니다.
      params.put("volume", volume);
    }
    //지정가 주문(매도)
    else if (ordType.equals(OrderType.LIMIT) && side.equals(Side.ASK)) {
      params.put("price", String.valueOf(price));
      params.put("volume", volume);
    }

    ArrayList<String> queryElements = new ArrayList<>();
    for (Map.Entry<String, String> entity : params.entrySet()) {
      queryElements.add(entity.getKey() + "=" + entity.getValue());
    }

    String queryString = String.join("&", queryElements.toArray(new String[0]));
    String authenticationToken = JwtTokenManager.getJwtToken(accessKey, secretKey, queryString);
    Order order = new Order();
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpPost request = new HttpPost(serverUrl + "/v1/orders");
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);
      request.setEntity(new StringEntity(new Gson().toJson(params)));

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      order = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"), Order.class);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return order;
  }

  public static Cancel cancelOrder(String uuid) {
    HashMap<String, String> params = new HashMap<>();
    params.put("uuid", uuid);

    ArrayList<String> queryElements = new ArrayList<>();
    for (Map.Entry<String, String> entity : params.entrySet()) {
      queryElements.add(entity.getKey() + "=" + entity.getValue());
    }

    String queryString = String.join("&", queryElements.toArray(new String[0]));
    String authenticationToken = JwtTokenManager.getJwtToken(accessKey, secretKey, queryString);
    Cancel cancel = new Cancel();

    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpDelete request = new HttpDelete(serverUrl + "/v1/order?" + queryString);
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();

      cancel = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"), Cancel.class);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return cancel;
  }

  private static String exchangeUnit(String market, double krw) {
    CurrentPrice currentPrice = QuotationRequestManager.getTickerCurrentPrice(List.of(market))
        .get(0);

    double tradePrice = currentPrice.getTradePrice();
    String returnPrice = "";

    if (tradePrice >= 1000000) {
      returnPrice = String.valueOf((Math.floor(krw * 0.001) / 0.001));
      returnPrice = returnPrice.substring(0, returnPrice.indexOf("."));
    } else if (tradePrice >= 100000) {
      returnPrice = String.valueOf((Math.floor(krw * 0.01) / 0.01));
      returnPrice = returnPrice.substring(0, returnPrice.indexOf("."));
    } else if (tradePrice >= 10000) {
      returnPrice = String.valueOf((Math.floor(krw * 0.1) / 0.1));
      returnPrice = returnPrice.substring(0, returnPrice.indexOf("."));
    } else if (tradePrice >= 1000) {
      returnPrice = String.valueOf((Math.floor(krw)));
      returnPrice = returnPrice.substring(0, returnPrice.indexOf("."));
    } else if (tradePrice >= 100) {
      returnPrice = String.valueOf((Math.floor(krw * 10) / 10));
    } else if (tradePrice >= 10) {
      returnPrice = String.valueOf((Math.floor(krw * 100) / 100));
    } else if (tradePrice >= 1) {
      returnPrice = String.valueOf((Math.floor(krw * 1000) / 1000));
    } else if (tradePrice >= 0.1d) {
      returnPrice = String.valueOf((Math.floor(krw * 10000) / 10000));
    } else if (tradePrice >= 0.01d) {
      returnPrice = String.valueOf((Math.floor(krw * 100000) / 100000));
    } else if (tradePrice >= 0.001d) {
      returnPrice = String.valueOf((Math.floor(krw * 1000000) / 1000000));
    } else if (tradePrice >= 0.0001d) {
      returnPrice = String.valueOf((Math.floor(krw * 1000000) / 10000000));
    }

    return returnPrice;
  }


}
