package com.ninyjun.tinyerp.account.acctsdk.model;

import java.util.List;

public class AccountBalanceDTO {
    private AccountBalance acctBalance;

    public AccountBalance getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(AccountBalance acctBalance) {
        this.acctBalance = acctBalance;
    }

    public List<AccountBalanceExtra> getAcctBalanceExtras() {
        return acctBalanceExtras;
    }

    public void setAcctBalanceExtras(List<AccountBalanceExtra> acctBalanceExtras) {
        this.acctBalanceExtras = acctBalanceExtras;
    }

    public AccountBalanceDTO() {
    }

    public AccountBalanceDTO(AccountBalance acctBalance, List<AccountBalanceExtra> acctBalanceExtras) {
        this.acctBalance = acctBalance;
        this.acctBalanceExtras = acctBalanceExtras;
    }

    private List<AccountBalanceExtra> acctBalanceExtras;



}
