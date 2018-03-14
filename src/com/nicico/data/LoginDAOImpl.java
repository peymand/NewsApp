package com.nicico.data;

import com.kahkeshan.models.Role;
import com.kahkeshan.models.User;
import com.nicico.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;

/* com.nicico.data
@Author:Peyman
Date: 3/14/2018
Time: 9:40 AM
Year: 2018
*/
public class LoginDAOImpl implements LoginDAO {

    @Override
    public String getRole(User user) {
        Session session = HibernateUtil.getSession();
        Query query =
                session.createQuery("select u.role from User u where u.name =:x");
        query.setParameter("x", user.getName());
        Role role = (Role) query.getResultList().get(0);
        session.close();
        return role.toString();
    }

    @Override
    public void register(User user) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
}
