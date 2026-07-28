import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Student1 } from './student1';

describe('Student1', () => {
  let component: Student1;
  let fixture: ComponentFixture<Student1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Student1],
    }).compileComponents();

    fixture = TestBed.createComponent(Student1);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
