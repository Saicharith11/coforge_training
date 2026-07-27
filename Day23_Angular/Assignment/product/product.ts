import { Component } from '@angular/core';

@Component({
  selector: 'app-product',
  standalone: false,
  templateUrl: './product.html',
  styleUrl: './product.css',
})
export class Product {
  ImagePath : string;
  ProductName : string;
  ProductPrice : number;
  ProductAvailability : boolean;
  constructor() {
    this.ImagePath = "polo_gti_red.jpg";
    this.ProductName = "Polo GTI";
    this.ProductPrice = 2000000;
    this.ProductAvailability = true;
  }


}
