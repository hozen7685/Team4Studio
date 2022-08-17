package com.neusoft.service;

import com.neusoft.po.EleUser;

import java.util.List;

public interface EleUserService {
    boolean regUser(EleUser eleuser);
    EleUser queryDAddBYuid(Integer uid);
    List<EleUser> selectAllUserInfo();
    boolean checkuName(String uname);
    boolean checkuPhone(String uphone);
}
