package com.epam.task2_6;


public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book obj = null;
        obj = (Book) super.clone();
        return obj;
    }
}
