package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Pontiac", 1963, "green", 2.5);
        System.out.println(myCar.drive());


        try {
            Author authors = new Author("Arthur");
            authors.addBook("Arthurs Funny book");
            authors.addBook("Arthurs Happy book");
            authors.addBook("Arthurs Tricky book");
            authors.addBook("Arthurs Horror book");

            authors.appendAuthor(new Author("Benjamin"));
            authors.getAuthor("Benjamin").addBook("Benjamins Funny book");
            authors.getAuthor("Benjamin").addBook("Benjamins Happy book");
            authors.getAuthor("Benjamin").addBook("Benjamins Tricky book");
            authors.getAuthor("Benjamin").addBook("Benjamins Horror book");

            authors.appendAuthor(new Author("Karen"));
            authors.getAuthor("Benjamin").addBook("Karens Funny book");
            authors.getAuthor("Benjamin").addBook("Karens Happy book");
            authors.getAuthor("Benjamin").addBook("Karens Tricky book");
            authors.getAuthor("Benjamin").addBook("Karens Horror book");

            System.out.println(authors.getAuthor("Arthur").getBooksString());
            System.out.println(authors.getAuthor("Benjamin").getBooksString());
            System.out.println(authors.getAuthor("Karen").getBooksString());

        } catch (Author.AuthorException e) {
            throw new RuntimeException(e);
        }
    }


}