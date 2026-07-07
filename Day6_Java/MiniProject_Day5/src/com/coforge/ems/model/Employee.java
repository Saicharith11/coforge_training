package com.coforge.ems.model;

public class Employee {

	// Employee details
	private int empId;
	private String empName;
	private int empSalary;
	private int deptNo;

	// Constructor to initialize employee details
	public Employee(int empId, String empName, int empSalary, int deptNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptNo = deptNo;
	}

	// Default constructor
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName 
				+ ", empSalary=" + empSalary + ", deptNo=" + deptNo + "]";
	}

	public int getEmployeeId() {
		return empId;
	}

	public void setEmployeeId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return empName;
	}

	public void setEmployeeName(String empName) {
		this.empName = empName;
	}

	public int getEmployeeSalary() {
		return empSalary;
	}

	public void setEmployeeSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public int getDepartmentNumber() {
		return deptNo;
	}

	public void setDepartmentNumber(int deptNo) {
		this.deptNo = deptNo;
	}
}