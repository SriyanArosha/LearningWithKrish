package com.arosha.marketcloud.productbuyservice.service;

import com.arosha.marketcloud.model.customer.Customer;
import com.arosha.marketcloud.model.product.Product;
import com.arosha.marketcloud.model.productbuy.ProductBuy;
import com.arosha.marketcloud.productbuyservice.model.DetailResponse;
import com.arosha.marketcloud.productbuyservice.repository.ProductBuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ProductBuyServiceImpl implements ProductBuyService{

    @Autowired
    ProductBuyRepository productBuyRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public ProductBuy save(ProductBuy productBuy) {
        return productBuyRepository.save(productBuy);
    }

    @Override
    public ProductBuy findById(int id) {
        Optional<ProductBuy> productBuy = productBuyRepository.findById(id);

        if (productBuy.isPresent())
            return productBuy.get();
        else
            return new ProductBuy();
    }

    @Override
    public List<ProductBuy> findAll() {
        return productBuyRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) {
        ProductBuy productBuy=findById(id);
        Customer customer=getCustomer(productBuy.getCustomerId());
        Product product= getProduct(productBuy.getProductId());

        return new DetailResponse(productBuy,customer,product);
    }

    private Customer getCustomer(int customerId){

        Customer customer=restTemplate.getForObject("http://localhost:8080/services/customers/"+customerId,Customer.class);
        return customer;

    }

    private Product getProduct(int productId){

        return restTemplate.getForObject("http://localhost:9191/services/products/"+productId,Product.class);


    }
}
