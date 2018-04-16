package com.coderyu.Domain;

import java.math.BigDecimal;
import java.util.Date;

public class SalesOrder {
    private Long id;
    private Date createTime;
    private Long createBy;
    private BigDecimal amount;

    public SalesOrder(){}
    public SalesOrder(Date createTime,Long createBy,BigDecimal amount){
        this.createTime = createTime;
        this.createBy = createBy;
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
