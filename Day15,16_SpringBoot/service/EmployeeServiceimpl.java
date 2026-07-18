package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	private EmployeeRepo repo;
	
	
	@Autowired
	public EmployeeServiceimpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	

	@Override
	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException{
		//Validation
		if(employee != null && employee.getEmpId() > 0 && employee.getEmpName() != null) {
			repo.save(employee);
			return true;
		}
		else
			throw new InvalidEmployeeObjectException();
		
	}



	@Override
	public boolean updateEmployee(int EmpId , Employee employee) throws InvalidEmployeeObjectException {
		// TODO Auto-generated method stub
		
		if(EmpId > 0 && employee != null && employee.getEmpId() > 0 && employee.getEmpName() != null) {
			repo.save(employee);
			return true;
		}
		else
			throw new InvalidEmployeeObjectException();
	}



	@Override
	public boolean deleteEmployee(int EmpId) throws InvalidEmployeeObjectException {
		// TODO Auto-generated method stub
		if(EmpId > 0) {
			repo.deleteById(EmpId);
			return true;
		}
		else
			throw new InvalidEmployeeObjectException();	}



	@Override
	public Optional<Employee> findByEid(int EmpId) throws EmployeeNotFoundException {
		if(EmpId > 0) {
			if(!repo.existsById(EmpId)) {
				throw new EmployeeNotFoundException();
			}
	}
		Optional<Employee> employee = repo.findById(EmpId);
		return employee;
}



	@Override
	public Iterable<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	@Override
	public List<Employee> findByEname(String EmpName) throws InvalidEmployeeObjectException {
		if(EmpName == null) {
			throw new InvalidEmployeeObjectException();
		} 
		return repo.findByEmpName(EmpName);
	}



	@Override
	@Transactional
	public boolean deleteByEmpName(String empName)
	        throws InvalidEmployeeObjectException,
	               EmployeeNotFoundException {

	    if (empName != null && !empName.trim().isEmpty()) {

	        long count = repo.deleteByEmpName(empName);

	        if (count > 0) {
	            return true;
	        }

	        throw new EmployeeNotFoundException();
	    }

	    throw new InvalidEmployeeObjectException();
	}
	
	@Override
	public List<Integer> getEidsList() {
	    return repo.getEids();
	}

	@Override
	public String getInfo() {
	    return repo.getInfo();
	}

}
