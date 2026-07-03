package com.coforge.day3;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee charith = new Employee(1 , "Sai" , 9000);
		charith.display();
		
		
		
		Employee Sai = new Employee(2 , "Charith" , 10000);
		Sai.display();
		
		Sai.setSalary(13000);
		Sai.display();
		
		Sai.display();
		
		
		Employee red = new Employee(3 , "Reddy" , 11000);
		red.display();

	}

}
