package com.qzh.shop.service;

import com.qzh.shop.POJO.DO.Attribute;
import com.qzh.shop.POJO.DO.FirstCategories;
import com.qzh.shop.POJO.DO.Parameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Ruoany
 * @Description
 * @Date 2020/6/14 0:14
 * @Version 1.0
 */
public interface ParameterService {

    /**
     * 查询所有的商品分类信息
     * @param firstCategories 商品分类
     * @return List<FirstCategories>
     * */
    public List<FirstCategories> getAllCategories(@Param("firstCategories") FirstCategories firstCategories);

    /**
     * 根据id查询对应商品的所有动态参数
     * @param pId 商品id
     * @return List<Parameter>
     * */
    public List<Parameter> getAllParameterById(@Param("pId") Integer pId);

    /**
     * 根据id查询对应商品的所有静态属性
     * @param pId 商品id
     * @return List<Attribute>
     * */
    public List<Attribute> getAllAttributeById(@Param("pId") Integer pId);

    /**
     * 根据Pid添加动态参数
     * @param pId
     * @param parameter
     * @return int
     * */
    public int addParameterByPid(@Param("pId") Integer pId, @Param("parameter") String parameter);


    /**
     * 根据Pid添加静态属性
     * @param pId
     * @param attribute
     * @return int
     * */
    public int addAttrbuteByPid(@Param("pId") Integer pId, @Param("attribute") String attribute);


    /**
     * 根据id查询对应的动态参数信息
     * @param id
     * @return Parameter
     * */
    public Parameter getParameterById(@Param("id") Integer id);

    /**
     * 根据id查询对应的静态属性信息
     * @param id
     * @return Attribute
     * */
    public Attribute getAttributeById(@Param("id") Integer id);

    /**
     * 根据id修改对应的动态参数信息
     * @param id
     * @param parameter
     * @return int
     * */
    public int updataParameterById(@Param("id") Integer id, @Param("parameter") String parameter);

    /**
     * 根据id修改对应的静态属性信息
     * @param id
     * @param attribute
     * @return int
     * */
    public int updataAttributeById(@Param("id") Integer id, @Param("attribute") String attribute);

    /**
     * 根据id删除对应的动态参数信息
     * @param id
     * @return int
     * */
    public int deleteParameterById(@Param("id") Integer id);

    /**
     * 根据id删除对应的静态属性信息
     * @param id
     * @return int
     * */
    public int deleteAttributeById(@Param("id") Integer id);
}
