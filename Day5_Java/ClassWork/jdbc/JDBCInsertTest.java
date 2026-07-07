package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertTest {
	public static void main(String[] args) throws Exception {
		//Step - 1 Loading DARIVER // employeemanagement
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" ,
				"root" , "Mailonly123_");
		
		//Step - 3
		
		String sql = "insert into department values (?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1 , 105);
		statement.setString(2 , "IT");
		statement.setString(3 , "Hyderabad");
		
		int n = statement.executeUpdate(); //INSERT , UPDATE , DELETE
		if(n == 1) {
			System.out.println("Record Updartes");
		} else {
			System.out.println("Record NOT UpdarteD");
			
		}
		statement.close();
		connection.close();
		
	}

}
