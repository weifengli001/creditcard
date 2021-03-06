package edu.bridgeport.cpsc350.project1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.bridgeport.cpsc350.project1.model.Transaction;
import edu.bridgeport.cpsc350.project1.model.TransactionExample;

public interface TransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int countByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int deleteByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int deleteByPrimaryKey(Integer tradeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int insert(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int insertSelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    List<Transaction> selectByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    Transaction selectByPrimaryKey(Integer tradeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int updateByPrimaryKeySelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRADERECORD
     *
     * @mbggenerated Sat Oct 31 22:49:36 EDT 2015
     */
    int updateByPrimaryKey(Transaction record);
}