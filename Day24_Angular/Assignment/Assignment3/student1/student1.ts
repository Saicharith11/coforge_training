import { Component } from '@angular/core';


interface Student {
  id: number;
  name: string;
  marks: number;
}

@Component({
  selector: 'app-student1',
  standalone: false,
  templateUrl: './student1.html',
  styleUrl: './student1.css',
})
export class Student1 {
    students: Student[];

  passCount: number;
  failCount: number;

  constructor() {

    this.students = [

      { id: 101, name: "Rahul",   marks: 85 },
      { id: 102, name: "Sai",     marks: 29 },
      { id: 103, name: "Anjali",  marks: 72 },
      { id: 104, name: "Priya",   marks: 91 },
      { id: 105, name: "Ramesh",  marks: 18 },
      { id: 106, name: "Akhil",   marks: 60 },
      { id: 107, name: "Sneha",   marks: 34 },
      { id: 108, name: "Varun",   marks: 55 },
      { id: 109, name: "Keerthi", marks: 41 },
      { id: 110, name: "Arjun",   marks: 95 }

    ];

    this.passCount = 0;
    this.failCount = 0;

    for(let student of this.students){

      if(student.marks >= 35){
        this.passCount++;
      }
      else{
        this.failCount++;
      }

    }

  }

}
