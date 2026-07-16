package com.coforge.pms.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {

    Map<Integer, Product> products = new HashMap<>();

    public String addProduct(Product p) {

        if (products.containsKey(p.getProductId())) {
            return "Product ID already exists!";
        }

        if (p.getProductName().isEmpty() ||
                p.getProductPrice() <= 0 ||
                p.getQuantity() <= 0) {

            return "Invalid Product Details!";
        }

        products.put(p.getProductId(), p);

        return "Product Added Successfully!";
    }

    public Collection<Product> viewProducts() {

        return products.values();
    }

    public Product searchProduct(int id) {

        return products.get(id);
    }

    public String updateProduct(Product p) {

        if (products.containsKey(p.getProductId())) {

            products.put(p.getProductId(), p);

            return "Product Updated Successfully!";
        }

        return "Product Not Found!";
    }

    public String deleteProduct(int id) {

        if (products.containsKey(id)) {

            products.remove(id);

            return "Product Deleted Successfully!";
        }

        return "Product Not Found!";
    }
}