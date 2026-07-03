package day3.assignment;

public class BookApp {

    public static void main(String[] args) {

        book b = new book();

        b.bookId = 101;
        b.title = "Java Programming";
        b.author = "James";
        b.price = 500;

        b.displayDetails();
    }
}