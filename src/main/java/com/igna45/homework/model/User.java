package com.igna45.homework.model;

public class User {

    private String username;
    private int age;

    public User(String username, int age){
        this.username = username;
        this.age = age;
    }
    public String getUsername(){
        return username;
    }
    public int getAge(){
        return age;
    }
    public String toString() {
        return "User: username=" + username + ", age=" + age;
    }
}
