package com.neusoft.dao;

import com.neusoft.po.Cart;
import com.neusoft.po.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    long countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart row);

    int insertSelective(Cart row);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByExampleSelective(@Param("row") Cart row, @Param("example") CartExample example);

    int updateByExample(@Param("row") Cart row, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart row);

    int updateByPrimaryKey(Cart row);

    //-----------------------------------------
    List<Cart> selectCartsBYuid(Integer uid);

    List<Cart> selectCartsBYbid(String bid);

    Cart selectCountByFoodIdAnduid(Integer foodid,Integer uid);

    List<Cart> selectCartsBYbidAnduid(Integer uid,Integer bid);
}