import Lessons.MAIN.Lesson1.Book;
import Lessons.MAIN.Lesson1.Lesson2.Author;

public class ForMain {
    public static void main(String[] args) {
        Book pikovayaDama = new Book("Pushkin", "Pikovaya Dama", 1910);
        Book krasnayaTabletka = new Book("Andrew Kurpatov", "Krasnaya Tabltka" , 2017);
        Author levTolstoi = new Author("Lev", "Tolstoi");
        Author michaelLomonosov = new Author("Michael", "Lomonosov");
        pikovayaDama.setYear(1944);
    }
}
