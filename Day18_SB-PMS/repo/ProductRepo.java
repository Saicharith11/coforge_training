package com.coforge.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.pms.model.Product;

@Repository
public interface ProductRepo
        extends CrudRepository<Product, Integer> {

    List<Product> findByProductName(String productName);

    long deleteByProductName(String productName);

    List<Product> findByProductQuantity(int quantity);

    List<Product> findByProductPriceBetween(
            double min,
            double max);

    @Query("select productId from Product")
    List<Integer> getProductIds();

    @Query("""
            select count(*),
            sum(productPrice),
            min(productPrice),
            max(productPrice)
            from Product
            """)
    String getInfo();
}