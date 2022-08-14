package com.neusoft.service.impl;

import com.neusoft.dao.OrdersMapper;
import com.neusoft.po.Orders;
import com.neusoft.service.OrdersService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {

    OrdersMapper ordersMapper = UTS.getSession().getMapper(OrdersMapper.class);

    @Override
    public List<Orders> selectAllOrdersByuid(String uid) {

        return ordersMapper.selectByUid(uid);
    }
}
