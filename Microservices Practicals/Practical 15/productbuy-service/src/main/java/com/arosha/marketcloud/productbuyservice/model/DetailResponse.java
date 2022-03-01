package com.arosha.marketcloud.productbuyservice.model;

import com.arosha.marketcloud.model.customer.Customer;
import com.arosha.marketcloud.model.product.Product;
import com.arosha.marketcloud.model.productbuy.ProductBuy;

public class DetailResponse implements Response {
    ProductBuy productBuy;
    Customer customer;
    Product product;

    public DetailResponse(ProductBuy productBuy, Customer customer, Product product) {
        this.productBuy = productBuy;
        this.customer = customer;
        this.product = product;
    }

    public ProductBuy getProductBuy() {
        return productBuy;
    }

    public void setProductBuy(ProductBuy productBuy) {
        this.productBuy = productBuy;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
