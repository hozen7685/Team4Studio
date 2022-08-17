package com.neusoft.test;

import com.neusoft.po.Orders;
//import com.neusoft.service.OrderdetailService;
import com.neusoft.service.OrdersService;
//import com.neusoft.service.impl.OrderdetailServiceImpl;
import com.neusoft.service.impl.OrdersServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OrdersTest {

    @Test
    public void test01(){
        OrdersService OS = new OrdersServiceImpl();
        List<Orders> res = OS.selectAllOrdersByuid(114514);
        for(Orders item:res)
            System.out.println(item.toString());
    }

//    @Test
//    public void test02(){
//        OrderdetailService ODS = new OrderdetailServiceImpl();
//        Orderdetail res = ODS.selectOrderdetailetByOdid(1000);
//            System.out.println(res.toString());
//    }

    @Test
    public void test03(){
        int uid = 114514; int bid = 7899; int daid = 1000;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String datef = sdf.format(new Date());
        OrdersService OS = new OrdersServiceImpl();

        Orders od = new Orders();
        od.setBid(bid);
        od.setDaid(daid);
        od.setOtt(BigDecimal.valueOf(30));
        od.setUid(uid);
        od.setOdate(datef);

        OS.insertIntoOrder(od);

    }

}
