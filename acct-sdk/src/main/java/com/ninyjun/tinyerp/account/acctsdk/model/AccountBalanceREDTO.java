package com.ninyjun.tinyerp.account.acctsdk.model;

public class AccountBalanceREDTO {

    private AccountBalanceRevenueExpend acctBalanceRevenueExpend;

    public AccountBalanceRevenueExpend getAcctBalanceRevenueExpend() {
        return acctBalanceRevenueExpend;
    }

    public void setAcctBalanceRevenueExpend(AccountBalanceRevenueExpend acctBalanceRevenueExpend) {
        this.acctBalanceRevenueExpend = acctBalanceRevenueExpend;
    }

    public AccountBalanceReRel getAccountBalanceReRel() {
        return accountBalanceReRel;
    }

    public void setAccountBalanceReRel(AccountBalanceReRel accountBalanceReRel) {
        this.accountBalanceReRel = accountBalanceReRel;
    }

    private AccountBalanceReRel accountBalanceReRel;
}
