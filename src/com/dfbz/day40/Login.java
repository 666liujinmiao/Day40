package com.dfbz.day40;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        if ("admin".equals(name)) {
            req.setAttribute("name",name);
            req.setAttribute("msg","恭喜登录成功！");
            //响应重定向：对象为response，请求两次（每次请求都是独立的）,收不到上个请求msg的值
//            resp.sendRedirect("success.jsp?msg=success");  //URL:http://localhost:8080/Day40/fail.jsp?msg=fail

            req.getRequestDispatcher("Main").forward(req,resp);
        } else {

//            resp.sendRedirect("fail.jsp?msg=fail");    //URL:http://localhost:8080/Day40/success.jsp?msg=success
            req.setAttribute("msg","抱歉！登录失败！");
            req.getRequestDispatcher("fail.jsp").forward(req,resp);
        }
    }
}
