package com.ninyjun.tinyerp.account.acctsvc.controller;

import com.ninyjun.tinyerp.account.acctsdk.model.AccountDTO;
import com.ninyjun.tinyerp.account.acctsvc.repository.AccountSequenceMapper;
import com.ninyjun.tinyerp.account.acctsvc.service.AccountService;
import com.ninyjun.tinyerp.common.httpresult.CodeMessage;
import com.ninyjun.tinyerp.common.httpresult.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService acctService;

    @Autowired
    AccountSequenceMapper acctSeqRepo;


    @GetMapping(value = "/v1/account/{acctid}", produces = "application/json;charset=utf-8")
    @ResponseBody
    public HttpResult<AccountDTO> getAccount(@PathVariable(value = "acctid", required = true) Long acctid) {
        AccountDTO acct = null;
        try {
            acct = acctService.getAccountByAcctId(acctid);
            if (acct == null) {
                return HttpResult.error(CodeMessage.ACCT_NOT_EXIST.fillArgs(acctid.toString()));
            }
        } catch (Exception ex) {
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(acct);
    }

    @PostMapping("/v1/account")
    @ResponseBody
    public HttpResult<AccountDTO> createAccount(@RequestBody AccountDTO acctDTO) {

        try {

            if (acctDTO == null || acctDTO.getAccount() == null)
                throw new Exception("帐户内容不能为空!");

            acctService.createAccount(acctDTO.getAccount(),acctDTO.getBankAcctnos(),acctDTO.getExtras());

        }catch(Exception ex){
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return getAccount(acctDTO.getAccount().getAcctId());
    }

    // http://localhost:8080/v1/account/accountseq?limit=123
    @GetMapping(value = "/v1/account/accountseq", produces = "application/json;charset=utf-8")
    @ResponseBody
    public HttpResult<List<Long> > getAccountSeq(@RequestParam(value="limit") Integer  limit) {

        if (limit <= 0 || limit > 100)
            limit = 1;

        List<Long> acctIds =  acctSeqRepo.getMultiAcctId(limit);

        try {
            if (acctIds.size() == 0)
                throw new Exception("获取帐户id序列失败,确认sequence_dual表中存在数据！");
        } catch (Exception ex) {
            HttpResult.error(CodeMessage.DATABASE_ERROR.fillArgs(ex.toString()));
        }

        return HttpResult.success(acctIds);
    }

    @GetMapping(value = "/health")
    @ResponseBody
    public String healthCheck() {
        return "OK";
    }

}