package com.neusoft.controller;

import com.google.gson.Gson;
import com.neusoft.po.DeliAdd;
import com.neusoft.po.Orderdetail;
import com.neusoft.po.Orders;
import com.neusoft.service.CartService;
import com.neusoft.service.DeliAddService;
import com.neusoft.service.OrderdetailService;
import com.neusoft.service.OrdersService;
import com.neusoft.service.impl.CartServiceImpl;
import com.neusoft.service.impl.DeliAddServiceImpl;
import com.neusoft.service.impl.OrderdetailServiceImpl;
import com.neusoft.service.impl.OrdersServiceImpl;
import org.junit.jupiter.api.condition.OS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ConfirmOrderView", value = "/confirmOrderView")
public class ConfirmOrderView extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int uid = Integer.parseInt(request.getParameter("uid"));

        DeliAddService DS = new DeliAddServiceImpl();
        List<DeliAdd> deliAdd = DS.selectByuid(uid);

        if(deliAdd.size()>0){
            Gson gson = new Gson();
            String odeliAdd = gson.toJson(deliAdd);

            PrintWriter writer = response.getWriter();
            writer.println(odeliAdd);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //接收
        int uid = Integer.parseInt(request.getParameter("uid"));
        int bid = Integer.parseInt(request.getParameter("bid"));
        int daid = Integer.parseInt(request.getParameter("daid"));
        BigDecimal ott = BigDecimal.valueOf(Double.parseDouble(request.getParameter("ott")));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String odate = sdf.format(new Date());

        Orders od = new Orders(uid,bid,odate,ott,daid,0);
        //插入一条order
        OrdersService OS = new OrdersServiceImpl();
        int res = OS.insertIntoOrder(od);

        //插入成功查询最新订单，并新增一条订单明细，之后删除购物车
        if (res>0){
            Orders orders = OS.selectOneByExample(od);
            Gson gson = new Gson();
            String odetail = gson.toJson(orders);

            PrintWriter writer = response.getWriter();
//            writer.println(odetail);

            Orderdetail orderdetail = new Orderdetail();
            orderdetail.setOid(orders.getOid());
            orderdetail.setOdetail(odetail);
            OrderdetailService ods = new OrderdetailServiceImpl();
            int odsres = ods.insertSelective(orderdetail);

            int cd = 0;
            if(odsres>0){
                CartService CS = new CartServiceImpl();
                cd = CS.deleteByExample(uid,bid);
            }

            writer.println(cd);
        }

    }
}
