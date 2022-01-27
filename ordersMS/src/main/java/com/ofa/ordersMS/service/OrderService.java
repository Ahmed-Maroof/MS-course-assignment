package com.ofa.ordersMS.service;

import com.ofa.ordersMS.model.Order;
import com.ofa.ordersMS.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order saveOrUpdate(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrdersByCustomerId(int customerId) {
        return orderRepository.findALLByCustomerId(customerId);
    }
}
