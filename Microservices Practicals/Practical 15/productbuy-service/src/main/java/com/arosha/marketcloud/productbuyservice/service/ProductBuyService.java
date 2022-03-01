package com.arosha.marketcloud.productbuyservice.service;

import com.arosha.marketcloud.model.productbuy.ProductBuy;
import com.arosha.marketcloud.productbuyservice.model.DetailResponse;

import java.util.List;

public interface ProductBuyService {
    ProductBuy save(ProductBuy productBuy);

    ProductBuy findById(int id);

    List<ProductBuy> findAll();

    DetailResponse findDetailResponse(int id);
}
