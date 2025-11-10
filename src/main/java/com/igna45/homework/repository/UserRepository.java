package com.igna45.homework.repository;

import com.igna45.homework.exception.InvalidUserDataException;
import com.igna45.homework.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {
        if(user == null){
            throw new InvalidUserDataException ("User ul este null.");
        }
        if(user.getUsername() == null || user.getUsername().length() < 3){
            throw new InvalidUserDataException ("Username ul este null sau lungimea username ului are mai putin de 3 caractere.");
        }
        if(user.getAge() < 0){
            throw new InvalidUserDataException ("Varsta user ului este negativa.");
        }
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }
}
