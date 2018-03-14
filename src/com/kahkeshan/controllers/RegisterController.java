package com.kahkeshan.controllers;

/* com.kahkeshan.controllers
@Author:Peyman
Date: 3/14/2018
Time: 10:27 AM
Year: 2018
*/

import com.kahkeshan.models.Role;
import com.kahkeshan.models.User;
import com.nicico.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register.do")
public class RegisterController extends HttpServlet {

    LoginService loginService;

    public RegisterController() {
        loginService = new LoginService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("name");
        String roleParam = req.getParameter("role");
        String password = req.getParameter("password");
        Role role = null;
        switch (roleParam) {
            case "user":
                role = Role.user;
                break;
            case "admin":
                role = Role.admin;
                break;
            case "reporter":
                role = Role.reporter;
                break;
        }
        User user = new User(username, role, password);
        try {
            loginService.register(user);
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
