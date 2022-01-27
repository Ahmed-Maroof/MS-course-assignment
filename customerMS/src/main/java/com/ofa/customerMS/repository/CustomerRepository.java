package com.ofa.customerMS.repository;

import com.ofa.customerMS.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
