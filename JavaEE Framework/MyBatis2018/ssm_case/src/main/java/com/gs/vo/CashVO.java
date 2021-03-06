package com.gs.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/8.
 */
public class CashVO {

    private Long id;
    private BigDecimal money;
    private String cashCustomer;
    private Date cashTime;
    private Long cashTypePid;
    private Long cashTypeId;
    private String cashType;
    private Long payTypeId;

    public Long getCashTypePid() {
        return cashTypePid;
    }

    public void setCashTypePid(Long cashTypePid) {
        this.cashTypePid = cashTypePid;
    }

    public Long getCashTypeId() {
        return cashTypeId;
    }

    public void setCashTypeId(Long cashTypeId) {
        this.cashTypeId = cashTypeId;
    }

    public Long getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Long payTypeId) {
        this.payTypeId = payTypeId;
    }

    private String payType;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getCashCustomer() {
        return cashCustomer;
    }

    public void setCashCustomer(String cashCustomer) {
        this.cashCustomer = cashCustomer;
    }

    public Date getCashTime() {
        return cashTime;
    }

    public void setCashTime(Date cashTime) {
        this.cashTime = cashTime;
    }

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
