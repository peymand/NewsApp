package com.nicico.services;

import com.kahkeshan.models.New;
import com.nicico.data.NewDAO;
import com.nicico.data.NewDAOImpl;

/* com.nicico.services
@Author:Peyman
Date: 3/13/2018
Time: 9:48 AM
Year: 2018
*/

public class NewsService {
    NewDAO newDAO ;

    public NewsService() {
        this.newDAO = new NewDAOImpl();
    }

    public void addNew(New item){
        this.newDAO.addNew(item);


    }
}
