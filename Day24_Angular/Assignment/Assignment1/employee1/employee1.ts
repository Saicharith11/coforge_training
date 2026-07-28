import { Component } from '@angular/core';

@Component({
  selector: 'app-employee1',
  standalone: false,
  templateUrl: './employee1.html',
  styleUrl: './employee1.css',
})
export class Employee1 {
  employeeId: number;
  employeeName: string;
  employeeSalary: number;
  departmentNumber: number;

  isEmployeeAvailable: boolean;


  constructor() {
    this.employeeId = 1;
    this.employeeName = "Sai Charith";
    this.employeeSalary = 100000;
    this.departmentNumber = 10;


    this.isEmployeeAvailable = true;
  }

    toggleEmployee() {
    this.isEmployeeAvailable = !this.isEmployeeAvailable;
  }


}
