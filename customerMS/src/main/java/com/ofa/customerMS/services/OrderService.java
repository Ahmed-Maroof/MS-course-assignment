package com.ofa.customerMS.services;

import com.ofa.customerMS.model.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface OrderService {
    @RequestMapping(value = "/orders/", method = RequestMethod.GET, produces = "application/json")
    List<Order> getOrders();

}
