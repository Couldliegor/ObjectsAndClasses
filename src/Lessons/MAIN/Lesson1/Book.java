package Lessons.MAIN.Lesson1;
public class Book {
    public String author;
    public String bookNick;
    public int year;

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
}
