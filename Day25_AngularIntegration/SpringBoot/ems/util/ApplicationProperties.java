package com.coforge.ems.util;

public class ApplicationProperties {

	// ================= Database Connection Properties =================

	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/employeemanagement";
	public static final String username = "root";
	public static final String password = "Mailonly123_";

	// ================= Database SQL Queries =================

	public static final String insertSql =
			"INSERT INTO tbl_employee VALUES (?, ?, ?, ?)";

	public static final String updateSql =
			"UPDATE tbl_employee SET empName = ?, empSalary = ?, deptNo = ? WHERE empId = ?";

	public static final String deleteSql =
			"DELETE FROM tbl_employee WHERE empId = ?";

	public static final String findAllSql =
			"SELECT * FROM tbl_employee";

	public static final String findSql =
			"SELECT * FROM tbl_employee WHERE empId = ?";

	// ================= Application Response Properties =================

	public static final String insertSuccess = "SUCCESS : Employee Record Inserted";

	public static final String updateSuccess = "SUCCESS : Employee Record Updated";

	public static final String deleteSuccess = "SUCCESS : Employee Record Deleted";

	public static final String dbFailed = "FAILED : DB Error";

	public static final String notFound = "FAILED : Employee Record Not Found";

	// ================= Application Validation Properties =================

	public static final String validationFailed = "FAILED : Invalid Employee Details";
}