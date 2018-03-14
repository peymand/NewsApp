package com.nicico.data;

import com.kahkeshan.models.User;

/* com.nicico.services
@Author:Peyman
Date: 3/14/2018
Time: 9:39 AM
Year: 2018
*/
public interface LoginDAO {
    String getRole(User user);

    void register(User user);
}
