package com.epam.task2_4;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (price != book.price) {
            return false;
        }
        if (title != null && !title.equals(book.title) || title == null && book.title != null) {
            return false;
        }
        return author != null && author.equals(book.author) || author == null && book.author == null;
    }

    public int hashCode() {
        int result;
        if (title != null) result = title.hashCode();
        else result = 0;
        if (author != null) result = 31 * result + author.hashCode();
        else result = 31 * result + 0;
        result = 31 * result + price;
        return result;
    }
}