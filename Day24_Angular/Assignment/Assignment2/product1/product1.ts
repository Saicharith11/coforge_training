import { Component } from '@angular/core';

interface Product {
  productId: number;
  productName: string;
  category: string;
  price: number;
}

@Component({
  selector: 'app-product1',
  standalone: false,
  templateUrl: './product1.html',
  styleUrl: './product1.css',
})
export class Product1 {
    products: Product[];

  constructor() {

    this.products = [

      { productId: 101, productName: 'Laptop',      category: 'Electronics', price: 65000 },
      { productId: 102, productName: 'Mobile',      category: 'Electronics', price: 25000 },
      { productId: 103, productName: 'Keyboard',    category: 'Accessories', price: 1500 },
      { productId: 104, productName: 'Mouse',       category: 'Accessories', price: 800 },
      { productId: 105, productName: 'Headphones',  category: 'Electronics', price: 3000 },
      { productId: 106, productName: 'Chair',       category: 'Furniture',   price: 5500 },
      { productId: 107, productName: 'Table',       category: 'Furniture',   price: 7000 },
      { productId: 108, productName: 'Monitor',     category: 'Electronics', price: 12000 },
      { productId: 109, productName: 'Printer',     category: 'Electronics', price: 9500 },
      { productId: 110, productName: 'Pen Drive',   category: 'Accessories', price: 700 }

    ];

  }




}
