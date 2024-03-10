package com.dopamine.api_call;

import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.tool.JwtTokenManager;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public final class AccountRequestManager {

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

  public static List<Accounts> getAccounts() {
    String authenticationToken = JwtTokenManager.getJwtToken(accessKey, secretKey);
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

}
