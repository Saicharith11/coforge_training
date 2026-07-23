package com.coforge.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @Column(name = "empId")
    @NotNull // not null
    private int empId;

    @Column(name = "empName", length = 100)
    @NotBlank
    private String empName;

    @Column(name = "empSalary")
    @Positive // greater than 0 
    private int empSalary;

    @Column(name = "deptNo")
    @Positive
    private int deptNo;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int empId, String empName, int empSalary, int deptNo) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.deptNo = deptNo;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName
                + ", empSalary=" + empSalary + ", deptNo=" + deptNo + "]";
    }
}