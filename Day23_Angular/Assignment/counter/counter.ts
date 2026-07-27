import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  standalone: false,
  templateUrl: './counter.html',
  styleUrl: './counter.css',
})
export class Counter {
  Count: number;

  constructor() {
    this.Count = 0; // Initial value set to 0
  }
  // increment count
  Increment() {
    this.Count++;
  }

  // decrement count
  Decrement() {
    this.Count--;
  }

  //reset count to 0
  Reset() {
    this.Count = 0;
  }
}