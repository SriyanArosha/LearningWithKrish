package com.arosha.marketcloud.profileservice.repository;

import org.arosha.marketcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
