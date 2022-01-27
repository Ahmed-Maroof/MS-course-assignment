package com.ofa.consolidateMS.service;

import com.ofa.consolidateMS.entity.Customer;
import com.ofa.consolidateMS.entity.DashbordEntryDTO;
import com.ofa.consolidateMS.entity.Feedback;
import com.ofa.consolidateMS.entity.Order;
import com.ofa.consolidateMS.service.customer.CustomerService;
import com.ofa.consolidateMS.service.customer.CustomerServiceFeignClient;
import com.ofa.consolidateMS.service.feedback.FeedbackService;
import com.ofa.consolidateMS.service.feedback.FeedbackServiceFeignClient;
import com.ofa.consolidateMS.service.order.OrderService;
import com.ofa.consolidateMS.service.order.OrderServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    OrderServiceFeignClient  orderServiceFeignClient;

    @Autowired
    CustomerServiceFeignClient customerServiceFeignClient;

    @Autowired
    FeedbackServiceFeignClient   feedbackServiceFeignClient;

    public DashbordEntryDTO getCustomerDashboardEntry(int customerId) {

        // feign client to orderMS
        List<Order> orderList = orderServiceFeignClient.getOrders(customerId);

        //feign client to CustomerMS
        Customer customer = customerServiceFeignClient.getCustomer(customerId);

        //feign client to FeedbackMS
        List<Feedback> feedbackList = feedbackServiceFeignClient.getFeedback(customerId);


        DashbordEntryDTO dashbordEntryDTO = new DashbordEntryDTO();
        dashbordEntryDTO.setCustomerId(customerId);
        dashbordEntryDTO.setCustomerName(customer.getName());
        dashbordEntryDTO.setLocation(customer.getLocation());
        dashbordEntryDTO.setFeedbackCount(feedbackList.size());
        dashbordEntryDTO.setOrdersCount(orderList.size());


        return dashbordEntryDTO;
    }

}
