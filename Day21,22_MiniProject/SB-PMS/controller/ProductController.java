package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.pms.dto.ProductDTO;
import com.coforge.pms.dto.SupplierDTO;
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
    
    @GetMapping("/products/suppliers/{sid}")
	public ResponseEntity<?> findSupplierById(@PathVariable int sid) {
		ResponseEntity<?> responseEntity = null;
		SupplierDTO supplier = service.findSupplierById(sid);
		if (supplier != null)
			responseEntity = new ResponseEntity<>(supplier, HttpStatus.OK);
		else
			responseEntity = new ResponseEntity<>("FAILED : Supplier Not Found", HttpStatus.BAD_REQUEST);
		return responseEntity;
	}

	@GetMapping("/products/suppliers")
	public ResponseEntity<List<SupplierDTO>> findAllDepartments() {
		ResponseEntity<List<SupplierDTO>> responseEntity = null;
		List<SupplierDTO> departments = service.findAllSuppliers();

		responseEntity = new ResponseEntity<>(departments, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/products/{pid}/suppliers")
	public ResponseEntity<ProductDTO> findEmployeeDetails(@PathVariable("pid") int pid) {
		ResponseEntity<ProductDTO> responseEntity = null;

		ProductDTO supplierDto = new ProductDTO();

		Product product = service.findByPid(pid).get();
		SupplierDTO supplier = service.findSupplierById(product.getSupplierId());
		supplierDto.setProduct(product);
		supplierDto.setSupplier(supplier);

		responseEntity = new ResponseEntity<>(supplierDto, HttpStatus.OK);

		return responseEntity;
	}

}