package com.coforge.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.ems.dto.DepartmentDTO;
import com.coforge.ems.dto.EmployeeDTO;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/ems")
public class EmployeeController {

	// @Autowired // Field Injection
	private EmployeeService service;

	private Environment environment;

	@Autowired // Constructor Injection
	public EmployeeController(EmployeeService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/employees")
	public ResponseEntity<String> saveEmployee(@Valid @NotNull @RequestBody(required = false) Employee employee) {
		ResponseEntity<String> responseEntity = null;

		boolean status = service.saveEmployee(employee);
		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.save.success"), HttpStatus.CREATED);

		return responseEntity;
	}

	@PutMapping("/employees/{EmpId}")
	public ResponseEntity<String> updateEmployee(@PathVariable int EmpId,
			@Valid @NotNull @RequestBody Employee employee) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.updateEmployee(EmpId, employee);
		if (status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.update.success"), HttpStatus.CREATED);
		}
		return responseEntity;
	}

	@DeleteMapping("/employees/{EmpId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int EmpId) {
		ResponseEntity<String> responseEntity = null;

		boolean status = service.deleteEmployee(EmpId);
		if (status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.CREATED);
		}

		return responseEntity;
	}

	@GetMapping("/employees/{EmpId}")
	public ResponseEntity<?> findByEid(@PathVariable("EmpId") int EmpId) {
		ResponseEntity<?> responseEntity = null;

		Optional<Employee> employee = service.findByEid(EmpId);
		if (employee.isPresent()) {
			Employee emp = employee.get();
			return ResponseEntity.ok(emp);
		}
		responseEntity = new ResponseEntity<>(employee.get().toString(), HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/employees")
	public ResponseEntity<?> findAllEmployees() {
		ResponseEntity<?> responseEntity = null;

		Iterable<Employee> employees = service.findAllEmployees();
		responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/employees/EmpName/{EmpName}")
	public ResponseEntity<?> findByEname(@PathVariable("EmpName") String EmpName) {
		ResponseEntity<?> responseEntity = null;

		List<Employee> employee = service.findByEname(EmpName);
		responseEntity = new ResponseEntity<>(employee, HttpStatus.OK);

		return responseEntity;
	}

	@DeleteMapping("/employees/ename/{empName}")
	public ResponseEntity<String> deleteByEmpName(@PathVariable("empName") String empName) {

		boolean status = service.deleteByEmpName(empName);

		return new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);
	}

	@GetMapping("/employees/eids")
	public ResponseEntity<?> getEidsList() {

		ResponseEntity<?> responseEntity = null;

		List<Integer> eids = service.getEidsList();

		responseEntity = new ResponseEntity<>(eids, HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/employees/info")
	public ResponseEntity<?> getInfo() {

		ResponseEntity<?> responseEntity = null;

		String info = service.getInfo();

		responseEntity = new ResponseEntity<>(info, HttpStatus.OK);

		return responseEntity;
	}

	// Rest End Points for feign client department
	@GetMapping("/employees/departments/{dno}")
	public ResponseEntity<?> findDepartmentById(@PathVariable int dno) {
		ResponseEntity<?> responseEntity = null;
		DepartmentDTO department = service.findDepartmentById(dno);
		if (department != null) {

			responseEntity = new ResponseEntity<>(department, HttpStatus.OK);
		}
		else {
			responseEntity = new ResponseEntity<>("FAILED : DEPT NOT FOUND" , HttpStatus.BAD_REQUEST);

		}
		return responseEntity;

	}
	
	@GetMapping("/employees/departments")
	public ResponseEntity<List<DepartmentDTO>> findAllDepartments() {
		ResponseEntity<List<DepartmentDTO>> responseEntity = null;
		List<DepartmentDTO> department = service.findAllDepartments();
		responseEntity = new ResponseEntity<>(department, HttpStatus.OK);
		return responseEntity;

	}
	
	@GetMapping("/employees/{EmpId}/departments")
	public ResponseEntity<EmployeeDTO> findEmployeeDetails(@PathVariable("EmpId") int EmpId) {
		ResponseEntity<EmployeeDTO> responseEntity = null;
			
			EmployeeDTO employeeDto = new EmployeeDTO();
			Employee employee = service.findByEid(EmpId).get();
			DepartmentDTO department = service.findDepartmentById(employee.getDeptNo());
				
			employeeDto.setEmployee(employee);
			employeeDto.setDepartment(department);
	
			responseEntity = new ResponseEntity<>(employeeDto, HttpStatus.OK);
	
			return responseEntity;
		}
	

}
