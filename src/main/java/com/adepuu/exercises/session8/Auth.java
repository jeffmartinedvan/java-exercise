package com.adepuu.exercises.session8;


import java.util.ArrayList;
import java.util.List;

public class Auth {
    private List<User> users;

    public Auth() {
        this.users = new ArrayList<>();
    }

    public void registerUser(String username, String password) {
        users.add(new User(username, password));
        System.out.println("User registered successfully!");
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Authentication failed
    }
}
