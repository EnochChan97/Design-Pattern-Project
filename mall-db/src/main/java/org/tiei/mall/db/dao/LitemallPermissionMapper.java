package org.tiei.mall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tiei.mall.db.domain.mallPermission;
import org.tiei.mall.db.domain.mallPermissionExample;

public interface mallPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    long countByExample(mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int deleteByExample(mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int insert(mallPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int insertSelective(mallPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    mallPermission selectOneByExample(mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    mallPermission selectOneByExampleSelective(@Param("example") mallPermissionExample example, @Param("selective") mallPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    List<mallPermission> selectByExampleSelective(@Param("example") mallPermissionExample example, @Param("selective") mallPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    List<mallPermission> selectByExample(mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    mallPermission selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") mallPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    mallPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    mallPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") mallPermission record, @Param("example") mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") mallPermission record, @Param("example") mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(mallPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(mallPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") mallPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}