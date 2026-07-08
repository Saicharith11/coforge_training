package com.coforge.day4.abstraction;

public class Square extends Figure{
	public Square() {
		super(11);	
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int s = getSide();
		
		System.out.println("Area of Square is : " + s * s);
	}
}
