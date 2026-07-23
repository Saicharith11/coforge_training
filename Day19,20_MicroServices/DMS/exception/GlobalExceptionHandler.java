package com.coforge.dms.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends Exception{
	
	private Environment environment;

	@Autowired
	public GlobalExceptionHandler(Environment environment) {
		super();
		this.environment = environment;
	}
	
	@ExceptionHandler
	public ResponseEntity<?> handleDepartmentNotFoundException(DepartmentNotFoundException e){
		return new ResponseEntity<>(environment.getProperty("dms.invalid.dept_notfound"), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<?> handleException(Exception e){
		return new ResponseEntity<>(environment.getProperty("dms.db.failed"), HttpStatus.BAD_REQUEST);
	}
	
	

}
