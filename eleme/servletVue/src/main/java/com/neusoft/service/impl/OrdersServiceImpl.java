package com.neusoft.service.impl;

import com.neusoft.dao.OrdersMapper;
import com.neusoft.po.Orders;
import com.neusoft.po.OrdersExample;
import com.neusoft.service.OrdersService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {

    OrdersMapper ordersMapper = UTS.getSession().getMapper(OrdersMapper.class);

    @Override
    public List<Orders> selectAllOrdersByuid(Integer uid) {

        return ordersMapper.selectByUid(uid);
    }

    @Override
    public int insertIntoOrder(Orders orders) {

        return ordersMapper.insertSelective(orders);
    }

    @Override
    public Orders selectOneByExample(Orders orders) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andUidEqualTo(orders.getUid()).andOdateEqualTo(orders.getOdate());
        return ordersMapper.selectOneByExample(ordersExample);
    }
}
