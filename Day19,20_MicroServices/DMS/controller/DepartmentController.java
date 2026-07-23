package com.coforge.dms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/dms")
public class DepartmentController {

	DepartmentService service;

	@Autowired
	public DepartmentController(DepartmentService service) {
		super();
		this.service = service;

	}

	@GetMapping("/departments/{dno}")
	public ResponseEntity<?> getDepartmentById(@Valid @NotNull @PathVariable("dno") int dno) {
		ResponseEntity<?> responseEntity = null;
		Optional<Department> department = service.getDepartmentById(dno);

		if (department.isPresent()) {
			responseEntity = new ResponseEntity<>(department.get(), HttpStatus.OK);
		}

		return responseEntity;
	}
	
	@GetMapping("/departments")
	public ResponseEntity<?> findDepts() {
		ResponseEntity<?> responseEntity = null;
		List<Department> department = service.findDepts();

		if (!department.isEmpty()) {
			responseEntity = new ResponseEntity<>(department, HttpStatus.OK);
		}

		return responseEntity;
	}
	
	
}
