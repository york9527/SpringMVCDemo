package com.coderyu.Domain;

import java.math.BigDecimal;
import java.util.Date;

public class SalesOrderItem {
    private Long id;
    private Long salesOrderId;
    private Date createTime;
    private Long createBy;
    private int qty;
    private BigDecimal price;
    private Long productId;
    private String customerNote;

    public SalesOrderItem(){}
    public SalesOrderItem(Long salesOrderId,Date createTime,Long createBy,
                          int qty,BigDecimal price,Long productId,String customerNote){

        this.salesOrderId = salesOrderId;
        this.createTime = createTime;
        this.createBy = createBy;
        this.qty = qty;
        this.price = price;
        this.productId = productId;
        this.customerNote = customerNote;
    }

    public Long getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(Long salesOrderId) {
        this.salesOrderId = salesOrderId;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
