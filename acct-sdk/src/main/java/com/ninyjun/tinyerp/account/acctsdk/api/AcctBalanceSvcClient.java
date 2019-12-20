package com.ninyjun.tinyerp.account.acctsdk.api;

import com.ninyjun.tinyerp.account.acctsdk.model.AccountBalanceDTO;
import com.ninyjun.tinyerp.common.httpresult.HttpResult;
import com.ninyjun.tinyerp.common.svcclient.SvcClientBase;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import java.util.List;


public class AcctBalanceSvcClient extends SvcClientBase {


    public AcctBalanceSvcClient() {
        this.setHttpSvc("acctbalancesvc","/");
    }

    public AcctBalanceSvcClient(String svcName) {
        this.setHttpSvc(svcName,"/");
    }

    public List<AccountBalanceDTO> getByAcctId(Long acctId) {
        setUrl("/v1/accountbalance/" + acctId.toString());

        //方法1:
        //String acct1  = restTemp.getForObject(this.getApiUrl() + acctId.toString()
        //        ,String.class);
        //HttpResult<Account>  resultAccount = JSON.parseObject(acct1,new HttpResult<Account>().getClass());


        //方法2：报错
       // HttpResult<Account> acct  = restTemp.getForObject(this.getApiUrl() + acctId.toString()
        //        ,new HttpResult.class);


        //方法3：方法也行
        HttpResult< List<AccountBalanceDTO> > response = restTemp.exchange(this.getApiUrl(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference< HttpResult< List<AccountBalanceDTO> > >() {}).getBody();


        return response.getData();
    }
}
