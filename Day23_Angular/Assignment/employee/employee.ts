import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  standalone: false,
  templateUrl: './employee.html',
  styleUrl: './employee.css',
})
export class Employee {
  employeeId : number;
  employeeName : string;
  employeeSalary : number;
  employeeDepartment : string;
  constructor() {
    this.employeeId = 1;
    this.employeeName = "Sai Charith";
    this.employeeSalary = 10000;
    this.employeeDepartment = "IT";
  }



}
