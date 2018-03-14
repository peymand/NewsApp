package com.kahkeshan.models;

/* com.kahkeshan.models
@Author:Peyman
Date: 3/14/2018
Time: 9:12 AM
Year: 2018
*/

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    int id;
    String name;

    @Column(columnDefinition = "varchar(255)")
    Role role;
    String password;


    @OneToOne(mappedBy = "user")
    New aNew;
    public New getaNew() {
        return aNew;
    }

    public void setaNew(New aNew) {
        this.aNew = aNew;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public User(String name, Role role, String password) {
        this.name = name;

        this.role = role;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
