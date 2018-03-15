package com.kahkeshan.controllers;

import com.kahkeshan.models.New;
import com.kahkeshan.models.User;
import com.nicico.services.NewsService;
import com.nicico.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/* com.kahkeshan.controllers
@Author:Peyman
Date: 3/13/2018
Time: 11:11 AM
Year: 2018
*/
@WebServlet("/reporter/listNews.do")
public class ListNewsController extends HttpServlet{
    private NewsService newsService;
    UserService userService;


    public ListNewsController() {
        this.newsService = new NewsService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId= (int) req.getSession().getAttribute("userid");
//        User user = userService.getUser(userId);

//        List<New> newList=newsService.getAll();
        List<New> newList=newsService.getNews(userId);

        req.setAttribute("news",newList);
        req.getRequestDispatcher("/reporter/listNews.jsp").forward(req,resp);
    }
}
