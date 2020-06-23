package com.meimei.controller;/* *
 * @author meimei
 * @date 2020/6/22 20:25
 * @Description
 * @version 1.0
 * 该代码归meimei所有！
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet{
    public void list(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.getRequestDispatcher("user list");
    }
    public void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    }
    public void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    }
}
//public class UserServlet extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    //  String url=request.getRequestURL();
//      String uri=request.getRequestURI();
//      if (uri.endsWith("list")){
//          list(request,response);
//
//      }else if (uri.endsWith("add")){
//          add(request,response);
//      }
//
//    }
//    public  void list(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
//        request.getRequestDispatcher("/jsp/user/list.jsp").forward(request,response);
//    }
//    public  void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
//
//    }
//    public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//}
