//import { Component } from '@angular/core';
/*
import { EmployeeService } from '../../services/employee-service';
import { Employee } from '../../models/Employee';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
  employee : Employee;
  result! : string;
  constructor(private employeeService : EmployeeService) {
    this.employee = new Employee();
  }

  saveEmployee(data : any) {
    this.employee.empId = data.empId;
      this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    this.employee.deptNo = data.deptNo;

    this.result = this.employeeService.saveEmployee(this.employee);
  }
  deleteEmployee(data : any) {
    this.employeeService.deleteEmployee(data.empId);
  }
  /*
   findEmployee(empId: number) {
    this.employeeService.findEmployee(empId).subscribe({
      next: (employee) => {
        this.employee = employee;
        this.result = Employee found: ${employee.empName} (ID: ${employee.empId}, Salary: ${employee.empSalary}, Department: ${employee.deptNo});
      },
      error: (error) => this.result = error.error || 'Employee not found.'
    });
  }

  findAllEmployees() {
    this.employeeService.findAllEmployees().subscribe({
      next: (employees) => {
        this.employees = employees;
        this.result = employees.length ? '' : 'No employees found.';
      },
      error: (error) => {
        this.employees = [];
        this.result = error.error || 'Unable to retrieve employees.';
      },
    });
  }
    */
//}

import { Component } from '@angular/core';
import { EmployeeService } from '../../services/employee-service';
import { Employee } from '../../models/Employee';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {

  employee: Employee;
  result!: string;
  employees : Employee[] = [];
  constructor(private employeeService: EmployeeService) {
    this.employee = new Employee();
  }

  saveEmployee(data: Employee) {
    this.setEmployee(data);
    this.employeeService.saveEmployee(this.employee).subscribe({
      next: (response) => this.result = response,
      error: (error) => this.result = error.error || 'Unable to save employee.'
    });
  }

  updateEmployee(data: Employee) {
    this.setEmployee(data);
    this.employeeService.updateEmployee(this.employee).subscribe({
      next: (response) => this.result = response,
      error: (error) => this.result = error.error || 'Unable to update employee.'
    });
  }

  deleteEmployee(empId: number) {
    this.employeeService.deleteEmployee(empId).subscribe({
      next: (response) => this.result = response,
      error: (error) => this.result = error.error || 'Unable to delete employee.'
    });
  }

  findEmployee(empId: number) {
    this.employeeService.findEmployee(empId).subscribe({
      next: (employee) => {
        this.employee = employee;
        this.result = `Employee found: ${employee.empName} (ID: ${employee.empId}, Salary: ${employee.empSalary}, Department: ${employee.deptNo})`;
      },
      error: (error) => this.result = error.error || 'Employee not found.'
    });
  }

  findAllEmployees() {
    this.employeeService.findAllEmployees().subscribe({
      next: (employees) => {
        this.employees = employees;
        this.result = employees.length ? '' : 'No employees found.';
      },
      error: (error) => {
        this.employees = [];
        this.result = error.error || 'Unable to retrieve employees.';
      },
    });
  }

  private setEmployee(data: Employee) {
    this.employee.empId = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    this.employee.deptNo = data.deptNo;
  }

}
