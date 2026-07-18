package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {
	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException;

	public boolean updateEmployee(int emp_id , Employee employee) throws InvalidEmployeeObjectException;

	public boolean deleteEmployee(int EmpId) throws InvalidEmployeeObjectException;

	public Optional<Employee> findByEid(int EmpId) throws EmployeeNotFoundException;

	public Iterable<Employee> findAllEmployees();

	public List<Employee> findByEname(String EmpName) throws InvalidEmployeeObjectException;

	public boolean deleteByEmpName(String empName) throws InvalidEmployeeObjectException , EmployeeNotFoundException;
	
	public List<Integer> getEidsList();

	public String getInfo();

}
