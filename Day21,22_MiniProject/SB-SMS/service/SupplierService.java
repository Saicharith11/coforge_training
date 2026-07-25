package com.coforge.sms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.sms.model.Supplier;

public interface SupplierService {

    boolean saveSuppliers(Supplier supplier);

    boolean updateSuppliers(
            Long supplierId,
            Supplier supplier);

    Optional<Supplier> findSuppById(
            Long supplierId);

    boolean deleteBySid(
            Long supplierId);

    List<Supplier> findAllSuppliers();
}