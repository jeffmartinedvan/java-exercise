package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Menu {
    private List<ToDo> tasks;

    public Menu() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new ToDo(description));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        for (ToDo task : tasks) {
            System.out.println(task.getDescription());
        }
    }

    public void deleteTask(UUID taskId) {
        tasks.removeIf(task -> task.getId().equals(taskId));
        System.out.println("Task deleted successfully!");
    }
}
