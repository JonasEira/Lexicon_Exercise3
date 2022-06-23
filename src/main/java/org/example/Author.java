package org.example;

import java.util.ArrayList;

public class Author {

    private String _name;
    private ArrayList<Book> books;
    private Author _nextAuthor;
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

    public void appendAuthor(Author auth){
        this.getLastAuthor()._nextAuthor = auth;
    }

    public String getAuthorName() {
        return this._name;
    }

    public Author getAuthor(String name) throws AuthorException{
        if(this._name != name){
            if(_nextAuthor != null){
                return this._nextAuthor.getAuthor(name);
            } else {
                throw new AuthorException("Author not found");
            }
        } else {
            return this;
        }
    }

    private Author getLastAuthor(){
        if(_nextAuthor == null){
            return this;
        } else {
            return this._nextAuthor;
        }
    }

    public class AuthorException extends Exception {
        public AuthorException(String author_not_found) {
            super(author_not_found);
        }
    }
}
