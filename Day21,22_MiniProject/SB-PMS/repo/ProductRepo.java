package com.coforge.pms.repo;

import org.springframework.data.repository.CrudRepository;
import com.coforge.pms.model.Product;

public interface ProductRepo
        extends CrudRepository<Product, Long> {

}