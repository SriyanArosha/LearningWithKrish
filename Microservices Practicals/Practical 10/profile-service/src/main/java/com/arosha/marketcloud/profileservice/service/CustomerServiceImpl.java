package com.arosha.marketcloud.profileservice.service;

import com.arosha.marketcloud.profileservice.repository.CustomerRepository;
import org.arosha.marketcloud.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
