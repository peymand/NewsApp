package com.kahkeshan.controllers;

import com.kahkeshan.models.New;
import com.nicico.services.NewsService;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user/listNews.do")
public class UserNewsController extends HttpServlet{
    private NewsService newsService;

    public UserNewsController(NewsService newsService) {
     newsService = new NewsService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      List<New> newList = newsService.getAll();
      req.setAttribute("news",newList);
      req.getRequestDispatcher("/user/listNews.jsp").forward(req,resp);

    }
}
