package com.neusoft.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class ServletVueFilter implements Filter {

    public ServletVueFilter() {
    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        request.setCharacterEncoding("utf-8");

        chain.doFilter(req, resp);
    }
}
