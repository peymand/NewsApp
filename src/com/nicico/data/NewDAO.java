package com.nicico.data;

import com.kahkeshan.models.New;

import java.util.List;

/* com.nicico.data
@Author:Peyman
Date: 3/13/2018
Time: 9:54 AM
Year: 2018
*/
public interface NewDAO {
    void addNew(New aNew);
    List<New> getAll();
    void delete (int id);


}
