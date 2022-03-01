package com.arosha.marketcloud.productbuyservice.controller;

import com.arosha.marketcloud.model.productbuy.ProductBuy;
import com.arosha.marketcloud.productbuyservice.model.Response;
import com.arosha.marketcloud.productbuyservice.model.SimpleResponse;
import com.arosha.marketcloud.productbuyservice.service.ProductBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/productbuys")
public class ProductBuyController {

    @Autowired
    ProductBuyService productBuyService;

    @PostMapping
    public ProductBuy save(@RequestBody ProductBuy productBuy) {
        return productBuyService.save(productBuy);
    }

    @GetMapping(value = "/{id}")
    public Response getProductBuy(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return  new SimpleResponse(productBuyService.findById(id));
        }else{
            return productBuyService.findDetailResponse(id);
        }
    }

    @GetMapping
    public List<ProductBuy> getAllProductBuys() {
        return productBuyService.findAll();
    }
}
