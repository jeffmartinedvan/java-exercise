package com.adepuu.exercises.session6;

import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
     *
     * Input: 1, 2, 3, 4, 5, q
     * Output: 3
     *
     * Input: 1, 2, 3, a, b, 4, 5, q
     * Output: 3
     *
     * Explanation: print “Invalid input. Please enter a valid number or 'q' to finish.” if user not inserting the expected number or character.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        double sum = 0;
        int i = 0;

        while (isContinue) {
            System.out.print("Enter a number: ");
            String input = scanner.next();

            if (input.equals("q") || input.equals("Q")) {
                isContinue = false;
            } else {
                try {
                    sum += Double.parseDouble(input);
                    i++;
                } catch(Exception e) {
                    System.out.println("Enter a valid number or 'q' to finish");
                }
            }
        }
        System.out.print("The average of all numbers is: " + sum/i);
    }
}
