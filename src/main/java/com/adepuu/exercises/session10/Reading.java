package com.adepuu.exercises.session10;

public class Reading implements Category {
    protected int stock;
    protected int pages;
    protected int borrowed;
    protected String title;
    protected String author;

    public Reading(int stock, int pages, String title, String author) {
        this.stock = stock;
        this.pages = pages;
        this.borrowed = 0;
        this.title = title;
        this.author = author;
    }

    @Override
    public void borrowItem() {
        if (stock > 0) {
            this.stock--;
            this.borrowed++;
            System.out.println("Thank you for borrowing the book, please return it in time! Thank you!");
        }
    }

    @Override
    public void returnItem() {
        stock++;
        borrowed--;
        System.out.println("Thank you for returning the book!");
    }

    @Override
    public void printStatus() {
        System.out.println(stock);
        System.out.println(borrowed);
    }
}

