package com.arosha.marketcloud.productservice.repository;

import com.arosha.marketcloud.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
