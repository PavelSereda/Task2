package com.epam.task2_7;

import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int istbn;

    public Book(String title, String author, int price, int istbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.istbn = istbn;
    }

    public int getIstbn() {
        return istbn;
    }

    @Override
    public int compareTo(Book book) {
        int bookIstbn = book.getIstbn();
        return this.istbn - bookIstbn;
    }

    public static TreeSet<Book> addObj() {
        TreeSet<Book> books = new TreeSet<Book>();
        books.add(new Book("Ship", "Duma", 1000, 5));
        books.add(new Book("House", "Alex", 1200, 1));
        books.add(new Book("Work", "Sergey", 1000, 6));
        for (Book b : books) {
            System.out.println(b.toString());
        }
        return books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", istbn=" + istbn +
                '}';
    }
}