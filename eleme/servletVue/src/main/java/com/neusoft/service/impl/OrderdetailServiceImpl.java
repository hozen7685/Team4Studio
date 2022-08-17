package com.neusoft.service.impl;

import com.neusoft.dao.OrderdetailMapper;
import com.neusoft.po.Orderdetail;
import com.neusoft.service.OrderdetailService;
import com.neusoft.utils.service.UTS;

public class OrderdetailServiceImpl implements OrderdetailService {

    OrderdetailMapper orderdetailMapper = UTS.getSession().getMapper(OrderdetailMapper.class);

    @Override
    public int insertSelective(Orderdetail row) {
        return orderdetailMapper.insertSelective(row);
    }
}
