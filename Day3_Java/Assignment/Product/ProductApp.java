package day3.assignment;

public class ProductApp {

    public static void main(String[] args) {

        product p = new product();

        p.productId = 101;
        p.productName = "Laptop";
        p.price = 50000;
        p.quantity = 2;

        p.displayBill();
    }
}