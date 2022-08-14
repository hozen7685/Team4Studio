package com.neusoft.service.impl;

import com.neusoft.dao.EleUserMapper;
import com.neusoft.po.EleUser;
import com.neusoft.po.EleUserExample;
import com.neusoft.service.EleUserService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class EleUserServiceImpl implements EleUserService {

    EleUserMapper eleUserMapper = UTS.getSession().getMapper(EleUserMapper.class);

    public boolean regUser(EleUser eleuser){
        boolean flag = false;
        EleUserExample eleUserExample = new EleUserExample();
        EleUserExample.Criteria criteria = eleUserExample.createCriteria();
        criteria.andUphoneEqualTo(eleuser.getUphone());
        long result = eleUserMapper.countByExample(eleUserExample);
        if(result<=0){
            int i = eleUserMapper.insert(eleuser);
            if(i>=1)
                flag = true;
        }
        return flag;
    }

    @Override
    public EleUser queryDAddBYuid(String uid) {
        return eleUserMapper.selectWithDeliAddByuid(uid);
    }

    @Override
    public List<EleUser> selectAllUserInfo() {
        List<EleUser> res = eleUserMapper.selectAllUser();
        return res;
    }
}
