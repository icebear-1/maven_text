package com.meimei.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
 * @description
 * @author  mm
 * @date 2020/6/22
 * @param
 * @return
 */
@WebServlet("/login")
public class LoginServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("/jsp/common/main.jsp").forward(request,response);
    }
}

