package com.ofa.consolidateMS.service.customer;

import com.ofa.consolidateMS.entity.Customer;
import com.ofa.consolidateMS.entity.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomersFallback implements CustomerServiceFeignClient {

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

}
