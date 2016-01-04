package edu.bridgeport.cpsc350.project1.model;

import java.util.ArrayList;
import java.util.List;

public class TransactionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public TransactionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
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
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
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

        public Criteria andTradeidIsNull() {
            addCriterion("TRADEID is null");
            return (Criteria) this;
        }

        public Criteria andTradeidIsNotNull() {
            addCriterion("TRADEID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeidEqualTo(Integer value) {
            addCriterion("TRADEID =", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotEqualTo(Integer value) {
            addCriterion("TRADEID <>", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidGreaterThan(Integer value) {
            addCriterion("TRADEID >", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRADEID >=", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLessThan(Integer value) {
            addCriterion("TRADEID <", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLessThanOrEqualTo(Integer value) {
            addCriterion("TRADEID <=", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidIn(List<Integer> values) {
            addCriterion("TRADEID in", values, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotIn(List<Integer> values) {
            addCriterion("TRADEID not in", values, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidBetween(Integer value1, Integer value2) {
            addCriterion("TRADEID between", value1, value2, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TRADEID not between", value1, value2, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTadetimeIsNull() {
            addCriterion("TADETIME is null");
            return (Criteria) this;
        }

        public Criteria andTadetimeIsNotNull() {
            addCriterion("TADETIME is not null");
            return (Criteria) this;
        }

        public Criteria andTadetimeEqualTo(String value) {
            addCriterion("TADETIME =", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeNotEqualTo(String value) {
            addCriterion("TADETIME <>", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeGreaterThan(String value) {
            addCriterion("TADETIME >", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeGreaterThanOrEqualTo(String value) {
            addCriterion("TADETIME >=", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeLessThan(String value) {
            addCriterion("TADETIME <", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeLessThanOrEqualTo(String value) {
            addCriterion("TADETIME <=", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeLike(String value) {
            addCriterion("TADETIME like", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeNotLike(String value) {
            addCriterion("TADETIME not like", value, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeIn(List<String> values) {
            addCriterion("TADETIME in", values, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeNotIn(List<String> values) {
            addCriterion("TADETIME not in", values, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeBetween(String value1, String value2) {
            addCriterion("TADETIME between", value1, value2, "tadetime");
            return (Criteria) this;
        }

        public Criteria andTadetimeNotBetween(String value1, String value2) {
            addCriterion("TADETIME not between", value1, value2, "tadetime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
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

        public Criteria andMerchantidIsNull() {
            addCriterion("MERCHANTID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("MERCHANTID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(Integer value) {
            addCriterion("MERCHANTID =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(Integer value) {
            addCriterion("MERCHANTID <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(Integer value) {
            addCriterion("MERCHANTID >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MERCHANTID >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(Integer value) {
            addCriterion("MERCHANTID <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(Integer value) {
            addCriterion("MERCHANTID <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<Integer> values) {
            addCriterion("MERCHANTID in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<Integer> values) {
            addCriterion("MERCHANTID not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(Integer value1, Integer value2) {
            addCriterion("MERCHANTID between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(Integer value1, Integer value2) {
            addCriterion("MERCHANTID not between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNull() {
            addCriterion("TRADETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNotNull() {
            addCriterion("TRADETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradetypeEqualTo(String value) {
            addCriterion("TRADETYPE =", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotEqualTo(String value) {
            addCriterion("TRADETYPE <>", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThan(String value) {
            addCriterion("TRADETYPE >", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADETYPE >=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThan(String value) {
            addCriterion("TRADETYPE <", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThanOrEqualTo(String value) {
            addCriterion("TRADETYPE <=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLike(String value) {
            addCriterion("TRADETYPE like", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotLike(String value) {
            addCriterion("TRADETYPE not like", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeIn(List<String> values) {
            addCriterion("TRADETYPE in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotIn(List<String> values) {
            addCriterion("TRADETYPE not in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeBetween(String value1, String value2) {
            addCriterion("TRADETYPE between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotBetween(String value1, String value2) {
            addCriterion("TRADETYPE not between", value1, value2, "tradetype");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TRADERECORD
     *
     * @mbggenerated do_not_delete_during_merge Sat Oct 31 22:49:36 EDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
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