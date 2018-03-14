package com.kahkeshan.models;

/* com.kahkeshan.models
@Author:Peyman
Date: 3/14/2018
Time: 9:12 AM
Year: 2018
*/
public class User {

    int id;
    String name;
    String family;
    Role role;
    String password;

    public User() {
    }

    public User(String name, String family, Role role, String password) {
        this.name = name;
        this.family = family;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
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
