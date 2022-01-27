package com.ofa.customerMS.controller;

import com.ofa.customerMS.model.Customer;
import com.ofa.customerMS.model.Order;
import com.ofa.customerMS.services.CustomerService;
import com.ofa.customerMS.services.OrderServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    private OrderServiceFeignClient orderServiceFeignClient;

    @GetMapping("/")
    public String health() {
        return "I am Ok";
    }

    @GetMapping("/{id}/orders/")
    public ResponseEntity<List<Order>> getCustomerOrders(@PathVariable("id") int id) {
        List<Order> orders = orderServiceFeignClient.getOrders();
        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }

    @PostMapping("/customer")
    private Customer saveStudent(@RequestBody Customer customer) {
        return customerService.saveOrUpdate(customer);
    }
}
