package com.dopamine.trade.service;

import com.dopamine.api_call.model.response.statistics.TopSortedMarket;
import com.dopamine.api_call.model.response.statistics.UpbitMarketIndex;
import com.dopamine.api_call.model.response.statistics.UpbitMarketIndexCandle;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Service
@RequiredArgsConstructor
public class StatisticsService {

  private final RestTemplate restTemplate;
  private final ObjectMapper objectMapper;

  public UpbitMarketIndex getUpbitMarketIndex() {
    URI uri = UriComponentsBuilder
        .fromUriString("https://ubci-api.ubcindex.com")
        .path("/v1/crix/index/recents")
        .queryParam("codes", "IDX.UPBIT.UBMI")
        .encode()
        .build()
        .toUri();
    ResponseEntity<UpbitMarketIndex[]> responseEntity = restTemplate.getForEntity(uri,
        UpbitMarketIndex[].class);
    UpbitMarketIndex[] upbitMarketIndexArray = responseEntity.getBody();
    return upbitMarketIndexArray[0];
  }

  public List<UpbitMarketIndexCandle> getOneDayUpbitMarektIndexCandleList() {
    URI uri = UriComponentsBuilder
        .fromUriString("https://ubci-api.ubcindex.com")
        .path("/v1/crix/candles/minutes/5")
        .queryParam("code", "IDX.UPBIT.UBMI")
        .queryParam("count", "288")
        .encode()
        .build()
        .toUri();
    ResponseEntity<UpbitMarketIndexCandle[]> responseEntity = restTemplate.getForEntity(uri,
        UpbitMarketIndexCandle[].class);
    return new ArrayList<>(Arrays.asList(responseEntity.getBody()));
  }

  public List<String> getTopThirtyMarketList() {
    URI uri = UriComponentsBuilder
        .fromUriString("https://ubci-api.ubcindex.com")
        .path("/v1/crix/index/baskets")
        .queryParam("code", "IDX.UPBIT.UTHI")
        .encode()
        .build()
        .toUri();
    ResponseEntity<TopSortedMarket> responseEntity = restTemplate.getForEntity(uri,
        TopSortedMarket.class);
    TopSortedMarket topSortedMarket = responseEntity.getBody();
    return topSortedMarket.getTopThirtyMarketList();
  }


}
