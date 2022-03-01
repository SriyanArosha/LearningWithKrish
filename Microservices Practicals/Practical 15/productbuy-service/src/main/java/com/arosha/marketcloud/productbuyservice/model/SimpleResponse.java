package com.arosha.marketcloud.productbuyservice.model;

import com.arosha.marketcloud.model.productbuy.ProductBuy;

public class SimpleResponse implements Response{
    ProductBuy productBuy;

    public SimpleResponse(ProductBuy productBuy) {
        this.productBuy = productBuy;
    }

    public ProductBuy getProductBuy() {
        return productBuy;
    }

    public void setProductBuy(ProductBuy productBuy) {
        this.productBuy = productBuy;
    }
}
