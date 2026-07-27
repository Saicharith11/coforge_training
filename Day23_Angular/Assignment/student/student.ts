import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  standalone: false,
  templateUrl: './student.html',
  styleUrl: './student.css',
})
export class Student {

   studentName: string;
  course: string;
  college: string;
  imagePath: string;

  constructor() {
    this.studentName = "Sai Charith";
    this.course = "CSE - Data Science";
    this.college = "VNR VJIET";
    this.imagePath = "Professional_Photo.jpg";
  }
}
