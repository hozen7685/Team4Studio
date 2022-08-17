package com.neusoft.dao;

import com.neusoft.po.Orderdetail;
import com.neusoft.po.OrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailMapper {
    long countByExample(OrderdetailExample example);

    int deleteByExample(OrderdetailExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(Orderdetail row);

    int insertSelective(Orderdetail row);

    List<Orderdetail> selectByExampleWithBLOBs(OrderdetailExample example);

    List<Orderdetail> selectByExample(OrderdetailExample example);

    Orderdetail selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("row") Orderdetail row, @Param("example") OrderdetailExample example);

    int updateByExampleWithBLOBs(@Param("row") Orderdetail row, @Param("example") OrderdetailExample example);

    int updateByExample(@Param("row") Orderdetail row, @Param("example") OrderdetailExample example);

    int updateByPrimaryKeySelective(Orderdetail row);

    int updateByPrimaryKeyWithBLOBs(Orderdetail row);

    int updateByPrimaryKey(Orderdetail row);
}