package com.coforge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @Column(name = "empId")
    private int empId;

    @Column(name = "empName", length = 100)
    private String empName;

    @Column(name = "empSalary")
    private int empSalary;

    @Column(name = "deptNo")
    private int deptNo;

    public Employee() {
    }

    public Employee(int empId, String empName, int empSalary, int deptNo) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.deptNo = deptNo;
    }

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