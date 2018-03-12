package com.kahkeshan.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/* com.kahkeshan.filters
@Author:Peyman
Date: 3/5/2018
Time: 5:44 PM
Year: 2018
*/
@WebFilter(filterName = "permission",urlPatterns = {"/admin/*","/user/*"})
public class PermissionFilter implements Filter {
    FilterConfig filter;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
         this.filter = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter Detected");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String role = (String) session.getAttribute("role");
        if(role!=null && role.equals("admin"))
            filterChain.doFilter(servletRequest,servletResponse);

        else{
            if(role==null){
                response.sendRedirect("/index.jsp");
            }
            else if(role.equals("user")){
                if(request.getRequestURI().indexOf("admin")>0){
                    response.sendRedirect("/index.jsp");
                }
                else{
                    filterChain.doFilter(servletRequest,servletResponse);

                }
            }
        }

    }

    @Override
    public void destroy() {

    }
}
