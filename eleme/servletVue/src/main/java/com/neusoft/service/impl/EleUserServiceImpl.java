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
            int i = eleUserMapper.insertSelective(eleuser);
            if(i>=1)
                flag = true;
        }
        return flag;
    }

    @Override
    public EleUser queryDAddBYuid(Integer uid) {
        return eleUserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<EleUser> selectAllUserInfo() {
        List<EleUser> res = eleUserMapper.selectByExampleWithBLOBs(null);
        return res;
    }

    @Override
    public boolean checkuName(String uname) {

        EleUserExample eleUserExample = new EleUserExample();
        EleUserExample.Criteria criteria = eleUserExample.createCriteria();
        criteria.andUsernameEqualTo(uname);
        long result = eleUserMapper.countByExample(eleUserExample);
        if(result>0)
            return false;
        else
            return true;
    }

    @Override
    public boolean checkuPhone(String uphone) {

        EleUserExample eleUserExample = new EleUserExample();
        EleUserExample.Criteria criteria = eleUserExample.createCriteria();
        criteria.andUphoneEqualTo(uphone);
        long result = eleUserMapper.countByExample(eleUserExample);
        if(result>0)
            return false;
        else
            return true;
    }
}
