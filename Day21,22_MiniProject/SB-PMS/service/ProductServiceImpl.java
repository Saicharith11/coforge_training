package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;
import com.coforge.pms.service.client.SupplierClient;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo repo;
    private Environment environment;
    private SupplierClient client;
    @Autowired
    public ProductServiceImpl(ProductRepo repo,
                              Environment environment, SupplierClient client) {
        super();
        this.repo = repo;
        this.environment = environment;
        this.client = client;
    }

    @Override
    public boolean saveProduct(Product product) {

        repo.save(product);
        return true;
    }

    @Override
    public boolean updateProduct(long productId,
                                 Product product) {

        if (!repo.existsById(productId)) {

            throw new ProductNotFoundException(
                    environment.getProperty(
                            "pms.invalid.product-notfound"));
        }

        product.setProductId(productId);

        repo.save(product);

        return true;
    }

    @Override
    public boolean deleteProduct(long productId) {

        if (!repo.existsById(productId)) {

            throw new ProductNotFoundException(
                    environment.getProperty(
                            "pms.invalid.product-notfound"));
        }

        repo.deleteById(productId);

        return true;
    }

    @Override
    public Optional<Product> findByPid(long productId) {

        return repo.findById(productId);
    }

    @Override
    public Iterable<Product> findAllProducts() {

        return repo.findAll();
    }

	@Override
	public List<SupplierDTO> findAllSuppliers() {
		// TODO Auto-generated method stub
		List<SupplierDTO> suppliers = client.findAllSuppliers();
		return suppliers;
	}

	@Override
	public SupplierDTO findSupplierById(long supplierId) {
		SupplierDTO suppliers = client.findSupplierById(supplierId);
		return suppliers;
	}



}