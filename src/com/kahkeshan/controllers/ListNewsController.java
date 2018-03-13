package com.kahkeshan.controllers;

import com.kahkeshan.models.New;
import com.nicico.services.NewsService;

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
@WebServlet("/admin/listNews.do")
public class ListNewsController extends HttpServlet{
    public ListNewsController() {
        this.newsService = new NewsService();
    }

    private NewsService newsService;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<New> newList=newsService.getAll();
        req.setAttribute("news",newList);
        req.getRequestDispatcher("/admin/listNews.jsp").forward(req,resp);
    }
}
