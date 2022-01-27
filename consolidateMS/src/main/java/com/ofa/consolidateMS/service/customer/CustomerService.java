package com.ofa.consolidateMS.service.customer;

import com.ofa.consolidateMS.entity.Customer;
import com.ofa.consolidateMS.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("input-format")
public interface CustomerService {
    @RequestMapping(value = "/customers/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    Customer getCustomer(@RequestParam("id") int id);

}
