package com.jml1024.core.domain;

import com.jml1024.common.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * @author Evil
 * @date 2024年3月21日
 *
 * 支付订单
 */
public class TPay extends BaseEntity {
    private String payNo;

    private String orderNo;

    private Long userId;

    private BigDecimal amount;

    private Boolean deleted;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
