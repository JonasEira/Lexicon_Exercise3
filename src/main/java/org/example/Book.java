package org.example;

public class Book {
    private Author _author;
    private String _name;

    public Book(String s) {
        setBookName(s);
    }

    public Author getAuthorObject() {
        return _author;
    }

    public void setAuthor(Author _author) {
        this._author = _author;
    }

    public String getBookName() {
        return _name;
    }

    public void setBookName(String _name) {
        this._name = _name;
    }
}
