package org.tiei.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tiei.mall.db.domain.mallGoodsProduct;
import org.tiei.mall.db.domain.mallGoodsProductExample;

public interface mallGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    long countByExample(mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int deleteByExample(mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int insert(mallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int insertSelective(mallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    mallGoodsProduct selectOneByExample(mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    mallGoodsProduct selectOneByExampleSelective(@Param("example") mallGoodsProductExample example, @Param("selective") mallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    List<mallGoodsProduct> selectByExampleSelective(@Param("example") mallGoodsProductExample example, @Param("selective") mallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    List<mallGoodsProduct> selectByExample(mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    mallGoodsProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") mallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    mallGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    mallGoodsProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") mallGoodsProduct record, @Param("example") mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") mallGoodsProduct record, @Param("example") mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(mallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(mallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") mallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}