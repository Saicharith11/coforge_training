package com.coforge.ems.controller;


import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

public class EmployeeController {

	// Creating service class object
	private final EmployeeService service = new EmployeeService();

	public String createEmployee(Employee emp) {

		String message = "";

		try {
			// Calling service method to create employee
			int result = service.createEmployee(emp);

			if (result == 1) {
				message = "SUCCESS : Employee Record Inserted";
			}

		} catch (ClassNotFoundException error) {
			error.printStackTrace();
			message = "FAILED : " + error.getMessage();

		} catch (SQLException error) {
			error.printStackTrace();
			message = "FAILED : " + error.getMessage();

		} catch (InvalidEmployeeObjectException error) {
			message = "FAILED : " + error;
		}

		return message;
	}

	public String updateEmployee(Employee emp) {

		String message = "";

		try {
			// Calling service method to update employee
			int result = service.updateEmployee(emp);

			if (result == 1) {
				message = "SUCCESS : Employee Record Updated";
			} else {
				message = "FAILED : Employee Record Not Updated";
			}

		} catch (ClassNotFoundException error) {
			message = "FAILED : DB Error";

		} catch (SQLException error) {
			message = "FAILED : DB Error";

		} catch (InvalidEmployeeObjectException error) {
			message = "FAILED : " + error;
		}

		return message;
	}

	public String deleteEmployee(int empId) {

		String message = "";

		try {
			// Calling service method to delete employee
			int result = service.deleteEmployee(empId);

			if (result == 1) {
				message = "SUCCESS : Employee Record Deleted";
			} else {
				message = "FAILED : Employee Record Not Found";
			}

		} catch (ClassNotFoundException error) {
			message = "FAILED : DB Error";

		} catch (SQLException error) {
			message = "FAILED : DB Error";
		}

		return message;
	}

	public Employee findEmployee(int empId) {

		Employee emp = null;

		try {
			// Getting employee by employee id
			emp = service.findEmployee(empId);

		} catch (ClassNotFoundException error) {
			System.out.println("DB Error");

		} catch (SQLException error) {
			System.out.println("DB Error");
		}

		return emp;
	}

	public List<Employee> findAllEmployees() {

		List<Employee> empList = null;

		try {
			// Getting all employee records
			empList = service.findAllEmployees();

		} catch (ClassNotFoundException error) {
			System.out.println("DB Error");

		} catch (SQLException error) {
			System.out.println("DB Error");
		}

		return empList;
	}
}