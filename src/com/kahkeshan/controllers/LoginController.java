package com.kahkeshan.controllers;

import com.kahkeshan.models.User;
import com.nicico.services.LoginService;

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
@WebServlet("/login.do")
public class LoginController extends HttpServlet {

    LoginService loginService;

    public LoginController() {
        this.loginService = new LoginService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean isValid = loginService.checkUser(username, password);
        if (isValid) {
            User user = new User(username, password);
            String role = loginService.getRole(user);

            if (role == null) {
                resp.sendRedirect("/login.jsp?msg=role is not defined!!!");
            }
            req.getSession().setAttribute("role", role);
            resp.sendRedirect("/" + role + "/listNews.do");


        } else {
            resp.sendRedirect("/login.jsp?msg=username or password is incorrect");
        }


    }
}
