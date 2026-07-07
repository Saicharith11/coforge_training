package com.coforge.ems.util;

public class ApplicationProperties {

	// Database details
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/employeemanagement";
	public static final String userName = "root";
	public static final String password = "Mailonly123_";

	// SQL queries
	public static final String insertSql =
			"insert into tbl_employee values (?, ?, ?, ?)";

	public static final String updateSql =
			"update tbl_emp set ename=?, esalary=?, dno=? where eid=?";

	public static final String deleteSql =
			"delete from tbl_employee where eid=?";

	public static final String findSql =
			"select * from tbl_employee where eid=?";

	public static final String findAllSql =
			"select * from tbl_employee";

	// Response messages
	public static final String insertSuccess =
			"SUCCESS : Employee Record Inserted";

	public static final String insertFailed =
			"FAILED : Employee Record Not Inserted";

	public static final String dbFailed =
			"FAILED : DB Error";
}