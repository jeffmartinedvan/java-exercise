package com.adepuu.exercises.session10;

import com.github.javafaker.Cat;

import java.util.ArrayList;

public class LibraryManagement {
    /**
     * Acceptance Criteria:
     * - Each material should have an availability count, and the program should check if the material is still available for borrowing.
     * - The program should demonstrate polymorphism by allowing operations (borrow, return) to be performed on any type of library material through a single method.
     * - The program should include methods to borrow and return materials.
     * - The program should keep track of the available and borrowed materials.
     * - The program should print out the status of materials (available, borrowed) and the actions performed (borrow, return).
     *
     * Notes:
     * - The program doesn't require a menu system; focus should be on Object-Oriented Programming (OOP) and inheritance implementation.
     * - Make sure to implement Inheritance and Polymorphism properly
     */
    public static void main(String[] args) {
        Book book1 = new Book(50, 700, "Java for Dummies", "Alnando");
        book1.borrowItem();
        book1.borrowItem();
        book1.returnItem();

        ArrayList<Category> arrayList = new ArrayList<>();
        arrayList.add(book1);

        for (Category x : arrayList) {
            x.printStatus();
        }
    }
}
