package day3.assignment;

public class product {

    int productId;
    String productName;
    double price;
    int quantity;

    double calculateTotal() {
        return price * quantity;
    }

    void displayBill() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + calculateTotal());
    }
}