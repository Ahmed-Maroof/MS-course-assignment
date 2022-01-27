package com.ofa.customerMS.services;

import com.ofa.customerMS.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrdersFallback implements OrderServiceFeignClient {

    @Override
    public List<Order> getOrders() {
        return new ArrayList<Order>();
    }

}
