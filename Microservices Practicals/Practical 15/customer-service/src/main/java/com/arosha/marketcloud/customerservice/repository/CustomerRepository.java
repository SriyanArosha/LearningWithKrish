package com.arosha.marketcloud.customerservice.repository;

import com.arosha.marketcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
