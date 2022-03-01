package com.arosha.marketcloud.productservice.controller;

import com.arosha.marketcloud.model.product.Product;
import com.arosha.marketcloud.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return productService.findById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
}
