<<<<<<< HEAD
package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {

	// Creating DAO object
	private final EmployeeDAO dao = new EmployeeDAO();

	public int createEmployee(Employee emp)
			throws ClassNotFoundException, SQLException,
			InvalidEmployeeObjectException {

		int result = 0;

		// Checking employee details
		if (emp != null
				&& emp.getEmployeeId() > 0
				&& emp.getEmployeeName() != null
				&& emp.getEmployeeSalary() > 0
				&& emp.getDepartmentNumber() > 0) {

			result = dao.createEmployee(emp);

		} else {
			throw new InvalidEmployeeObjectException();
		}

		return result;
	}

	public int updateEmployee(Employee emp)
			throws ClassNotFoundException, SQLException,
			InvalidEmployeeObjectException {

		int result = 0;

		// Checking employee details
		if (emp != null
				&& emp.getEmployeeId() > 0
				&& emp.getEmployeeName() != null
				&& emp.getEmployeeSalary() > 0
				&& emp.getDepartmentNumber() > 0) {

			result = dao.updateEmployee(emp);

		} else {
			throw new InvalidEmployeeObjectException();
		}

		return result;
	}

	public int deleteEmployee(int empId)
			throws ClassNotFoundException, SQLException {

		// Deleting employee using id
		return dao.deleteEmployee(empId);
	}

	public Employee findEmployee(int empId)
			throws ClassNotFoundException, SQLException {

		// Finding employee using id
		return dao.findEmployee(empId);
	}

	public List<Employee> findAllEmployees()
			throws ClassNotFoundException, SQLException {

		// Getting all employee records
		return dao.findAllEmployees();
	}
=======
package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {

	// Creating DAO object
	private final EmployeeDAO dao = new EmployeeDAO();

	public int createEmployee(Employee emp)
			throws ClassNotFoundException, SQLException,
			InvalidEmployeeObjectException {

		int result = 0;

		// Checking employee details
		if (emp != null
				&& emp.getEmployeeId() > 0
				&& emp.getEmployeeName() != null
				&& emp.getEmployeeSalary() > 0
				&& emp.getDepartmentNumber() > 0) {

			result = dao.createEmployee(emp);

		} else {
			throw new InvalidEmployeeObjectException();
		}

		return result;
	}

	public int updateEmployee(Employee emp)
			throws ClassNotFoundException, SQLException,
			InvalidEmployeeObjectException {

		int result = 0;

		// Checking employee details
		if (emp != null
				&& emp.getEmployeeId() > 0
				&& emp.getEmployeeName() != null
				&& emp.getEmployeeSalary() > 0
				&& emp.getDepartmentNumber() > 0) {

			result = dao.updateEmployee(emp);

		} else {
			throw new InvalidEmployeeObjectException();
		}

		return result;
	}

	public int deleteEmployee(int empId)
			throws ClassNotFoundException, SQLException {

		// Deleting employee using id
		return dao.deleteEmployee(empId);
	}

	public Employee findEmployee(int empId)
			throws ClassNotFoundException, SQLException {

		// Finding employee using id
		return dao.findEmployee(empId);
	}

	public List<Employee> findAllEmployees()
			throws ClassNotFoundException, SQLException {

		// Getting all employee records
		return dao.findAllEmployees();
	}
>>>>>>> 21cb1583aead817d5fdb6759c6b55cbf04131396
}