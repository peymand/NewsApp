package com.kahkeshan.controllers;

import com.kahkeshan.models.New;
import com.kahkeshan.models.User;
import com.nicico.services.NewsService;
import com.nicico.services.UserService;
import com.nicico.util.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* com.kahkeshan.controllers
@Author:Peyman
Date: 3/10/2018
Time: 6:56 PM
Year: 2018
*/
@WebServlet("/reporter/addnew.do")
public class AddNewController extends HttpServlet {
    NewsService newsService;
    UserService userService;

    public AddNewController() {
        this.newsService = new NewsService();
        userService = new UserService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idParam = req.getParameter("id");
        String date =  req.getParameter("date");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
        Date d = null;
        try {
           d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String title = req.getParameter("title");
        String detail = req.getParameter("detail");
        int userId= (int) req.getSession().getAttribute("userid");
        User user = userService.getUser(userId);
        New aNew = new New(title, detail, user, d);
        // List<New> news = (List<New>) getServletContext().getAttribute("news");
        if (idParam == null || idParam.isEmpty())
            this.newsService.addNew(aNew);
        else{
            int id =Integer.parseInt(idParam);
            aNew.setId(id);
            this.newsService.update(aNew);

        }
            // getServletContext().setAttribute("news",news);

            resp.sendRedirect("/reporter/reporterPage.jsp");
    }
}
