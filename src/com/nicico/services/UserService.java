package com.nicico.services;

import com.kahkeshan.models.User;
import com.nicico.data.UserDAO;
import com.nicico.data.UserDAOImpl;

public class UserService {
    UserDAO  userDAO;

    public UserService() {
        userDAO = new UserDAOImpl();
    }

    public User getUser(int id){
        return userDAO.getUser(id);
    }
}
