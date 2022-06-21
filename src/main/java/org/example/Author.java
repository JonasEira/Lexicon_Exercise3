package org.example;

import java.util.ArrayList;

public class Author {

    private String _name;
    private ArrayList<Book> books;

    public Author(String s) {
        _name = s;
        this.books = new ArrayList<Book>();
    }


    public ArrayList<Book> getBooks() {
        return books;
    }
    public String getBooksString(){
        String tmp = "";
        for(Book b : books){
            tmp += b.get_name() + "\n";
        }
        return tmp;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String s){
        this.books.add(new Book(s));
    }
}
