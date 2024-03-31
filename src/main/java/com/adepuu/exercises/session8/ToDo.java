package com.adepuu.exercises.session8;


import java.util.UUID;

public class ToDo {
    private final UUID id;
    private final String description;

    public ToDo(String description) {
        this.id = UUID.randomUUID();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public UUID getId() {
        return id;
    }
}
