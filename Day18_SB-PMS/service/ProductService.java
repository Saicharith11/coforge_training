package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.model.Product;

public interface ProductService {

    public boolean saveProduct(Product product);

    public boolean updateProduct(int productId, Product product);

    public boolean deleteProduct(int productId);

    public Optional<Product> findByPid(int productId);

    public Iterable<Product> findAllProducts();

    public List<Product> findByProductName(String productName);

    public boolean deleteByProductName(String productName);

    public List<Product> findByProductQuantity(int quantity);

    public List<Product> findByPriceBetween(double min,
                                            double max);

    public List<Integer> getProductIds();

    public String getInfo();
}