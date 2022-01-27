package com.ofa.customerMS.services;

import com.ofa.customerMS.model.Customer;
import com.ofa.customerMS.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer saveOrUpdate(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(int id) {
        Optional customer = customerRepository.findById(id);
        if (!customer.isEmpty()) {
            return (Customer) customer.get();
        } else {
            return null;

        }
    }
}
