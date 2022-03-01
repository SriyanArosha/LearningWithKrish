package com.arosha.marketcloud.productbuyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.arosha.marketcloud.model.productbuy")
public class ProductbuyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductbuyServiceApplication.class, args);
    }

}
