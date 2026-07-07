package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateTest {
	public static void main(String[] args) throws Exception {
		//Step - 1 Loading DARIVER // employeemanagement
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" ,
				"root" , "Mailonly123_");
		
		//Step - 3
		
		String sql = "delete from department WHERE DeptID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1 , 105);
		
		int n = statement.executeUpdate(); //INSERT , UPDATE , DELETE
		if(n == 1) {
			System.out.println("Record Deelted");
		} else {
			System.out.println("Record NOT Deleted");
			
		}
		statement.close();
		connection.close();
		
	}

}
