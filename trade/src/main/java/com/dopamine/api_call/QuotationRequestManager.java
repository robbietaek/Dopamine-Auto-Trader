package com.dopamine.api_call;

import com.dopamine.api_call.model.response.quotation.candles.minute.Minute;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.api_call.model.response.quotation.order_book.OrderBook;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public final class QuotationRequestManager {

  private static final String serverUrl = "https://api.upbit.com";
  private static final ObjectMapper objectMapper = new ObjectMapper();


  public static List<MarketCode> getMarketCodeList() {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
        .url(serverUrl + "/v1/market/all?isDetails=true")
        .get()
        .addHeader("accept", "application/json")
        .build();

    List<MarketCode> marketCodeList = new ArrayList<>();
    try {
      Response response = client.newCall(request).execute();
      marketCodeList = objectMapper.readValue(response.body().string(),
          new TypeReference<List<MarketCode>>() {
          });
    } catch (Exception e) {
      e.printStackTrace();
    }

    return marketCodeList;
  }

  public static List<CurrentPrice> getTickerCurrentPrice(List<String> markets) {

    if (markets.size() == 0) {
      return new ArrayList<CurrentPrice>();
    }

    OkHttpClient client = new OkHttpClient();

    ArrayList<String> queryElements = new ArrayList<>();
    for (String market : markets) {
      queryElements.add("markets=" + market);
    }
    String queryString = String.join("&", queryElements.toArray(new String[0]));

    Request request = new Request.Builder()
        .url(serverUrl + "/v1/ticker?" + queryString)
        .get()
        .addHeader("accept", "application/json")
        .build();
    List<CurrentPrice> currentPrice = new ArrayList<>();
    try {
      Response response = client.newCall(request).execute();
      currentPrice = objectMapper.readValue(response.body().string(),
          new TypeReference<List<CurrentPrice>>() {
          });
    } catch (Exception e) {
      e.printStackTrace();
    }

    return currentPrice;
  }

  public static CurrentPrice getOneTickerCurrentPrice(String markets) {
    return getTickerCurrentPrice(List.of(markets)).get(0);
  }

  public static List<OrderBook> getOrderBookList(List<String> markets) {

    if (markets.size() == 0) {
      return new ArrayList<OrderBook>();
    }

    OkHttpClient client = new OkHttpClient();

    ArrayList<String> queryElements = new ArrayList<>();
    for (String market : markets) {
      queryElements.add("markets=" + market);
    }
    String queryString = String.join("&", queryElements.toArray(new String[0]));

    Request request = new Request.Builder()
        .url(serverUrl + "/v1/orderbook?" + queryString)
        .get()
        .addHeader("accept", "application/json")
        .build();
    List<OrderBook> orderBookList = new ArrayList<>();
    try {
      Response response = client.newCall(request).execute();
      orderBookList = objectMapper.readValue(response.body().string(),
          new TypeReference<List<OrderBook>>() {
          });
    } catch (Exception e) {
      e.printStackTrace();
    }

    return orderBookList;
  }

  public static List<Minute> getMinuteCandleList(String market, String count) {
    OkHttpClient client = new OkHttpClient();

    ArrayList<String> queryElements = new ArrayList<>();
    queryElements.add("market=" + market);
    queryElements.add("count=" + count);

    String queryString = String.join("&", queryElements.toArray(new String[0]));

    Request request = new Request.Builder()
        .url(serverUrl + "/v1/candles/minutes/1?" + queryString)
        .get()
        .addHeader("accept", "application/json")
        .build();
    List<Minute> minuteCancleList = new ArrayList<>();
    try {
      Response response = client.newCall(request).execute();
      minuteCancleList = objectMapper.readValue(response.body().string(),
          new TypeReference<List<Minute>>() {
          });
      Thread.sleep(50);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return minuteCancleList;
  }

}
