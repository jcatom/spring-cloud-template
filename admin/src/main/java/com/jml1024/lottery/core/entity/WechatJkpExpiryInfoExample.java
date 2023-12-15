package com.jml1024.lottery.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatJkpExpiryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatJkpExpiryInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(String value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(String value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(String value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(String value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(String value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLike(String value) {
            addCriterion("station_id like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotLike(String value) {
            addCriterion("station_id not like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<String> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<String> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(String value1, String value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(String value1, String value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeIsNull() {
            addCriterion("safe_area_code is null");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeIsNotNull() {
            addCriterion("safe_area_code is not null");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeEqualTo(String value) {
            addCriterion("safe_area_code =", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeNotEqualTo(String value) {
            addCriterion("safe_area_code <>", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeGreaterThan(String value) {
            addCriterion("safe_area_code >", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("safe_area_code >=", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeLessThan(String value) {
            addCriterion("safe_area_code <", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("safe_area_code <=", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeLike(String value) {
            addCriterion("safe_area_code like", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeNotLike(String value) {
            addCriterion("safe_area_code not like", value, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeIn(List<String> values) {
            addCriterion("safe_area_code in", values, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeNotIn(List<String> values) {
            addCriterion("safe_area_code not in", values, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeBetween(String value1, String value2) {
            addCriterion("safe_area_code between", value1, value2, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andSafeAreaCodeNotBetween(String value1, String value2) {
            addCriterion("safe_area_code not between", value1, value2, "safeAreaCode");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNull() {
            addCriterion("plan_name is null");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNotNull() {
            addCriterion("plan_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNameEqualTo(String value) {
            addCriterion("plan_name =", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotEqualTo(String value) {
            addCriterion("plan_name <>", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThan(String value) {
            addCriterion("plan_name >", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("plan_name >=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThan(String value) {
            addCriterion("plan_name <", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThanOrEqualTo(String value) {
            addCriterion("plan_name <=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLike(String value) {
            addCriterion("plan_name like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotLike(String value) {
            addCriterion("plan_name not like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameIn(List<String> values) {
            addCriterion("plan_name in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotIn(List<String> values) {
            addCriterion("plan_name not in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameBetween(String value1, String value2) {
            addCriterion("plan_name between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotBetween(String value1, String value2) {
            addCriterion("plan_name not between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNull() {
            addCriterion("plan_code is null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNotNull() {
            addCriterion("plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeEqualTo(String value) {
            addCriterion("plan_code =", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotEqualTo(String value) {
            addCriterion("plan_code <>", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThan(String value) {
            addCriterion("plan_code >", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_code >=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThan(String value) {
            addCriterion("plan_code <", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("plan_code <=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLike(String value) {
            addCriterion("plan_code like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotLike(String value) {
            addCriterion("plan_code not like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIn(List<String> values) {
            addCriterion("plan_code in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotIn(List<String> values) {
            addCriterion("plan_code not in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeBetween(String value1, String value2) {
            addCriterion("plan_code between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotBetween(String value1, String value2) {
            addCriterion("plan_code not between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andProduceOrderIsNull() {
            addCriterion("produce_order is null");
            return (Criteria) this;
        }

        public Criteria andProduceOrderIsNotNull() {
            addCriterion("produce_order is not null");
            return (Criteria) this;
        }

        public Criteria andProduceOrderEqualTo(String value) {
            addCriterion("produce_order =", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderNotEqualTo(String value) {
            addCriterion("produce_order <>", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderGreaterThan(String value) {
            addCriterion("produce_order >", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("produce_order >=", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderLessThan(String value) {
            addCriterion("produce_order <", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderLessThanOrEqualTo(String value) {
            addCriterion("produce_order <=", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderLike(String value) {
            addCriterion("produce_order like", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderNotLike(String value) {
            addCriterion("produce_order not like", value, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderIn(List<String> values) {
            addCriterion("produce_order in", values, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderNotIn(List<String> values) {
            addCriterion("produce_order not in", values, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderBetween(String value1, String value2) {
            addCriterion("produce_order between", value1, value2, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andProduceOrderNotBetween(String value1, String value2) {
            addCriterion("produce_order not between", value1, value2, "produceOrder");
            return (Criteria) this;
        }

        public Criteria andTicketSnIsNull() {
            addCriterion("ticket_sn is null");
            return (Criteria) this;
        }

        public Criteria andTicketSnIsNotNull() {
            addCriterion("ticket_sn is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSnEqualTo(String value) {
            addCriterion("ticket_sn =", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnNotEqualTo(String value) {
            addCriterion("ticket_sn <>", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnGreaterThan(String value) {
            addCriterion("ticket_sn >", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_sn >=", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnLessThan(String value) {
            addCriterion("ticket_sn <", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnLessThanOrEqualTo(String value) {
            addCriterion("ticket_sn <=", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnLike(String value) {
            addCriterion("ticket_sn like", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnNotLike(String value) {
            addCriterion("ticket_sn not like", value, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnIn(List<String> values) {
            addCriterion("ticket_sn in", values, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnNotIn(List<String> values) {
            addCriterion("ticket_sn not in", values, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnBetween(String value1, String value2) {
            addCriterion("ticket_sn between", value1, value2, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andTicketSnNotBetween(String value1, String value2) {
            addCriterion("ticket_sn not between", value1, value2, "ticketSn");
            return (Criteria) this;
        }

        public Criteria andWinLevelIsNull() {
            addCriterion("win_level is null");
            return (Criteria) this;
        }

        public Criteria andWinLevelIsNotNull() {
            addCriterion("win_level is not null");
            return (Criteria) this;
        }

        public Criteria andWinLevelEqualTo(Boolean value) {
            addCriterion("win_level =", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotEqualTo(Boolean value) {
            addCriterion("win_level <>", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelGreaterThan(Boolean value) {
            addCriterion("win_level >", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("win_level >=", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLessThan(Boolean value) {
            addCriterion("win_level <", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("win_level <=", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelIn(List<Boolean> values) {
            addCriterion("win_level in", values, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotIn(List<Boolean> values) {
            addCriterion("win_level not in", values, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("win_level between", value1, value2, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("win_level not between", value1, value2, "winLevel");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxIsNull() {
            addCriterion("delive_tax is null");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxIsNotNull() {
            addCriterion("delive_tax is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxEqualTo(BigDecimal value) {
            addCriterion("delive_tax =", value, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxNotEqualTo(BigDecimal value) {
            addCriterion("delive_tax <>", value, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxGreaterThan(BigDecimal value) {
            addCriterion("delive_tax >", value, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delive_tax >=", value, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxLessThan(BigDecimal value) {
            addCriterion("delive_tax <", value, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delive_tax <=", value, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxIn(List<BigDecimal> values) {
            addCriterion("delive_tax in", values, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxNotIn(List<BigDecimal> values) {
            addCriterion("delive_tax not in", values, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delive_tax between", value1, value2, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andDeliveTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delive_tax not between", value1, value2, "deliveTax");
            return (Criteria) this;
        }

        public Criteria andWinPrizeIsNull() {
            addCriterion("win_prize is null");
            return (Criteria) this;
        }

        public Criteria andWinPrizeIsNotNull() {
            addCriterion("win_prize is not null");
            return (Criteria) this;
        }

        public Criteria andWinPrizeEqualTo(BigDecimal value) {
            addCriterion("win_prize =", value, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeNotEqualTo(BigDecimal value) {
            addCriterion("win_prize <>", value, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeGreaterThan(BigDecimal value) {
            addCriterion("win_prize >", value, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("win_prize >=", value, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeLessThan(BigDecimal value) {
            addCriterion("win_prize <", value, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("win_prize <=", value, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeIn(List<BigDecimal> values) {
            addCriterion("win_prize in", values, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeNotIn(List<BigDecimal> values) {
            addCriterion("win_prize not in", values, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win_prize between", value1, value2, "winPrize");
            return (Criteria) this;
        }

        public Criteria andWinPrizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win_prize not between", value1, value2, "winPrize");
            return (Criteria) this;
        }

        public Criteria andStationAmountIsNull() {
            addCriterion("station_amount is null");
            return (Criteria) this;
        }

        public Criteria andStationAmountIsNotNull() {
            addCriterion("station_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStationAmountEqualTo(BigDecimal value) {
            addCriterion("station_amount =", value, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountNotEqualTo(BigDecimal value) {
            addCriterion("station_amount <>", value, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountGreaterThan(BigDecimal value) {
            addCriterion("station_amount >", value, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("station_amount >=", value, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountLessThan(BigDecimal value) {
            addCriterion("station_amount <", value, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("station_amount <=", value, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountIn(List<BigDecimal> values) {
            addCriterion("station_amount in", values, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountNotIn(List<BigDecimal> values) {
            addCriterion("station_amount not in", values, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("station_amount between", value1, value2, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andStationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("station_amount not between", value1, value2, "stationAmount");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("error_message is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("error_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("error_message =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("error_message <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("error_message >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("error_message >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("error_message <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("error_message <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("error_message like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("error_message not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("error_message in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("error_message not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("error_message between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("error_message not between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}