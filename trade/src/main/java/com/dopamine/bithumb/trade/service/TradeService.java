package com.dopamine.bithumb.trade.service;

import com.dopamine.bithumb.common.ApiCaller;
import com.dopamine.bithumb.trade.model.current_price.CurrentPrice;
import com.dopamine.bithumb.trade.type.CoinName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TradeService {

  public CoinName getMostFluctateCoinName(String exceptionCoin) {
    CurrentPrice currentPrice = ApiCaller.getCurrentPrice();
    Map<String, Double> fluctateRate24H = new HashMap<>();

    for (String coinName : currentPrice.getData().getAllCoinCurrentPrice().keySet()) {
      fluctateRate24H.put(coinName,
          Double.parseDouble(
              currentPrice.getData().getAllCoinCurrentPrice().get(coinName).getFluctateRate24H()));
    }

    List<String> coinKeySet = new ArrayList<>(fluctateRate24H.keySet());
    coinKeySet.remove(exceptionCoin);
    coinKeySet.sort((o1, o2) -> fluctateRate24H.get(o2).compareTo(fluctateRate24H.get(o1)));

    return CoinName.valueOf(coinKeySet.get(5));
  }


}
