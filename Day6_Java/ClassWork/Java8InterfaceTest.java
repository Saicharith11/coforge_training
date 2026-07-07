package com.coforge.day6;


interface MyInterface{
	public void myMethod(); 
	public default void myMethod2() {
		
		System.out.println("Default Method");
	}
	public static void myMethod3() {
		System.out.println("Static Method");
	}
	
	
}

public class Java8InterfaceTest implements MyInterface{
	
	public static void main(String[] args) {
		
		
        Java8InterfaceTest obj = new Java8InterfaceTest();

        // Calling implemented abstract method
        obj.myMethod();

        // Calling overridden default method
        obj.myMethod2();

        // Calling static interface method
        MyInterface.myMethod3();

		
		
	}
	
	public void myMethod() {
		System.out.println("Abstract Methododod111");
	}
	@Override
	public void myMethod2() {
		
			System.out.println("Default Method111");
		}
}
