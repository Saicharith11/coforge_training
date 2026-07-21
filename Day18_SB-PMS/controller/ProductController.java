package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {

    private ProductService service;
    private Environment environment;

    @Autowired
    public ProductController(ProductService service,
                             Environment environment) {
        super();
        this.service = service;
        this.environment = environment;
    }

    // SAVE

    @PostMapping("/products")
    public ResponseEntity<String> saveProduct(
            @Valid @NotNull
            @RequestBody(required = false)
            Product product) {

        ResponseEntity<String> responseEntity = null;

        boolean status = service.saveProduct(product);

        if (status) {
            responseEntity = new ResponseEntity<>(
                    environment.getProperty(
                            "pms.save.success"),
                    HttpStatus.CREATED);
        }

        return responseEntity;
    }

    // UPDATE

    @PutMapping("/products/{productId}")
    public ResponseEntity<String> updateProduct(
            @PathVariable int productId,
            @Valid @NotNull
            @RequestBody Product product) {

        ResponseEntity<String> responseEntity = null;

        boolean status =
                service.updateProduct(
                        productId,
                        product);

        if (status) {
            responseEntity = new ResponseEntity<>(
                    environment.getProperty(
                            "pms.update.success"),
                    HttpStatus.CREATED);
        }

        return responseEntity;
    }

    // DELETE BY ID

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<String> deleteProduct(
            @PathVariable int productId) {

        ResponseEntity<String> responseEntity = null;

        boolean status =
                service.deleteProduct(productId);

        if (status) {
            responseEntity = new ResponseEntity<>(
                    environment.getProperty(
                            "pms.delete.success"),
                    HttpStatus.CREATED);
        }

        return responseEntity;
    }

    // FIND BY ID

    @GetMapping("/products/{productId}")
    public ResponseEntity<?> findByPid(
            @PathVariable int productId) {

        Optional<Product> product =
                service.findByPid(productId);

        if (product.isPresent()) {
            return ResponseEntity.ok(
                    product.get());
        }

        return new ResponseEntity<>(
                "Product Not Found",
                HttpStatus.OK);
    }

    // FIND ALL

    @GetMapping("/products")
    public ResponseEntity<?> findAllProducts() {

        Iterable<Product> products =
                service.findAllProducts();

        return new ResponseEntity<>(
                products,
                HttpStatus.OK);
    }

    // FIND BY NAME

    @GetMapping("/products/name/{productName}")
    public ResponseEntity<?> findByProductName(
            @PathVariable String productName) {

        List<Product> products =
                service.findByProductName(
                        productName);

        return new ResponseEntity<>(
                products,
                HttpStatus.OK);
    }

    // DELETE BY NAME

    @DeleteMapping(
            "/products/name/{productName}")

    public ResponseEntity<String>
    deleteByProductName(
            @PathVariable String productName) {

        service.deleteByProductName(
                productName);

        return new ResponseEntity<>(
                environment.getProperty(
                        "pms.delete.success"),
                HttpStatus.OK);
    }

    // SEARCH BY QUANTITY

    @GetMapping(
            "/products/quantity/{quantity}")

    public ResponseEntity<?> findByQuantity(
            @PathVariable int quantity) {

        List<Product> products =
                service.findByProductQuantity(
                        quantity);

        return new ResponseEntity<>(
                products,
                HttpStatus.OK);
    }

    // PRICE RANGE

    @GetMapping(
      "/products/price/{min}/{max}")

    public ResponseEntity<?> findByPriceRange(
            @PathVariable double min,
            @PathVariable double max) {

        List<Product> products =
                service.findByPriceBetween(
                        min, max);

        return new ResponseEntity<>(
                products,
                HttpStatus.OK);
    }

    // PRODUCT IDS

    @GetMapping("/products/ids")
    public ResponseEntity<?> getProductIds() {

        List<Integer> ids =
                service.getProductIds();

        return new ResponseEntity<>(
                ids,
                HttpStatus.OK);
    }

    // COUNT + SUM + MIN + MAX

    @GetMapping("/products/info")
    public ResponseEntity<?> getInfo() {

        String info =
                service.getInfo();

        return new ResponseEntity<>(
                info,
                HttpStatus.OK);
    }
}