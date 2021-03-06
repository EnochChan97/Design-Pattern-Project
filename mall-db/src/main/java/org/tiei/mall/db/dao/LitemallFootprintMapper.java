package org.tiei.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tiei.mall.db.domain.mallFootprint;
import org.tiei.mall.db.domain.mallFootprintExample;

public interface mallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    long countByExample(mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int insert(mallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int insertSelective(mallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    mallFootprint selectOneByExample(mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    mallFootprint selectOneByExampleSelective(@Param("example") mallFootprintExample example, @Param("selective") mallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    List<mallFootprint> selectByExampleSelective(@Param("example") mallFootprintExample example, @Param("selective") mallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    List<mallFootprint> selectByExample(mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    mallFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") mallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    mallFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    mallFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") mallFootprint record, @Param("example") mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") mallFootprint record, @Param("example") mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(mallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(mallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") mallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}