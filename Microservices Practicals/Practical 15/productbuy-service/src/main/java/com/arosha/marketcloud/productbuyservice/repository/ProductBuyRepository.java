package com.arosha.marketcloud.productbuyservice.repository;

import com.arosha.marketcloud.model.productbuy.ProductBuy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBuyRepository extends JpaRepository<ProductBuy,Integer> {
}
