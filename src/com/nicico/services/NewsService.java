package com.nicico.services;

import com.kahkeshan.models.New;
import com.nicico.data.NewDAO;
import com.nicico.data.NewDAOImpl;

import java.util.List;

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

    public List<New> getAll(){
        return this.newDAO.getAll();
    }
    public List<New> getNews(int userid){
        return this.newDAO.getNews(userid);
    }

    public void delete(int id){
        this.newDAO.delete(id);
    }
    public void update(New aNew){
        this.newDAO.update(aNew);
    }
}
