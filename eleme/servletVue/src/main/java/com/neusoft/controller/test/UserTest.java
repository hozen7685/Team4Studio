package com.neusoft.controller.test;

import com.neusoft.po.EleUser;
import com.neusoft.service.EleUserService;
import com.neusoft.service.impl.EleUserServiceImpl;
import org.junit.Test;

import java.util.List;

public class UserTest {

    @Test
    public void test1(){
    EleUserService EUS = new EleUserServiceImpl();
    boolean b = EUS.regUser(new EleUser("e114519","99876d","sy",0,"17654327890","../",null,null,null));
    if(b)
        System.out.println("注册成功");
    else
        System.out.println("注册失败");
    }

    @Test
    public void testQueryDAdd(){
        EleUserService EUS = new EleUserServiceImpl();
        EleUser res = EUS.queryDAddBYuid("e114514");
        System.out.println(res.toString());
    }

    @Test
    public void testSelectAll(){
        EleUserService EUS = new EleUserServiceImpl();
        List<EleUser> res = EUS.selectAllUserInfo();
        for(EleUser item:res)
            System.out.println(item);
    }
}
