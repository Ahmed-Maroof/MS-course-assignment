package com.ofa.customerMS.services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "orders-service",fallback = OrdersFallback.class)
public interface OrderServiceFeignClient extends OrderService {

}
