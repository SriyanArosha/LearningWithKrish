package com.arosha.marketcloud.customerservice.service;

import com.arosha.marketcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
