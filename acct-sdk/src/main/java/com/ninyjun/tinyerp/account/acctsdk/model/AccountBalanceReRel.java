package com.ninyjun.tinyerp.account.acctsdk.model;

public class AccountBalanceReRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE_RE_REL.ACCT_BALANCE_RE_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long acctBalanceReId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE_RE_REL.RELATION_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Long relationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BALANCE_RE_REL.TRADE_TYPE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    private Integer tradeType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE_RE_REL.ACCT_BALANCE_RE_ID
     *
     * @return the value of ACCOUNT_BALANCE_RE_REL.ACCT_BALANCE_RE_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getAcctBalanceReId() {
        return acctBalanceReId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE_RE_REL.ACCT_BALANCE_RE_ID
     *
     * @param acctBalanceReId the value for ACCOUNT_BALANCE_RE_REL.ACCT_BALANCE_RE_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setAcctBalanceReId(Long acctBalanceReId) {
        this.acctBalanceReId = acctBalanceReId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE_RE_REL.RELATION_ID
     *
     * @return the value of ACCOUNT_BALANCE_RE_REL.RELATION_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Long getRelationId() {
        return relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE_RE_REL.RELATION_ID
     *
     * @param relationId the value for ACCOUNT_BALANCE_RE_REL.RELATION_ID
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BALANCE_RE_REL.TRADE_TYPE
     *
     * @return the value of ACCOUNT_BALANCE_RE_REL.TRADE_TYPE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public Integer getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BALANCE_RE_REL.TRADE_TYPE
     *
     * @param tradeType the value for ACCOUNT_BALANCE_RE_REL.TRADE_TYPE
     *
     * @mbg.generated Sat Nov 30 11:41:45 CST 2019
     */
    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }
}