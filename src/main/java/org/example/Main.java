package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Pontiac", 1963, "green", 2.5);
        System.out.println(myCar.drive());


        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Arthur"));
        authors.get(0).addBook("Arthurs Funny book");
        authors.get(0).addBook("Arthurs Happy book");
        authors.get(0).addBook("Arthurs Tricky book");
        authors.get(0).addBook("Arthurs Horror book");

        authors.add(new Author("Benjamin"));
        authors.get(0).addBook("Benjamins Funny book");
        authors.get(0).addBook("Benjamins Happy book");
        authors.get(0).addBook("Benjamins Tricky book");
        authors.get(0).addBook("Benjamins Horror book");

        System.out.println(authors.get(0).getBooksString());
        System.out.println(authors.get(1).getBooksString());

    }


}