package com.epam.task2_7;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.testng.Assert.*;


public class BookTest {


    @Test
    public void testAddObj() throws Exception {

        LinkedHashSet<Book> books = new LinkedHashSet<>();
        books.add(new Book("House", "Alex", 1200, 1));
        books.add(new Book("Ship", "Duma", 1000, 5));
        books.add(new Book("Work", "Sergey", 1000, 6));

        TreeSet<Book> books2 = Book.addObj();
        Assert.assertTrue((books.toString()).equals(books2.toString()));
    }

    @Test
    public void testAddObj2() throws Exception {

        LinkedHashSet<Book> books = new LinkedHashSet<>();
        books.add(new Book("Ship", "Duma", 1000, 5));
        books.add(new Book("House", "Alex", 1200, 1));
        books.add(new Book("Work", "Sergey", 1000, 6));
        TreeSet<Book> books2 = Book.addObj();
        Assert.assertFalse((books.toString()).equals(books2.toString()));
    }

    @Test
    public void testAddObj3() throws Exception {

        LinkedHashSet<Book> books = new LinkedHashSet<>();
        books.add(new Book("Work", "Sergey", 1000, 6));
        books.add(new Book("Ship", "Duma", 1000, 5));
        books.add(new Book("House", "Alex", 1200, 1));
        TreeSet<Book> books2 = Book.addObj();
        Assert.assertFalse((books.toString()).equals(books2.toString()));
    }


}