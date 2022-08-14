package com.neusoft.service;

import com.neusoft.po.EleUser;

import java.util.List;

public interface EleUserService {
    boolean regUser(EleUser eleuser);
    EleUser queryDAddBYuid(String uid);
    List<EleUser> selectAllUserInfo();
}
