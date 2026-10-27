package com.example;

public class Book {
    private int id;
    private String title; 
    private String author;
    private double price;
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        setPrice(price);
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price < 0) {
            System.out.println("price can not positive");
            return ;
        }
        this.price = price;
    }
}
