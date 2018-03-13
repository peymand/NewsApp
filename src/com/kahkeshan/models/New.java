package com.kahkeshan.models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

/* com.kahkeshan.models
@Author:Peyman
Date: 3/10/2018
Time: 6:57 PM
Year: 2018
*/
@Entity
@Table(name ="News")
public class New {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(nullable = false ,unique = true)
    int id;
    String title;
    String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public New() {
    }

    public void setDate(Date date) {
        this.date = date;

    }
    @Temporal(value = TemporalType.DATE)
    Date date;

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

    public New(String title, String detail,Date date) {

        this.title = title;
        this.detail = detail;
        this.date = date;
    }

}
