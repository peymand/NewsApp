package com.kahkeshan.controllers;

import com.nicico.services.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/* com.kahkeshan.controllers
@Author:Peyman
Date: 3/13/2018
Time: 12:56 PM
Year: 2018
*/
@WebServlet("/admin/deleteNews.do")
public class DeleteNewsController extends HttpServlet {
    public DeleteNewsController() {
        this.newsService = new NewsService();
    }

    NewsService newsService;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idparam=req.getParameter("id");
        int id=Integer.parseInt(idparam);
        newsService.delete(id);
        resp.sendRedirect("/admin/listNews.do");
    }
}
