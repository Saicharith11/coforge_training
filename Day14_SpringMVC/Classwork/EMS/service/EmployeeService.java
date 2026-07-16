package com.coforge.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.ems.model.Employee;

@Service
public class EmployeeService {
	private List<Employee> list = new ArrayList<>(); // for database purpose , since we are not using dao

	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		boolean status = list.add(employee);
		
		return status;
	}
	
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		boolean status = false;
		for(int i = 0; i < list.size(); i++) {
			Employee emp = list.get(i);
			if (emp.getEid() == employee.getEid()) {
				list.remove(i);
				list.add(employee);
				return true;
			}
		}
		return status;
	}
	
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		boolean status = false;
		for(int i = 0; i < list.size(); i++) {
			Employee emp = list.get(i);
			if (emp.getEid() == employee.getEid()) {
				list.remove(i);
				list.add(employee);
				return true;
			}
		}
		return status;
	}

	
	
	

   
}