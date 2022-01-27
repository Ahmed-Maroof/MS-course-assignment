package com.ofa.consolidateMS.service.order;

import com.ofa.consolidateMS.entity.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrdersFallback implements OrderServiceFeignClient {

    @Override
    public List<Order> getOrders(int id) {
        return new ArrayList<Order>();
    }

}
