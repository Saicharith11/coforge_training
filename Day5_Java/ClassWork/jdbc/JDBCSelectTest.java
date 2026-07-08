<<<<<<< HEAD
package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelectTest {
	public static void main(String[] args) throws Exception {
		//Step - 1 Loading DARIVER // employeemanagement
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" ,
				"root" , "Mailonly123_");
		
		//Step - 3
		
		String sql = "select * from department";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet result = statement.executeQuery(); //Select
		while (result.next()) {

            System.out.println(
                    result.getInt("DeptID") + " "
                    + result.getString("DeptName") + " "
                    + result.getString("Location")
            );
        }
		
		result.close();
		statement.close();
		connection.close();
		
	}

}
=======
package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelectTest {
	public static void main(String[] args) throws Exception {
		//Step - 1 Loading DARIVER // employeemanagement
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" ,
				"root" , "Mailonly123_");
		
		//Step - 3
		
		String sql = "select * from department";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet result = statement.executeQuery(); //Select
		while (result.next()) {

            System.out.println(
                    result.getInt("DeptID") + " "
                    + result.getString("DeptName") + " "
                    + result.getString("Location")
            );
        }
		
		result.close();
		statement.close();
		connection.close();
		
	}

}
>>>>>>> 21cb1583aead817d5fdb6759c6b55cbf04131396
