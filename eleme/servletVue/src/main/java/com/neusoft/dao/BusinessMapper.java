package com.neusoft.dao;

import com.neusoft.po.Business;
import com.neusoft.po.BusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
    long countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Business row);

    int insertSelective(Business row);

    List<Business> selectByExampleWithBLOBs(BusinessExample example);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("row") Business row, @Param("example") BusinessExample example);

    int updateByExampleWithBLOBs(@Param("row") Business row, @Param("example") BusinessExample example);

    int updateByExample(@Param("row") Business row, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business row);

    int updateByPrimaryKeyWithBLOBs(Business row);

    int updateByPrimaryKey(Business row);

    //***********************
    List<Business> selectAllBusinesses();

    Business selectBYbidWithFoods(Integer bid);

    Business selectByPrimaryKeyForCart(Integer bid);

//    List<Business> selectBYbidWithFoods();
}