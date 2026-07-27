import { Component } from '@angular/core';

@Component({
  selector: 'app-company',
  standalone: false,
  templateUrl: './company.html',
  styleUrl: './company.css',
})
export class Company {
  CompanyName : string;
  CEO : string;
  Location : string;
  EmployeeCount : number;
  Revenue : number;
  constructor() {
    this.CompanyName = "CR Solutoins Pvt Ltd";
    this.CEO = "Charith Reddy";
    this.Location = "Hyderabad, India";
    this.EmployeeCount = 500;
    this.Revenue = 10000000;
  }
}
