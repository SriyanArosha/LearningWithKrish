package com.arosha.marketcloud.productservice.service;

import com.arosha.marketcloud.model.product.Product;
import com.arosha.marketcloud.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent())
            return product.get();
        else
            return new Product();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
