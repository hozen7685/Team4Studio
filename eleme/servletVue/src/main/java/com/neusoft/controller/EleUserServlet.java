package com.neusoft.controller;

import com.google.gson.Gson;
import com.neusoft.po.EleUser;
import com.neusoft.service.EleUserService;
import com.neusoft.service.impl.EleUserServiceImpl;
import com.neusoft.utils.MessageAndData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "EleUserServlet", value = "/EleUserServlet")
public class EleUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String userpass = request.getParameter("userpass");
        String userphone = request.getParameter("userphone");

        EleUser user = new EleUser(username,userpass,userphone);

        EleUserService ES = new EleUserServiceImpl();
        boolean r = ES.regUser(user);

        List<EleUser> res = ES.selectAllUserInfo();

        MessageAndData MAD = MessageAndData.success("执行成功").add("regSta",r).add("uList",res);

        Gson gson = new Gson();
        String newuser = gson.toJson(MAD);

        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
//        writer.println("content-type: application/json");

        writer.println(newuser);
    }
}
