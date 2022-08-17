package com.neusoft.dao;

import com.neusoft.po.DeliAdd;
import com.neusoft.po.DeliAddExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliAddMapper {
    long countByExample(DeliAddExample example);

    int deleteByExample(DeliAddExample example);

    int deleteByPrimaryKey(Integer daid);

    int insert(DeliAdd row);

    int insertSelective(DeliAdd row);

    List<DeliAdd> selectByExample(DeliAddExample example);

    DeliAdd selectByPrimaryKey(Integer daid);

    int updateByExampleSelective(@Param("row") DeliAdd row, @Param("example") DeliAddExample example);

    int updateByExample(@Param("row") DeliAdd row, @Param("example") DeliAddExample example);

    int updateByPrimaryKeySelective(DeliAdd row);

    int updateByPrimaryKey(DeliAdd row);

//    根据uid查找所有用户地址
    List<DeliAdd> selectByuid(Integer uid);
}