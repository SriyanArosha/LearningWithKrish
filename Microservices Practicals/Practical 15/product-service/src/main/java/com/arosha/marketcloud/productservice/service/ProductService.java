package com.arosha.marketcloud.productservice.service;

import com.arosha.marketcloud.model.product.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    Product findById(int id);

    List<Product> findAll();
}
