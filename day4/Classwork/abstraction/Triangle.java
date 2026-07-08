package com.coforge.day4.abstraction;

public class Triangle extends Figure {
	public Triangle() {
		super(1111L,999L);	
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		long ba = getHei();
		long h = getBas();
		
		System.out.println("Area of Triangle is : " + 0.5 * ba * h ) ;
	}
}
