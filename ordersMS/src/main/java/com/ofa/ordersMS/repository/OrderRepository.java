package com.ofa.ordersMS.repository;

import com.ofa.ordersMS.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    public List<Order> findALLByCustomerId(int customerId);
}
