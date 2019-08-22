package com.dfbz.day40;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = -8536154803062431000L;//*

    public LoginServlet() {
        System.out.println("LoginServlet实例化...");
    }

    @Override
    public void init() {
        System.out.println("LoginServlet初始化...");
    }

    @Override
    public void destroy() {
        System.out.println("LoginServlet销毁...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String[] names = req.getParameterValues("name");
        for (String name : names) {
            System.out.println("name:" + name);
        }
        String pwd = req.getParameter("password");
        String path = req.getContextPath();
        System.out.println("password:" + pwd + ",path:" + path);
        System.out.println("uri:"+req.getRequestURI());
        System.out.println("url:"+req.getRequestURL());
    }
}
