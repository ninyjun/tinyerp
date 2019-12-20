package com.ninyjun.tinyerp.account.acctsvc.service.impl;

import com.ninyjun.tinyerp.account.acctsdk.model.Account;
import com.ninyjun.tinyerp.account.acctsdk.model.AccountBankAcctno;
import com.ninyjun.tinyerp.account.acctsdk.model.AccountDTO;
import com.ninyjun.tinyerp.account.acctsdk.model.AccountExtra;
import com.ninyjun.tinyerp.account.acctsvc.repository.AccountBankAcctnoMapper;
import com.ninyjun.tinyerp.account.acctsvc.repository.AccountExtraMapper;
import com.ninyjun.tinyerp.account.acctsvc.repository.AccountMapper;
import com.ninyjun.tinyerp.account.acctsvc.repository.AccountSequenceMapper;
import com.ninyjun.tinyerp.account.acctsvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper acctRepo;


    @Autowired
    private AccountExtraMapper acctExtraRepo;


    @Autowired
    private AccountBankAcctnoMapper acctBankAcctnoRepo;

    @Autowired
    AccountSequenceMapper acctSeqRepo;

    @Override
    public AccountDTO getAccountByAcctId(Long acctId) {

        Account acct = acctRepo.selectByPrimaryKey(acctId);
        List<AccountExtra> acctExtras = acctExtraRepo.selectByAcctId(acctId);
        List<AccountBankAcctno> acctBanks = acctBankAcctnoRepo.selectByAcctId(acctId);

        return new AccountDTO(acct, acctExtras, acctBanks);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 5000)
    public void createAccount(Account acct, List<AccountBankAcctno> acctBankNos, List<AccountExtra> acctExtras) throws Exception {

        if (acct == null) {
            throw new Exception("帐户信息不能为空！");
        }

        Account acctExist = null;
        if (acct.getAcctId() == null || acct.getAcctId().toString().length() == 0) {
            acct.setAcctId(acctSeqRepo.getAcctId());
        } else {
            acctExist = acctRepo.selectByPrimaryKey(acct.getAcctId());
        }

        //不存在帐户就创建
        if (acctExist == null) {
            acctRepo.insert(acct);
            if (acctBankNos != null) {
                for (AccountBankAcctno bankNo : acctBankNos) {
                    bankNo.setAcctId(acct.getAcctId());
                    acctBankAcctnoRepo.insert(bankNo);
                }
            }
            if (acctExtras != null) {
                for (AccountExtra acctExtra : acctExtras) {
                    acctExtra.setAcctId(acct.getAcctId());
                    acctExtraRepo.insert(acctExtra);
                }
            }
        }
    }
}