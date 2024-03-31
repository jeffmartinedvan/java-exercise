package com.adepuu.exercises.session8;

import java.util.Scanner;
import java.util.UUID;

public class App {
    /**
     * Manages user registration, login, and task management for the To-Do List application.
     * <p>
     * This function enables users to register, log in, and manage their tasks through the console.
     * It provides a clear and concise menu with options to add a task, view tasks, delete a task, or log out.
     * The system handles user input errors gracefully, providing clear feedback and prompting for correct input.
     * </p>
     * <br/>
     * <h3>User Registration and Login:</h3>
     * <ul>
     *     <li>Given a new user, when they input their desired login and password through the console, then the system should create a new account and confirm successful account creation.</li>
     *     <li>Given an existing user, when they input their login and password through the console, then the system should authenticate the user and grant access to the to-do list.</li>
     * </ul>
     *
     * <h3>Task Management:</h3>
     * <ul>
     *     <li>Given a logged-in user, when they input a new task through the console, then the system should add the task to their to-do list and confirm the task has been added.</li>
     *     <li>Given a logged-in user, when they view their to-do list through the console, then the system should display all tasks currently in their list.</li>
     *     <li>Given a logged-in user, when they input a task to delete through the console, then the system should remove the task from their to-do list and confirm the task has been deleted.</li>
     * </ul>
     *
     * <h3>Other:</h3>
     * <ul>
     *     <li>When a user accesses the application, the interface should display a clear and concise menu with options to add a task, view tasks, delete a task, or log out, all accessible through the console.</li>
     *     <li>The system should handle user input errors gracefully, providing clear feedback and prompting for correct input through the console.</li>
     * </ul>
     *
     * <h3>Notes:</h3>
     * <ul>
     *     <li>No need to encrypt user password</li>
     *     <li>Start the program menu inside main function below</li>
     *     <li>Split each functionalities into its own classes</li>
     *     <li>Please Use UUID if there's ID needed <a href="https://www.baeldung.com/java-uuid">Java UUID Reference</a></li>
     *     <li>Data does not need to be stored in a File. Let the data gone when program finished</li>
     * </ul>
     */
    public static void main(String[] args) {
        /*
         Create menu functionalities
         Split classes
         Make methods
         Connect all the functionalities with the related menu ;)
         GL HF! ;)
        */
        Auth userService = new Auth();
        Menu taskService = new Menu();
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        User currentUser = null;

        while (true) {
            if (!loggedIn) {
                System.out.println("1. Register\n2. Login\n3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter username:");
                        String regUsername = scanner.nextLine();
                        System.out.println("Enter password:");
                        String regPassword = scanner.nextLine();
                        userService.registerUser(regUsername, regPassword);
                        break;
                    case 2:
                        System.out.println("Enter username:");
                        String loginUsername = scanner.nextLine();
                        System.out.println("Enter password:");
                        String loginPassword = scanner.nextLine();
                        currentUser = userService.login(loginUsername, loginPassword);
                        if (currentUser != null) {
                            loggedIn = true;
                            System.out.println("Login successful!");
                        } else {
                            System.out.println("Login failed. Invalid username or password.");
                        }
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("1. Add Task\n2. View Tasks\n3. Delete Task\n4. Logout");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter task description:");
                        String taskDescription = scanner.nextLine();
                        taskService.addTask(taskDescription);
                        break;
                    case 2:
                        taskService.viewTasks();
                        break;
                    case 3:
                        System.out.println("Enter task ID to delete:");
                        UUID taskId = UUID.fromString(scanner.nextLine());
                        taskService.deleteTask(taskId);
                        break;
                    case 4:
                        loggedIn = false;
                        currentUser = null;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
