package com.igna45.homework;

import com.igna45.homework.exception.InvalidUserDataException;
import com.igna45.homework.model.AdminUser;
import com.igna45.homework.model.User;
import com.igna45.homework.repository.UserRepository;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        try{
            userRepository.addUser(new User("testuser", 25));
            System.out.println("User adaugat cu succes");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugare: " + e.getMessage());
        }

        try{
            userRepository.addUser(new AdminUser("admin", 30, "full_access"));
            System.out.println("User adaugat cu succes");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugare: " + e.getMessage());
        }

        try{
            userRepository.addUser(new User("ab", 22));
            System.out.println("User adaugat cu succes");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugare: " + e.getMessage());
        }

        try{
            userRepository.addUser(new User("baduser", -5));
            System.out.println("User adaugat cu succes");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugare: " + e.getMessage());
        }

        try{
            userRepository.addUser(new AdminUser("", 30, "full_access"));
            System.out.println("User adaugat cu succes");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugare: " + e.getMessage());
        }

        System.out.println("Lista de utilizatori adaugati cu succes: ");
        for (User u : userRepository.getUsers()) {
            System.out.println(u);
        }
    }
}
