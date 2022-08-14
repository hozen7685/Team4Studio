package com.neusoft.dao;

import com.neusoft.po.EleUser;
import com.neusoft.po.EleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EleUserMapper {
    long countByExample(EleUserExample example);

    int deleteByExample(EleUserExample example);

    int deleteByPrimaryKey(String uid);

    int insert(EleUser row);

    int insertSelective(EleUser row);

    List<EleUser> selectByExampleWithBLOBs(EleUserExample example);

    List<EleUser> selectByExample(EleUserExample example);

    EleUser selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("row") EleUser row, @Param("example") EleUserExample example);

    int updateByExampleWithBLOBs(@Param("row") EleUser row, @Param("example") EleUserExample example);

    int updateByExample(@Param("row") EleUser row, @Param("example") EleUserExample example);

    int updateByPrimaryKeySelective(EleUser row);

    int updateByPrimaryKeyWithBLOBs(EleUser row);

    int updateByPrimaryKey(EleUser row);
    //--------------------------自定义---------------------------------------------
    List<EleUser> selectAllUser();

    EleUser selectWithDeliAddByuid(String uid);
}