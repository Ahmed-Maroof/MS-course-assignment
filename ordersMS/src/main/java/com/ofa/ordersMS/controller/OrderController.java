package com.ofa.ordersMS.controller;

import com.ofa.ordersMS.model.Order;
import com.ofa.ordersMS.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/")
    public String health() {
        return "OrderMS is Ok";
    }


    @GetMapping("/orders/{id}")
    public ResponseEntity<List<Order>> getOrders(@PathVariable ("id") String customerId) {
        return new ResponseEntity<List<Order>>(orderService.getAllOrdersByCustomerId(Integer.valueOf(customerId).intValue()), HttpStatus.OK);
    }


    @PostMapping("/order")
    private Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrUpdate(order);
    }
}
