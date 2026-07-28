import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Contanct } from './contanct';

describe('Contanct', () => {
  let component: Contanct;
  let fixture: ComponentFixture<Contanct>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Contanct],
    }).compileComponents();

    fixture = TestBed.createComponent(Contanct);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
