package com.coforge.day6;


interface Calculator {
	public int calc(int a , int b);

}


public class MyClass {
	public static void main (String[] args) {
		Calculator add = (a,b) -> a + b;
		System.out.println(add.calc(11, 12));
		
		Calculator call = (a,b) -> a - b;
		System.out.println(call.calc(11, 12));
		
		Calculator mult = (a,b) -> a * b;
		System.out.println(mult.calc(11, 10));
		
		Calculator div = (a,b) -> a /  b;
		System.out.println(div.calc(12, 1));
	}
}
