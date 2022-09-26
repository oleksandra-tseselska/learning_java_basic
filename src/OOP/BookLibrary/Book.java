package OOP.BookLibrary;

import OOP.BookLibrary.Interfaces.BookInterface;

import java.util.Arrays;
import java.util.HashSet;

//Library application  Interfaces:
// BookInterface (title, author, category, borrowed, ageLimit)
// UserInterface (name, age, active)
// LibraryInterface (books, users)

// Classes:
// Book: setCategory
// User: suspend
// Library: addBook (check for duplicates), findBook (by title and author), sortBooks (by title and author) removeBook (by name), sortUsers( by name), getBooksByCatogory
//new Book(“lord of the rings”, “sam”)
//Categories should be enums
//borrowBook( borrow by name)
//is user of age
//is book borrowed
public class Book implements BookInterface, Comparable<Book>{
    private String title;
    private String author;
    private String category;
    private Boolean borrowed;
    private int ageLimit;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.category = setCategory(Category.OTHER.getReadableName());
        this.borrowed = false;
        this.ageLimit = 18;
    }

    public Book(){}

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public String setCategory(String category) { return this.category = category; }
    public Boolean getBorrowed() { return borrowed; }
    public void setBorrowed(Boolean borrowed) { this.borrowed = borrowed; }
    public int getAgeLimit() { return ageLimit; }

    @Override
    public boolean isBookBorrowed(String title){
        return borrowed = BookInterface.super.isBookBorrowed(title);
    }

    @Override
    public int compareTo(Book o){
        return this.getTitle().charAt(0) - (int)o.getTitle().charAt(0);
    }
}
