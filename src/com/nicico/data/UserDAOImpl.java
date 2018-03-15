package com.nicico.data;

import com.kahkeshan.models.User;
import com.nicico.util.HibernateUtil;
import org.hibernate.Session;

/* com.nicico.data
@Author:Peyman
Date: 3/15/2018
Time: 9:39 AM
Year: 2018
*/
public class UserDAOImpl implements UserDAO {
    @Override
    public User getUser(int id) {
        Session session = HibernateUtil.getSession();
        User user = session.get(User.class,id);
        session.close();
        return user;
    }
}
