package com.neusoft.service.impl;

import com.neusoft.dao.BusinessMapper;
import com.neusoft.po.Business;
import com.neusoft.service.BusinessService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class BusinessServiceImpl implements BusinessService {

    BusinessMapper businessMapper = UTS.getSession().getMapper(BusinessMapper.class);

    @Override
    public List<Business> selectAllBusinesses() {
        return businessMapper.selectAllBusinesses();
    }

    @Override
    public Business selectBusinessBYbid(Integer bid) {
        return businessMapper.selectBYbidWithFoods(bid);
    }
}
