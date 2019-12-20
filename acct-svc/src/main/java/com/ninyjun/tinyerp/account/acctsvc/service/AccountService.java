package com.ninyjun.tinyerp.account.acctsvc.service;

import com.ninyjun.tinyerp.account.acctsdk.model.Account;
import com.ninyjun.tinyerp.account.acctsdk.model.AccountBankAcctno;
import com.ninyjun.tinyerp.account.acctsdk.model.AccountDTO;
import com.ninyjun.tinyerp.account.acctsdk.model.AccountExtra;

import java.util.List;

public interface AccountService {
    AccountDTO getAccountByAcctId(Long acctId);

    void createAccount(Account acct, List<AccountBankAcctno> acctBankNos, List<AccountExtra> acctExtras) throws Exception;

}
