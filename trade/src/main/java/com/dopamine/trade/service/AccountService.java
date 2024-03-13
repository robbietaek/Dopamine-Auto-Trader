package com.dopamine.trade.service;

import com.dopamine.api_call.AccountRequestManager;
import com.dopamine.api_call.model.response.accounts.Accounts;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

  public double getKRWStatus() {
    List<Accounts> accounts = AccountRequestManager.getAccounts();
    double krw = 0d;
    for (Accounts account : accounts) {
      if (account.getCurrency().equals("KRW-KRW")) {
        krw = Double.parseDouble(account.getBalance());
        break;
      }
    }

    return krw;
  }

  public List<Accounts> getCoinAccountList() {
    List<Accounts> accounts = AccountRequestManager.getAccounts();
    return accounts.stream().filter(account -> !account.getCurrency().equals("KRW-KRW")).toList();
  }

}
