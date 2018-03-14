package com.kahkeshan.models;

/* com.kahkeshan.models
@Author:Peyman
Date: 3/14/2018
Time: 9:14 AM
Year: 2018
*/
public enum Role {

    user("user"), admin("admin"), reporter("reporter");

    String title;

    Role(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return this.title;
    }
}
