package com.neusoft.service.impl;

import com.neusoft.dao.OrderdetailMapper;
import com.neusoft.po.Orderdetail;
import com.neusoft.service.OrderdetailService;
import com.neusoft.utils.service.UTS;

public class OrderdetailServiceImpl implements OrderdetailService {

    OrderdetailMapper orderdetailetMapper = UTS.getSession().getMapper(OrderdetailMapper.class);
    @Override
    public Orderdetail selectOrderdetailetByOdid(Integer odid) {
        return orderdetailetMapper.selectByPrimaryKey(odid);
    }
}
