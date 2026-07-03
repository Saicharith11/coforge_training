package day3.assignment;

public class book {

    int bookId;
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}