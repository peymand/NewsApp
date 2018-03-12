package com.kahkeshan.models;

/* com.kahkeshan.models
@Author:Peyman
Date: 3/10/2018
Time: 6:57 PM
Year: 2018
*/

public class New {

    String title;
    String detail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public New(String title, String detail) {

        this.title = title;
        this.detail = detail;
    }

}
