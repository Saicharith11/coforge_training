package com.coforge.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection()
			throws ClassNotFoundException, SQLException {

		// Loading MySQL driver
		Class.forName(ApplicationProperties.driver);

		// Creating database connection
		Connection connection = DriverManager.getConnection(
				ApplicationProperties.url,
				ApplicationProperties.userName,
				ApplicationProperties.password);

		return connection;
	}
}