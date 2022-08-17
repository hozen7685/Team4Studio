package com.neusoft.service;

import com.neusoft.po.Orders;
import com.neusoft.po.OrdersExample;
import org.junit.jupiter.api.Order;

import java.util.List;

public interface OrdersService {

    List<Orders> selectAllOrdersByuid(Integer uid);

    int insertIntoOrder(Orders orders);

    Orders selectOneByExample(Orders orders);
}
