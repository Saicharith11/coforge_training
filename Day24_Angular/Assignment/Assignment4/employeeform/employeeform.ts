import { Component } from '@angular/core';

@Component({
  selector: 'app-employeeform',
  standalone: false,
  templateUrl: './employeeform.html',
  styleUrl: './employeeform.css',
})
export class Employeeform {
    employeeId!: number;
  employeeName!: string;
  email!: string;
  mobile!: string;
  department!: string;
  gender!: string;
  joiningDate!: string;
  salary!: number;

  constructor() {

  }

  onSubmit() {
    alert("Employee Registered Successfully!");

    console.log("Employee ID:", this.employeeId);
    console.log("Employee Name:", this.employeeName);
    console.log("Email:", this.email);
    console.log("Mobile:", this.mobile);
    console.log("Department:", this.department);
    console.log("Gender:", this.gender);
    console.log("Date of Joining:", this.joiningDate);
    console.log("Salary:", this.salary);
  }
}
