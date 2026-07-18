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

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

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
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		ResponseEntity<String> responseEntity = null;
		try {
			boolean status = service.saveEmployee(employee);
			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.save.success"), HttpStatus.CREATED);
			}
		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.fail"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@PutMapping("/employees/{EmpId}")
	public ResponseEntity<String> updateEmployee(@PathVariable int EmpId, @RequestBody Employee employee) {
		ResponseEntity<String> responseEntity = null;
		try {
			boolean status = service.updateEmployee(EmpId, employee);
			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.update.success"),
						HttpStatus.CREATED);
			}
		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.fail"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@DeleteMapping("/employees/{EmpId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int EmpId) {
		ResponseEntity<String> responseEntity = null;
		try {
			boolean status = service.deleteEmployee(EmpId);
			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"),
						HttpStatus.CREATED);
			}
		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.fail"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}

	@GetMapping("/employees/{EmpId}")
	public ResponseEntity<?> findByEid(@PathVariable("EmpId") int EmpId) {
		ResponseEntity<?> responseEntity = null;

		try {
			Optional<Employee> employee = service.findByEid(EmpId);
			if (employee.isPresent()) {
				Employee emp = employee.get();
				return ResponseEntity.ok(emp);
			}
				responseEntity = new ResponseEntity<>(employee.get().toString(), HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}
	
	@GetMapping("/employees")
	public ResponseEntity<?> findAllEmployees() {
		ResponseEntity<?> responseEntity = null;

		try {
			Iterable<Employee> employees = service.findAllEmployees();
			return ResponseEntity.ok(employees);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}
	
	@GetMapping("/employees/EmpName/{EmpName}")
	public ResponseEntity<?> findByEname(@PathVariable("EmpName") String EmpName) {
		ResponseEntity<?> responseEntity = null;

		try {
			List<Employee> employee = service.findByEname(EmpName);
			responseEntity = new ResponseEntity<>(employee , HttpStatus.OK);
		} catch (InvalidEmployeeObjectException e) {
			responseEntity = new ResponseEntity<>(e.toString(), HttpStatus.NOT_FOUND);
			
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
		}

		return responseEntity;
	}
	
	@DeleteMapping("/employees/ename/{empName}")
	public ResponseEntity<String> deleteByEmpName(
	        @PathVariable("empName") String empName) {

	    try {

	        boolean status = service.deleteByEmpName(empName);

	        return new ResponseEntity<>(
	                environment.getProperty("ems.delete.success"),
	                HttpStatus.OK);

	    } catch (InvalidEmployeeObjectException e) {

	        return new ResponseEntity<>(
	                e.toString(),
	                HttpStatus.BAD_REQUEST);

	    } catch (EmployeeNotFoundException e) {

	        return new ResponseEntity<>(
	                e.toString(),
	                HttpStatus.NOT_FOUND);

	    } catch (Exception e) {

	        return new ResponseEntity<>(
	                environment.getProperty("ems.db.failed"),
	                HttpStatus.BAD_REQUEST);
	    }
	}
	
	@GetMapping("/employees/eids")
	public ResponseEntity<?> getEidsList() {

	    ResponseEntity<?> responseEntity = null;

	    try {

	        List<Integer> eids = service.getEidsList();

	        responseEntity =
	                new ResponseEntity<>(eids, HttpStatus.OK);

	    } catch (Exception e) {

	        responseEntity =
	                new ResponseEntity<>(
	                        environment.getProperty("ems.db.failed"),
	                        HttpStatus.BAD_REQUEST);
	    }

	    return responseEntity;
	}


	@GetMapping("/employees/info")
	public ResponseEntity<?> getInfo() {

	    ResponseEntity<?> responseEntity = null;

	    try {

	        String info = service.getInfo();

	        responseEntity =
	                new ResponseEntity<>(info, HttpStatus.OK);

	    } catch (Exception e) {

	        responseEntity =
	                new ResponseEntity<>(
	                        environment.getProperty("ems.db.failed"),
	                        HttpStatus.BAD_REQUEST);
	    }

	    return responseEntity;
	}

}
