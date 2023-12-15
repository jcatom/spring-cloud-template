package com.jml1024.lottery.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WechatJkpExpiryInfo {
    private Long id;

    private Long userId;

    private String orderNo;

    private String stationId;

    private String safeAreaCode;

    private String planName;

    private String planCode;

    private String produceOrder;

    private String ticketSn;

    private Boolean winLevel;

    private BigDecimal deliveTax;

    private BigDecimal winPrize;

    private BigDecimal stationAmount;

    private String errorMessage;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getSafeAreaCode() {
        return safeAreaCode;
    }

    public void setSafeAreaCode(String safeAreaCode) {
        this.safeAreaCode = safeAreaCode == null ? null : safeAreaCode.trim();
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    public String getProduceOrder() {
        return produceOrder;
    }

    public void setProduceOrder(String produceOrder) {
        this.produceOrder = produceOrder == null ? null : produceOrder.trim();
    }

    public String getTicketSn() {
        return ticketSn;
    }

    public void setTicketSn(String ticketSn) {
        this.ticketSn = ticketSn == null ? null : ticketSn.trim();
    }

    public Boolean getWinLevel() {
        return winLevel;
    }

    public void setWinLevel(Boolean winLevel) {
        this.winLevel = winLevel;
    }

    public BigDecimal getDeliveTax() {
        return deliveTax;
    }

    public void setDeliveTax(BigDecimal deliveTax) {
        this.deliveTax = deliveTax;
    }

    public BigDecimal getWinPrize() {
        return winPrize;
    }

    public void setWinPrize(BigDecimal winPrize) {
        this.winPrize = winPrize;
    }

    public BigDecimal getStationAmount() {
        return stationAmount;
    }

    public void setStationAmount(BigDecimal stationAmount) {
        this.stationAmount = stationAmount;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}