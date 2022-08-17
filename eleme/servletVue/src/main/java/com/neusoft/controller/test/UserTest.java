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
    boolean b = EUS.regUser(new EleUser("99876d","sy","17654327890"));
    if(b)
        System.out.println("注册成功");
    else
        System.out.println("注册失败");
    }

    @Test
    public void testQueryDAdd(){
        EleUserService EUS = new EleUserServiceImpl();
        EleUser res = EUS.queryDAddBYuid(114514);
        System.out.println(res.toString());
    }

    @Test
    public void testSelectAll(){
        EleUserService EUS = new EleUserServiceImpl();
        List<EleUser> res = EUS.selectAllUserInfo();
        for(EleUser item:res)
            System.out.println(item);
    }

    @Test
    public void testcheck(){
        EleUserService EUS = new EleUserServiceImpl();
        boolean b = EUS.checkuName("chz");
        boolean c = EUS.checkuPhone("17621349522");
        System.out.println(b);
        System.out.println(c);
    }
}
