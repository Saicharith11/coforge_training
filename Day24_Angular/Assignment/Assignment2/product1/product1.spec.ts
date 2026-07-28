import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Product1 } from './product1';

describe('Product1', () => {
  let component: Product1;
  let fixture: ComponentFixture<Product1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Product1],
    }).compileComponents();

    fixture = TestBed.createComponent(Product1);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
