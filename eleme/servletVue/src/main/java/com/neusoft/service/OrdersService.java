package com.neusoft.service;

import com.neusoft.po.Orders;
import org.junit.jupiter.api.Order;

import java.util.List;

public interface OrdersService {

    List<Orders> selectAllOrdersByuid(String uid);
}
