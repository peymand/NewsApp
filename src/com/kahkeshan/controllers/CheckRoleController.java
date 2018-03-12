package com.kahkeshan.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/* com.kahkeshan.controllers
@Author:Peyman
Date: 3/10/2018
Time: 6:48 PM
Year: 2018
*/
@WebServlet("/checkRole.do")
public class CheckRoleController extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = req.getParameter("role");
        if(role==null){
            resp.sendRedirect("/index.jsp");
        }
        else if(role.equals("admin")){
            req.getSession().setAttribute("role",role);
            resp.sendRedirect("/admin/newsPage.jsp");
        }
        else{
            req.getSession().setAttribute("role",role);
            resp.sendRedirect("/user/viewNewsPage.jsp");
        }
    }
}
