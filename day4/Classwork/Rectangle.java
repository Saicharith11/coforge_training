package com.coforge.day4;

public class Rectangle extends Figure{
	public Rectangle() {
		super(1,99);	
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int l = getLen();
		int b = getBre();
		
		System.out.println("Area of Rectangle is : " + l * b);
	}
}
