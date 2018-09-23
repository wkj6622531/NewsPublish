package com.ovo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionsExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andCollectionsIdIsNull() {
            addCriterion("collections_ID is null");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdIsNotNull() {
            addCriterion("collections_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdEqualTo(String value) {
            addCriterion("collections_ID =", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdNotEqualTo(String value) {
            addCriterion("collections_ID <>", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdGreaterThan(String value) {
            addCriterion("collections_ID >", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdGreaterThanOrEqualTo(String value) {
            addCriterion("collections_ID >=", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdLessThan(String value) {
            addCriterion("collections_ID <", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdLessThanOrEqualTo(String value) {
            addCriterion("collections_ID <=", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdLike(String value) {
            addCriterion("collections_ID like", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdNotLike(String value) {
            addCriterion("collections_ID not like", value, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdIn(List<String> values) {
            addCriterion("collections_ID in", values, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdNotIn(List<String> values) {
            addCriterion("collections_ID not in", values, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdBetween(String value1, String value2) {
            addCriterion("collections_ID between", value1, value2, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andCollectionsIdNotBetween(String value1, String value2) {
            addCriterion("collections_ID not between", value1, value2, "collectionsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNull() {
            addCriterion("news_ID is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(String value) {
            addCriterion("news_ID =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(String value) {
            addCriterion("news_ID <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(String value) {
            addCriterion("news_ID >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(String value) {
            addCriterion("news_ID >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(String value) {
            addCriterion("news_ID <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(String value) {
            addCriterion("news_ID <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLike(String value) {
            addCriterion("news_ID like", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotLike(String value) {
            addCriterion("news_ID not like", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<String> values) {
            addCriterion("news_ID in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<String> values) {
            addCriterion("news_ID not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(String value1, String value2) {
            addCriterion("news_ID between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(String value1, String value2) {
            addCriterion("news_ID not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(String value) {
            addCriterion("users_ID =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(String value) {
            addCriterion("users_ID <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(String value) {
            addCriterion("users_ID >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(String value) {
            addCriterion("users_ID >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(String value) {
            addCriterion("users_ID <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(String value) {
            addCriterion("users_ID <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLike(String value) {
            addCriterion("users_ID like", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotLike(String value) {
            addCriterion("users_ID not like", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<String> values) {
            addCriterion("users_ID in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<String> values) {
            addCriterion("users_ID not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(String value1, String value2) {
            addCriterion("users_ID between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(String value1, String value2) {
            addCriterion("users_ID not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeIsNull() {
            addCriterion("conllections_time is null");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeIsNotNull() {
            addCriterion("conllections_time is not null");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeEqualTo(Date value) {
            addCriterion("conllections_time =", value, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeNotEqualTo(Date value) {
            addCriterion("conllections_time <>", value, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeGreaterThan(Date value) {
            addCriterion("conllections_time >", value, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("conllections_time >=", value, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeLessThan(Date value) {
            addCriterion("conllections_time <", value, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeLessThanOrEqualTo(Date value) {
            addCriterion("conllections_time <=", value, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeIn(List<Date> values) {
            addCriterion("conllections_time in", values, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeNotIn(List<Date> values) {
            addCriterion("conllections_time not in", values, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeBetween(Date value1, Date value2) {
            addCriterion("conllections_time between", value1, value2, "conllectionsTime");
            return (Criteria) this;
        }

        public Criteria andConllectionsTimeNotBetween(Date value1, Date value2) {
            addCriterion("conllections_time not between", value1, value2, "conllectionsTime");
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