package com.dopamine.upbit.tool;

import com.dopamine.upbit.trade.model.accounts.Accounts;
import com.dopamine.upbit.trade.model.order.chance.Chance;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

@Slf4j
public final class RequestManager {

  private static final String serverUrl = "https://api.upbit.com";
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static List<Accounts> getAccounts(String accessKey, String secretKey) {
    String authenticationToken = JwtTokenManager.getMethodJwt(accessKey, secretKey);
    List<Accounts> accounts = new ArrayList<>();
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(serverUrl + "/v1/accounts");
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      accounts = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"),
          new TypeReference<List<Accounts>>() {
          });

    } catch (IOException e) {
      e.printStackTrace();
    }

    return accounts;
  }

  public static Chance getChance(String accessKey, String secretKey) {
    HashMap<String, String> params = new HashMap<>();
    params.put("market", "KRW-BTC");

    ArrayList<String> queryElements = new ArrayList<>();
    for (Map.Entry<String, String> entity : params.entrySet()) {
      queryElements.add(entity.getKey() + "=" + entity.getValue());
    }
    String queryString = String.join("&", queryElements.toArray(new String[0]));
    String authenticationToken = JwtTokenManager.getMethodJwt(accessKey, secretKey, queryString);
    Chance chance = new Chance();

    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(serverUrl + "/v1/orders/chance?" + queryString);
      request.setHeader("Content-Type", "application/json");
      request.addHeader("Authorization", authenticationToken);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      chance = objectMapper.readValue(EntityUtils.toString(entity, "UTF-8"), Chance.class);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return chance;
  }


}
