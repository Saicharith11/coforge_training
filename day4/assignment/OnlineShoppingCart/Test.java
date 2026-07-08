package com.coforge.day4.assignment;

public class Test {
	public static void main(String[] args) {
		Customer cha = new Customer("Neeraj");
		cha.cart.addProduct(new Product(1, "Perfume", 1000));
		cha.cart.addProduct(new Product(2, "Apple", 100));
		
		Customer rith = new Customer("Kumar");
		rith.cart.addProduct(new Product(1, "Perfume", 3000));
		
		cha.cart.calculateTotal();
		rith.cart.calculateTotal();
		
	}

}