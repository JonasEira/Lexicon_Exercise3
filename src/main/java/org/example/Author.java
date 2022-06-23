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
            tmp += b.getBookName() + "\n";
        }
        return tmp;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String s){
        Book b = new Book(s);
        b.setAuthor(this);
        this.books.add(b);
    }

    public String getAuthorName() {
        return this._name;
    }
}
