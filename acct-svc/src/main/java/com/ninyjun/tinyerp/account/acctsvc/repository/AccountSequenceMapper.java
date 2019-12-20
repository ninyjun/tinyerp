package com.ninyjun.tinyerp.account.acctsvc.repository;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountSequenceMapper {

    @Select({
            "select",
            "seq_acctid() as ACCT_ID from sequence_dual limit #{count,jdbcType=INTEGER} "
    })
    //@ResultType(Long.class)
    List<Long> getMultiAcctId(Integer count);


    @Select({
            "select",
            "seq_acctid() "
    })

    @ResultType(Long.class)
    Long getAcctId();
}