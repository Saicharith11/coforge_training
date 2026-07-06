package day3.assignment;

public class mobile {

    private String brand;
    private String model;
    private int ram;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Brand: " + brand +
               "\nModel: " + model +
               "\nRAM: " + ram + " GB" +
               "\nPrice: " + price;
    }
}