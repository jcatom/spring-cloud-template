package com.jmll1024.user.dto;

import java.io.Serializable;

public class TestDTO implements Serializable {
    private String orderNo;
    private String payStatus;
    private String userId;
    private String payTime;
    private String orderAmount;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "orderNo='" + orderNo + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", userId='" + userId + '\'' +
                ", payTime='" + payTime + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                '}';
    }
}
