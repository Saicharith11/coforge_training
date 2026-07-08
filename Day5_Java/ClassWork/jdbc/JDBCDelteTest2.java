<<<<<<< HEAD
package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDelteTest2 {
	public static void main(String[] args) throws Exception {
		//Step - 1 Loading DARIVER // employeemanagement
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" ,
				"root" , "Mailonly123_");
		
		//Step - 3
		
		String sql = "update department SET DeptName = ? WHERE DeptID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		statement.setString(1 , "Marketing");
		statement.setInt(2 , 105);
		
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
=======
package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDelteTest2 {
	public static void main(String[] args) throws Exception {
		//Step - 1 Loading DARIVER // employeemanagement
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" ,
				"root" , "Mailonly123_");
		
		//Step - 3
		
		String sql = "update department SET DeptName = ? WHERE DeptID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		
		statement.setString(1 , "Marketing");
		statement.setInt(2 , 105);
		
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
>>>>>>> 21cb1583aead817d5fdb6759c6b55cbf04131396
