package com.ofa.consolidateMS.service.customer;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "customers-service",fallback = CustomersFallback.class)
public interface CustomerServiceFeignClient extends CustomerService {

}
