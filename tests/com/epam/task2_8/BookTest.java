package com.epam.task2_8;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import static org.testng.Assert.*;


public class BookTest {
    ArrayList<Book> books = new ArrayList<>();
    Book b = new Book();


    @Test
    public void testCmpSortWithPrice() throws Exception {
        int n = 4;
        books.clear();
        books.add(new Book("A", "A", 100));
        books.add(new Book("A", "A", 200));
        books.add(new Book("A", "A", 33));
        books.add(new Book("A", "A", 44));

        books = b.cmpSort(books, n);

        for (int i = 0; i < books.size() - 1; i++) {
            Assert.assertTrue((books.get(i + 1).price) >= (books.get(i).price));
        }
    }
}