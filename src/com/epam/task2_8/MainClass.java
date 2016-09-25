package com.epam.task2_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Admin on 25.09.2016.
 */
public class MainClass {


    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("B", "Z", 100));
        list.add(new Book("A", "C", 200));
        list.add(new Book("G", "G", 33));
        list.add(new Book("ZE", "B", 44));

        int n = 1;
        Book b = new Book();
        b.cmpSort(list,n);
        System.out.println(list);
    }
}

