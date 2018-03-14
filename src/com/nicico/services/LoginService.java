package com.nicico.services;

import com.kahkeshan.models.User;
import com.nicico.data.LoginDAO;
import com.nicico.data.LoginDAOImpl;

/* com.nicico.services
@Author:Peyman
Date: 3/14/2018
Time: 9:37 AM
Year: 2018
*/
public class LoginService {
    LoginDAO loginDAO;

    public LoginService() {
        this.loginDAO = new LoginDAOImpl();
    }

    public String getRole(User user) {

        return this.loginDAO.getRole(user);

    }

    public void register(User user) {
        loginDAO.register(user);
    }
}
