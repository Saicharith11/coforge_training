package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {
	public boolean saveEmployee(Employee employee);

	public boolean updateEmployee(int emp_id , Employee employee);

	public boolean deleteEmployee(int EmpId);

	public Optional<Employee> findByEid(int EmpId);

	public Iterable<Employee> findAllEmployees();

	public List<Employee> findByEname(String EmpName) ;

	public boolean deleteByEmpName(String empName);
	
	public List<Integer> getEidsList();

	public String getInfo();

}
