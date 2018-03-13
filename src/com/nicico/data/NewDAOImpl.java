package com.nicico.data;

import com.kahkeshan.models.New;
import com.nicico.util.HibernateUtil;
import org.hibernate.Session;

/* com.nicico.data
@Author:Peyman
Date: 3/13/2018
Time: 9:56 AM
Year: 2018
*/
public class NewDAOImpl implements NewDAO {


    @Override
    public void addNew(New item) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(item);
        session.getTransaction().commit();
        session.close();
    }
}
