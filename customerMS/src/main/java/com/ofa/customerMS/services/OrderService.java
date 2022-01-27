package com.ofa.customerMS.services;

import com.ofa.customerMS.model.Order;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("input-format")
public interface OrderService {
    @RequestMapping(value = "/orders/orders/1", method = RequestMethod.GET, produces = "application/json")
    List<Order> getOrders(@RequestParam("id") int id);

}
