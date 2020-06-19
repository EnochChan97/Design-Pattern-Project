package org.tiei.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tiei.mall.db.domain.mallOrderGoods;
import org.tiei.mall.db.domain.mallOrderGoodsExample;

public interface mallOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    long countByExample(mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int deleteByExample(mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int insert(mallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int insertSelective(mallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    mallOrderGoods selectOneByExample(mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    mallOrderGoods selectOneByExampleSelective(@Param("example") mallOrderGoodsExample example, @Param("selective") mallOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    List<mallOrderGoods> selectByExampleSelective(@Param("example") mallOrderGoodsExample example, @Param("selective") mallOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    List<mallOrderGoods> selectByExample(mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    mallOrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") mallOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    mallOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    mallOrderGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") mallOrderGoods record, @Param("example") mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") mallOrderGoods record, @Param("example") mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(mallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(mallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") mallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}