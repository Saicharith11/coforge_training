package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo repo;
    private Environment environment;

    @Autowired
    public ProductServiceImpl(ProductRepo repo,
                              Environment environment) {
        super();
        this.repo = repo;
        this.environment = environment;
    }

    @Override
    public boolean saveProduct(Product product) {

        repo.save(product);
        return true;
    }

    @Override
    public boolean updateProduct(int productId,
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
    public boolean deleteProduct(int productId) {

        if (!repo.existsById(productId)) {

            throw new ProductNotFoundException(
                    environment.getProperty(
                            "pms.invalid.product-notfound"));
        }

        repo.deleteById(productId);

        return true;
    }

    @Override
    public Optional<Product> findByPid(int productId) {

        return repo.findById(productId);
    }

    @Override
    public Iterable<Product> findAllProducts() {

        return repo.findAll();
    }

    @Override
    public List<Product> findByProductName(
            String productName) {

        return repo.findByProductName(productName);
    }

    @Override
    public boolean deleteByProductName(
            String productName) {

        repo.deleteByProductName(productName);

        return true;
    }

    @Override
    public List<Product> findByProductQuantity(
            int quantity) {

        return repo.findByProductQuantity(quantity);
    }

    @Override
    public List<Product> findByPriceBetween(
            double min,
            double max) {

        return repo.findByProductPriceBetween(
                min,
                max);
    }

    @Override
    public List<Integer> getProductIds() {

        return repo.getProductIds();
    }

    @Override
    public String getInfo() {

        return repo.getInfo();
    }
}