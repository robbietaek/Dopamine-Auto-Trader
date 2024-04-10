package com.dopamine.trade.service;

import com.dopamine.api_call.AccountRequestManager;
import com.dopamine.api_call.QuotationRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import com.dopamine.api_call.model.response.quotation.current_price.CurrentPrice;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

  public Double getKRWStatus() {
    List<Accounts> accountList = AccountRequestManager.getAccounts();
    double krw = 0d;
    for (Accounts account : accountList) {
      if (account.getCurrency().equals("KRW-KRW")) {
        krw = Double.parseDouble(account.getBalance());
        break;
      }
    }

    return krw;
  }

  public List<Accounts> getCoinAccountList() {
    List<Accounts> accountList = AccountRequestManager.getAccounts();
    return accountList.stream().filter(account -> !account.getCurrency().equals("KRW-KRW"))
        .toList();
  }

  public Double getCurrentTotalAccountKrw() {
    List<Accounts> accountList = AccountRequestManager.getAccounts();
    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
        getCoinAccountList().stream().map(Accounts::getCurrency).collect(
            Collectors.toList()));
    double totalKrw = 0l;

    for (Accounts account : accountList) {
      if (account.getCurrency().equals("KRW-KRW")) {
        totalKrw += Double.parseDouble(account.getBalance());
      } else if (account.getBalance().equals("0") && !account.getLocked().equals("0")) {
        totalKrw += Double.parseDouble(account.getLocked()) * currentPriceList.stream()
            .filter(market -> market.getMarket().equals(account.getCurrency())).findFirst()
            .map(CurrentPrice::getTradePrice).get();
      } else {
        totalKrw += Double.parseDouble(account.getBalance()) * currentPriceList.stream()
            .filter(market -> market.getMarket().equals(account.getCurrency())).findFirst()
            .map(CurrentPrice::getTradePrice).get();
      }
    }

    return totalKrw;
  }

  public Double getPurchaseTotalAccountKrw() {
    List<Accounts> accountList = AccountRequestManager.getAccounts();
    List<CurrentPrice> currentPriceList = QuotationRequestManager.getTickerCurrentPrice(
        getCoinAccountList().stream().map(Accounts::getCurrency).collect(
            Collectors.toList()));
    double totalKrw = 0l;

    for (Accounts account : accountList) {
      if (account.getCurrency().equals("KRW-KRW")) {
        totalKrw += Double.parseDouble(account.getBalance());
      } else if (account.getBalance().equals("0") && !account.getLocked().equals("0")) {
        totalKrw +=
            Double.parseDouble(account.getLocked()) * Double.parseDouble(account.getAvgBuyPrice());
      } else {
        totalKrw +=
            Double.parseDouble(account.getBalance()) * Double.parseDouble(account.getAvgBuyPrice());
      }
    }

    return totalKrw;
  }

}
