package org.example;

public class Book {
    private Author _author;
    private String _name;

    public Book(String s) {
        set_name(s);
    }

    public Author get_author() {
        return _author;
    }

    public void set_author(Author _author) {
        this._author = _author;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
