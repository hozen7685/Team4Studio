package com.neusoft.service.impl;

import com.neusoft.dao.DeliAddMapper;
import com.neusoft.po.DeliAdd;
import com.neusoft.service.DeliAddService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class DeliAddServiceImpl implements DeliAddService {

    DeliAddMapper DAM = UTS.getSession().getMapper(DeliAddMapper.class);
    @Override
    public List<DeliAdd> selectByuid(Integer uid) {
        return DAM.selectByuid(uid);
    }
}
