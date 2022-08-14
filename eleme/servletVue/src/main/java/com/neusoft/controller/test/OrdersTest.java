package com.neusoft.controller.test;

import com.neusoft.po.Orderdetail;
import com.neusoft.po.Orders;
import com.neusoft.service.OrderdetailService;
import com.neusoft.service.OrdersService;
import com.neusoft.service.impl.OrderdetailServiceImpl;
import com.neusoft.service.impl.OrdersServiceImpl;
import org.junit.Test;

import java.util.List;

public class OrdersTest {

    @Test
    public void test01(){
        OrdersService OS = new OrdersServiceImpl();
        List<Orders> res = OS.selectAllOrdersByuid("e114514");
        for(Orders item:res)
            System.out.println(item.toString());
    }

    @Test
    public void test02(){
        OrderdetailService ODS = new OrderdetailServiceImpl();
        Orderdetail res = ODS.selectOrderdetailetByOdid(1000);
            System.out.println(res.toString());
    }


}
