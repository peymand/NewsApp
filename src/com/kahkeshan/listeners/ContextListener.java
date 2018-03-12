package com.kahkeshan.listeners;

import com.kahkeshan.models.New;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;

/* com.kahkeshan.listeners
@Author:Peyman
Date: 3/10/2018
Time: 6:59 PM
Year: 2018
*/
@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        event.getServletContext().setAttribute("news",new ArrayList<New>());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
