package com.ofa.consolidateMS.service.order;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "orders-service",fallback = OrdersFallback.class)
public interface OrderServiceFeignClient extends OrderService {

}
