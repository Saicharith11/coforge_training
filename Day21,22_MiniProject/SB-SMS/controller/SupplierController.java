package com.coforge.sms.controller;

import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.coforge.sms.model.Supplier;
import com.coforge.sms.service.SupplierService;

@RestController
@RequestMapping("/api/v1/sms")
public class SupplierController {

    private Environment environment;
    private SupplierService service;

    @Autowired
    public SupplierController(
            Environment environment,
            SupplierService service) {

        this.environment = environment;
        this.service = service;
    }

    @PostMapping("/suppliers")
    public ResponseEntity<String> saveSuppliers(
            @Valid
            @NotNull
            @RequestBody Supplier supplier) {

        service.saveSuppliers(supplier);

        return new ResponseEntity<>(
                environment.getProperty(
                        "sms.save.success"),
                HttpStatus.CREATED);
    }

    @PutMapping("/suppliers/{supplierId}")
    public ResponseEntity<String> updateSuppliers(
            @PathVariable Long supplierId,
            @RequestBody Supplier supplier) {

        service.updateSuppliers(
                supplierId,
                supplier);

        return new ResponseEntity<>(
                environment.getProperty(
                        "sms.update.success"),
                HttpStatus.OK);
    }

    @DeleteMapping("/suppliers/{supplierId}")
    public ResponseEntity<String> deleteBySid(
            @PathVariable Long supplierId) {

        service.deleteBySid(supplierId);

        return new ResponseEntity<>(
                environment.getProperty(
                        "sms.delete.success"),
                HttpStatus.OK);
    }

    @GetMapping("/suppliers/{supplierId}")
    public ResponseEntity<Supplier> findSuppById(
            @PathVariable Long supplierId) {

        Optional<Supplier> supplier =
                service.findSuppById(supplierId);

        return new ResponseEntity<>(
                supplier.get(),
                HttpStatus.OK);
    }

    @GetMapping("/suppliers")
    public ResponseEntity<List<Supplier>>
    findAllSuppliers() {

        return new ResponseEntity<>(
                service.findAllSuppliers(),
                HttpStatus.OK);
    }
}