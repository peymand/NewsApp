package com.kahkeshan.controllers;

import com.kahkeshan.models.New;
import com.nicico.services.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/* com.kahkeshan.controllers
@Author:Peyman
Date: 3/10/2018
Time: 6:56 PM
Year: 2018
*/
@WebServlet("/addnew.do")
public class AddNewController extends HttpServlet {
    NewsService newsService ;

    public AddNewController() {
        this.newsService = new NewsService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String detail = req.getParameter("detail");
        New aNew = new New(title,detail, new Date());
       // List<New> news = (List<New>) getServletContext().getAttribute("news");
        this.newsService.addNew(aNew);
       // getServletContext().setAttribute("news",news);
        resp.sendRedirect("/admin/listNews.jsp");
    }
}
