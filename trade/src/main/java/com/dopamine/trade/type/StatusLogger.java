package com.dopamine.trade.type;

import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import com.dopamine.api_call.model.response.quotation.market_code.MarketCode;
import com.dopamine.common.service.CommonService;
import com.dopamine.trade.service.AccountService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StatusLogger {

  private final CommonService commonService;
  private final AccountService accountService;

  @Scheduled(fixedRate = 5000)
  public void loggingMarketStatus() {
    List<MarketCode> marketCodeList = QuotationRequestManager.getMarketCodeList().stream()
        .filter(market -> market.getMarket().startsWith("KRW")).toList();
    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
        marketCodeList.stream().map(MarketCode::getMarket).collect(Collectors.toList()));
    double currentTotalAccountKrw = accountService.getCurrentTotalAccountKrw();
    List<Accounts> coinAccountList = accountService.getCoinAccountList();

    long currentRiseCoinCount = currentPriceList.stream()
        .filter(price -> price.getChange().equals("RISE")).count();
    long currentEvenCoinCount = currentPriceList.stream()
        .filter(price -> price.getChange().equals("EVEN")).count();
    long currentFallCoinCount = currentPriceList.stream()
        .filter(price -> price.getChange().equals("FALL")).count();
    double riseCoinPercent = Double.parseDouble(
        commonService.getConfig("BID", "rise_coin_percent"));
    String valueLevel = commonService.getConfig("BID", "value_level");

    log.info(
        "[일반정보] 상승 : {}개, 보합 : {}개, 하락 : {}개, 상승퍼센트 설정값 : {}, 전일대비 레벨 : {}, 평가자산 : {}원, 보유코인 : {}",
        currentRiseCoinCount,
        currentEvenCoinCount,
        currentFallCoinCount,
        riseCoinPercent,
        valueLevel,
        String.format("%,.2f", currentTotalAccountKrw),
        coinAccountList.stream().map(a -> a.getCurrency().replace("KRW-", "")).sorted().toList());
  }

}
