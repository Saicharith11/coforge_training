package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.model.Product;

public interface ProductService {

    public boolean saveProduct(Product product);

    public boolean updateProduct(long productId, Product product);

    public boolean deleteProduct(long productId);

    public Optional<Product> findByPid(long productId);

    public Iterable<Product> findAllProducts();

	public List<SupplierDTO> findAllSuppliers();

	public SupplierDTO findSupplierById(long supplierId);
}