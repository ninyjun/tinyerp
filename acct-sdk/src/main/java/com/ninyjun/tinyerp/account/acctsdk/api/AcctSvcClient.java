package com.ninyjun.tinyerp.account.acctsdk.api;


import com.ninyjun.tinyerp.account.acctsdk.model.AccountDTO;

import com.ninyjun.tinyerp.common.httpresult.HttpResult;
import com.ninyjun.tinyerp.common.svcclient.SvcClientBase;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;


public class AcctSvcClient extends SvcClientBase {


    public AcctSvcClient() {
        this.setHttpSvc("acctsvc","/");
    }

    public AcctSvcClient(String svcName) {
        this.setHttpSvc(svcName,"/");
    }


    public void createAccount(AccountDTO acct){

    }


    public AccountDTO getByAcctId(Long acctId) {
        setUrl("/v1/account/" + acctId.toString());

        //方法1:
        //String acct1  = restTemp.getForObject(this.getApiUrl() + acctId.toString()
        //        ,String.class);
        //HttpResult<Account>  resultAccount = JSON.parseObject(acct1,new HttpResult<Account>().getClass());


        //方法2：报错
       // HttpResult<Account> acct  = restTemp.getForObject(this.getApiUrl() + acctId.toString()
        //        ,new HttpResult.class);


        //方法3：方法也行
        HttpResult<AccountDTO> response = restTemp.exchange(this.getApiUrl(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference< HttpResult<AccountDTO> >() {}).getBody();


        return response.getData();
    }
}
