package com.igna45.homework.model;

public class AdminUser extends User{

    private String permissionLevel;
    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    public String toString() {
        return "AdminUser: username=" + getUsername() + ", age=" + getAge() +
                ", accessLevel=" + permissionLevel;
    }

}
