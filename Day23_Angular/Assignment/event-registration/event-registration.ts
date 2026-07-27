import { Component } from '@angular/core';

@Component({
  selector: 'app-event-registration',
  standalone: false,
  templateUrl: './event-registration.html',
  styleUrl: './event-registration.css',
})
export class EventRegistration {
  // Input fields bound to template
  Name: string = '';
  Email: string = '';
  Course: string = '';

  // Function called on Register click
  onRegister() {
    console.log('Registration Successful!');
    console.log('Name:', this.Name);
    console.log('Email:', this.Email);
    console.log('Course:', this.Course);
  }

  // Function called on Reset click
  onReset() {
    this.Name = '';
    this.Email = '';
    this.Course = '';
    console.log('Form Reset!');
  }
}