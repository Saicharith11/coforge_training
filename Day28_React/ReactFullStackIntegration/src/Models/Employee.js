import { Component } from "react";

class Employee {
    constructor(empId, empName, empSalary, deptNo) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.deptNo = deptNo;
    }
}

export default Employee;