package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.ApplicationProperties;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {

	public int createEmployee(Employee emp)
			throws SQLException, ClassNotFoundException {

		int result = 0;
		Connection connection = DBUtil.getDBConnection();

		// Preparing query to add employee
		PreparedStatement statement = connection.prepareStatement(
				ApplicationProperties.insertSql);

		statement.setInt(1, emp.getEmployeeId());
		statement.setString(2, emp.getEmployeeName());
		statement.setInt(3, emp.getEmployeeSalary());
		statement.setInt(4, emp.getDepartmentNumber());

		result = statement.executeUpdate();

		return result;
	}

	public int updateEmployee(Employee emp)
			throws SQLException, ClassNotFoundException {

		int result = 0;
		Connection connection = DBUtil.getDBConnection();

		// Preparing query to update employee
		PreparedStatement statement = connection.prepareStatement(
				ApplicationProperties.updateSql);

		statement.setString(1, emp.getEmployeeName());
		statement.setInt(2, emp.getEmployeeSalary());
		statement.setInt(3, emp.getDepartmentNumber());
		statement.setInt(4, emp.getEmployeeId());

		result = statement.executeUpdate();

		return result;
	}

	public int deleteEmployee(int empId)
			throws SQLException, ClassNotFoundException {

		int result = 0;
		Connection connection = DBUtil.getDBConnection();

		// Preparing query to delete employee
		PreparedStatement statement = connection.prepareStatement(
				ApplicationProperties.deleteSql);

		statement.setInt(1, empId);

		result = statement.executeUpdate();

		return result;
	}

	public Employee findEmployee(int empId)
			throws SQLException, ClassNotFoundException {

		Employee emp = null;
		Connection connection = DBUtil.getDBConnection();

		// Preparing query to search employee
		PreparedStatement statement = connection.prepareStatement(
				ApplicationProperties.findSql);

		statement.setInt(1, empId);

		ResultSet rs = statement.executeQuery();

		if (rs.next()) {

			emp = new Employee(
					rs.getInt("eid"),
					rs.getString("ename"),
					rs.getInt("esalary"),
					rs.getInt("dno"));
		}

		return emp;
	}

	public List<Employee> findAllEmployees()
			throws SQLException, ClassNotFoundException {

		List<Employee> empList = new ArrayList<>();
		Connection connection = DBUtil.getDBConnection();

		// Preparing query to get all employees
		PreparedStatement statement = connection.prepareStatement(
				ApplicationProperties.findAllSql);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {

			Employee emp = new Employee(
					rs.getInt("empId"),
					rs.getString("empName"),
					rs.getInt("empSalary"),
					rs.getInt("deptNo"));

			empList.add(emp);
		}

		return empList;
	}
}