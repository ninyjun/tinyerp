package com.ninyjun.tinyerp.account.acctsdk.model;

import java.util.List;

public class AccountDTO {
    public Account getAccount() {
        return account;
    }

    public AccountDTO() {
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "account=" + account +
                ", extras=" + extras +
                ", bankAcctnos=" + bankAcctnos +
                '}';
    }

    public AccountDTO(Account account, List<AccountExtra> extras, List<AccountBankAcctno> bankAcctnos) {
        this.account = account;
        this.extras = extras;
        this.bankAcctnos = bankAcctnos;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<AccountExtra> getExtras() {
        return extras;
    }

    public void setExtras(List<AccountExtra> extras) {
        this.extras = extras;
    }

    public List<AccountBankAcctno> getBankAcctnos() {
        return bankAcctnos;
    }

    public void setBankAcctnos(List<AccountBankAcctno> bankAcctnos) {
        this.bankAcctnos = bankAcctnos;
    }

    private Account account;
    private List<AccountExtra> extras;
    private List<AccountBankAcctno> bankAcctnos;
}
