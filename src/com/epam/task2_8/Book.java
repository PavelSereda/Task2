package com.epam.task2_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Book {
    public String title;
    public String author;
    public int price;
    private static int edition;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public ArrayList<Book> cmpSort(ArrayList<Book> list, int n) {

        switch (n) {
            case 1: {
                list.sort((o1, o2) -> o1.title.compareTo(o2.title));//по названию
                break;
            }
            case 2: {
                list.sort((o1, o2) -> {// по названию и автору
                    int i = o1.title.compareTo(o2.title);
                    if (i == 0) return o1.author.compareTo(o2.author);
                    else return i;

                });
                break;
            }

            case 3: {
                list.sort((o1, o2) -> {// по автору и по названию
                    int i = o1.author.compareTo(o2.author);
                    if (i == 0) return o1.title.compareTo(o2.title);
                    else return i;
                });
                break;
            }


            case 4: {
                list.sort((o1, o2) -> {//по автрору, названию и цене
                    int i = o1.author.compareTo(o2.author);
                    if (i == 0) i = o1.title.compareTo(o2.title);
                    if (i == 0) {
                        return o1.price - o2.price;
                    } else return i;
                });
                break;
            }
            default:
                return list;
        }


        return list;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price + "\n";
    }
}