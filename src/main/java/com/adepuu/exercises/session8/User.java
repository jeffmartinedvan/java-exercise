package com.adepuu.exercises.session8;

import java.util.UUID;

public class User {
    private final String username;
    private String password;
    private UUID id;

    public User(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
