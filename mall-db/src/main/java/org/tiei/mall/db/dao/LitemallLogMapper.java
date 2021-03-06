package org.tiei.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tiei.mall.db.domain.mallLog;
import org.tiei.mall.db.domain.mallLogExample;

public interface mallLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    long countByExample(mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int deleteByExample(mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int insert(mallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int insertSelective(mallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    mallLog selectOneByExample(mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    mallLog selectOneByExampleSelective(@Param("example") mallLogExample example, @Param("selective") mallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    List<mallLog> selectByExampleSelective(@Param("example") mallLogExample example, @Param("selective") mallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    List<mallLog> selectByExample(mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    mallLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") mallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    mallLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    mallLog selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") mallLog record, @Param("example") mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") mallLog record, @Param("example") mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(mallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(mallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") mallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_log
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}