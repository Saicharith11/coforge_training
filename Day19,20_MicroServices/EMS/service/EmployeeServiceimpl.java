package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.dto.DepartmentDTO;
import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;
import com.coforge.ems.service.client.DepartmentClient;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	private EmployeeRepo repo;
	private Environment environment;
	private DepartmentClient client;
	
	
	@Autowired
	public EmployeeServiceimpl(EmployeeRepo repo , Environment environment,DepartmentClient client) {
		super();
		this.repo = repo; 
		this.environment = environment;
		this.client= client;
	}
	
	

	

	@Override
	public boolean saveEmployee(Employee employee){
		//Validation
		
			repo.save(employee);
			return true;
	}



	@Override
	public boolean updateEmployee(int EmpId , Employee employee) {
		// TODO Auto-generated method stub
		
		if (!repo.existsById(EmpId)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notFound"));
		}

			repo.save(employee);
			return true;
		}



	@Override
	public boolean deleteEmployee(int EmpId)  {
		// TODO Auto-generated method stub
		if (!repo.existsById(EmpId)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		
			repo.deleteById(EmpId);
			return true;
		
}



	@Override
	public Optional<Employee> findByEid(int EmpId) {
		
		if (!repo.existsById(EmpId)) {
		throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
	}
		Optional<Employee> employee = repo.findById(EmpId);
		return employee;
}

//	
//	@Override
//	public Optional<Employee> findByEid(int eid) throws EmployeeNotFoundException {
//
//		if (!repo.existsById(eid)) {
//			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
//		}
//		Optional<Employee> employee = repo.findById(eid);
//		return employee;
//	}


	
	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		return employees;
	}



	@Override
	public List<Employee> findByEname(String EmpName) {
		List<Employee> employees = repo.findByEmpName(EmpName);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return employees;
		
	}

	
	


	@Override
	@Transactional
	public boolean deleteByEmpName(String empName) {


	        long count = repo.deleteByEmpName(empName);
	        if (count == 0) {
				throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
			}
			return true;
	}
	
	@Override
	public List<Integer> getEidsList() {
	    return repo.getEids();
	}

	@Override
	public String getInfo() {
	    return repo.getInfo();
	}





	@Override
	public DepartmentDTO findDepartmentById(int dno) {
		DepartmentDTO department = client.findDepartmentById(dno);
		return department;
	}

@Override
	public List<DepartmentDTO> findAllDepartments() {
		List<DepartmentDTO> departments = client.findAllDepartments();
		return departments;
	}

}
