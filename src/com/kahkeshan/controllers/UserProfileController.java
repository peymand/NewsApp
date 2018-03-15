package com.kahkeshan.controllers;

import com.kahkeshan.models.User;
import com.nicico.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/showUserProfile.do")
public class UserProfileController extends HttpServlet {
    UserService userService;

    public UserProfileController() {
        userService = new UserService();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String idParam = req.getParameter("id");
        int id = Integer.parseInt(idParam);
       User user = userService.getUser(id);
       req.setAttribute("user",user);
       req.getRequestDispatcher("/user/profile.jsp").forward(req,res);

    }
}
