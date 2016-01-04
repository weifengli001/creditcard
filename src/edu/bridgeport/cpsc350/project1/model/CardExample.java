package edu.bridgeport.cpsc350.project1.model;

import java.util.ArrayList;
import java.util.List;

public class CardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public CardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andCardidIsNull() {
            addCriterion("CARDID is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(Integer value) {
            addCriterion("CARDID =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(Integer value) {
            addCriterion("CARDID <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(Integer value) {
            addCriterion("CARDID >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARDID >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(Integer value) {
            addCriterion("CARDID <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(Integer value) {
            addCriterion("CARDID <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<Integer> values) {
            addCriterion("CARDID in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<Integer> values) {
            addCriterion("CARDID not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(Integer value1, Integer value2) {
            addCriterion("CARDID between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(Integer value1, Integer value2) {
            addCriterion("CARDID not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("CARDNO =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("CARDNO <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("CARDNO >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNO >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("CARDNO <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("CARDNO <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("CARDNO like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("CARDNO not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("CARDNO in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("CARDNO not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("CARDNO between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("CARDNO not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNull() {
            addCriterion("OPENDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("OPENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(String value) {
            addCriterion("OPENDATE =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(String value) {
            addCriterion("OPENDATE <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(String value) {
            addCriterion("OPENDATE >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(String value) {
            addCriterion("OPENDATE >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(String value) {
            addCriterion("OPENDATE <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(String value) {
            addCriterion("OPENDATE <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLike(String value) {
            addCriterion("OPENDATE like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotLike(String value) {
            addCriterion("OPENDATE not like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<String> values) {
            addCriterion("OPENDATE in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<String> values) {
            addCriterion("OPENDATE not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(String value1, String value2) {
            addCriterion("OPENDATE between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(String value1, String value2) {
            addCriterion("OPENDATE not between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNull() {
            addCriterion("EXPIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNotNull() {
            addCriterion("EXPIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredateEqualTo(String value) {
            addCriterion("EXPIREDATE =", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotEqualTo(String value) {
            addCriterion("EXPIREDATE <>", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThan(String value) {
            addCriterion("EXPIREDATE >", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIREDATE >=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThan(String value) {
            addCriterion("EXPIREDATE <", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThanOrEqualTo(String value) {
            addCriterion("EXPIREDATE <=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLike(String value) {
            addCriterion("EXPIREDATE like", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotLike(String value) {
            addCriterion("EXPIREDATE not like", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIn(List<String> values) {
            addCriterion("EXPIREDATE in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotIn(List<String> values) {
            addCriterion("EXPIREDATE not in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateBetween(String value1, String value2) {
            addCriterion("EXPIREDATE between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotBetween(String value1, String value2) {
            addCriterion("EXPIREDATE not between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andCvvIsNull() {
            addCriterion("CVV is null");
            return (Criteria) this;
        }

        public Criteria andCvvIsNotNull() {
            addCriterion("CVV is not null");
            return (Criteria) this;
        }

        public Criteria andCvvEqualTo(String value) {
            addCriterion("CVV =", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotEqualTo(String value) {
            addCriterion("CVV <>", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvGreaterThan(String value) {
            addCriterion("CVV >", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvGreaterThanOrEqualTo(String value) {
            addCriterion("CVV >=", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvLessThan(String value) {
            addCriterion("CVV <", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvLessThanOrEqualTo(String value) {
            addCriterion("CVV <=", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvLike(String value) {
            addCriterion("CVV like", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotLike(String value) {
            addCriterion("CVV not like", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvIn(List<String> values) {
            addCriterion("CVV in", values, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotIn(List<String> values) {
            addCriterion("CVV not in", values, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvBetween(String value1, String value2) {
            addCriterion("CVV between", value1, value2, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotBetween(String value1, String value2) {
            addCriterion("CVV not between", value1, value2, "cvv");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("CARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("CARDTYPE =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("CARDTYPE <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("CARDTYPE >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARDTYPE >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("CARDTYPE <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("CARDTYPE <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("CARDTYPE like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("CARDTYPE not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("CARDTYPE in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("CARDTYPE not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("CARDTYPE between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("CARDTYPE not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardstatusIsNull() {
            addCriterion("CARDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCardstatusIsNotNull() {
            addCriterion("CARDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCardstatusEqualTo(String value) {
            addCriterion("CARDSTATUS =", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusNotEqualTo(String value) {
            addCriterion("CARDSTATUS <>", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusGreaterThan(String value) {
            addCriterion("CARDSTATUS >", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CARDSTATUS >=", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusLessThan(String value) {
            addCriterion("CARDSTATUS <", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusLessThanOrEqualTo(String value) {
            addCriterion("CARDSTATUS <=", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusLike(String value) {
            addCriterion("CARDSTATUS like", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusNotLike(String value) {
            addCriterion("CARDSTATUS not like", value, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusIn(List<String> values) {
            addCriterion("CARDSTATUS in", values, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusNotIn(List<String> values) {
            addCriterion("CARDSTATUS not in", values, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusBetween(String value1, String value2) {
            addCriterion("CARDSTATUS between", value1, value2, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andCardstatusNotBetween(String value1, String value2) {
            addCriterion("CARDSTATUS not between", value1, value2, "cardstatus");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(Integer value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(Integer value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(Integer value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(Integer value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<Integer> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<Integer> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CREDITCARD
     *
     * @mbggenerated do_not_delete_during_merge Sat Oct 31 22:10:08 EDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CREDITCARD
     *
     * @mbggenerated Sat Oct 31 22:10:08 EDT 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}