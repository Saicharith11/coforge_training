package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.dms.exception.DepartmentNotFoundException;
import com.coforge.dms.model.Department;
import com.coforge.dms.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	DepartmentRepo repo;
	Environment environment;
	

	public DepartmentServiceImpl(DepartmentRepo repo , Environment environment) {
		super();
		this.repo = repo;
		this.environment = environment;
	}

	@Override
	public Optional<Department> getDepartmentById(int dno) {
		
		if (!repo.existsById(dno)) {
			throw new DepartmentNotFoundException(environment.getProperty("dms.invalid.dept_notfound"));
		}
		Optional<Department> department = repo.findById(dno);
		System.out.println(department);
		System.out.println(department.get());
		return department;
	}

	@Override
	public List<Department> findDepts() {
		List<Department> departments = (List<Department>) repo.findAll();
		// TODO Auto-generated method stub
		return departments;
	}

	
}
