package com.clevermis.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: java-study
 * @description:
 * @author: Clevermis
 * @create: 2023-01-05 19:30
 * @since JDK 1.8
 **/
public class HelloServlet extends HttpServlet {
    //由于get和post只是请求实现方式的不同，可以相互调用，业务逻辑都一样
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        System.out.println("进入doget方法");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>404<h1>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

}
