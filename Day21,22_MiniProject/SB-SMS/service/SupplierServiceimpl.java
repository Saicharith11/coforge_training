package com.coforge.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.sms.exception.SupplierNotFoundException;
import com.coforge.sms.model.Supplier;
import com.coforge.sms.repo.SupplierRepo;

@Service
public class SupplierServiceimpl
        implements SupplierService {

    private SupplierRepo repo;
    private Environment environment;

    @Autowired
    public SupplierServiceimpl(
            SupplierRepo repo,
            Environment environment) {

        this.repo = repo;
        this.environment = environment;
    }

    @Override
    public boolean saveSuppliers(
            Supplier supplier) {

        repo.save(supplier);
        return true;
    }

    @Override
    public boolean updateSuppliers(
            Long supplierId,
            Supplier supplier) {

        if (!repo.existsById(supplierId)) {

            throw new SupplierNotFoundException(
                    environment.getProperty(
                            "sms.invalid.supplier-notfound"));
        }

        supplier.setSupplierId(supplierId);

        repo.save(supplier);

        return true;
    }

    @Override
    public Optional<Supplier> findSuppById(
            Long supplierId) {

        Optional<Supplier> supplier =
                repo.findById(supplierId);

        if (supplier.isEmpty()) {

            throw new SupplierNotFoundException(
                    environment.getProperty(
                            "sms.get.failed"));
        }

        return supplier;
    }

    @Override
    public boolean deleteBySid(
            Long supplierId) {

        if (!repo.existsById(supplierId)) {

            throw new SupplierNotFoundException(
                    environment.getProperty(
                            "sms.invalid.supplier-notfound"));
        }

        repo.deleteById(supplierId);

        return true;
    }

    @Override
    public List<Supplier> findAllSuppliers() {

        return (List<Supplier>) repo.findAll();
    }
}