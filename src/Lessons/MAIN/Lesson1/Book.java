package Lessons.MAIN.Lesson1;

import Lessons.MAIN.Lesson1.Lesson2.Author;

public class Book {
    private String author;
    private String bookNick;
    private int year;

    public Book(String author, String bookNick, int year) {
        this.author = author;
        this.bookNick = bookNick;
        this.year = year;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getBookNick() {
        return this.bookNick;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
