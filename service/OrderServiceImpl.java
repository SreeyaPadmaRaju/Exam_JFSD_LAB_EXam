package com.klef.jfsd.service;

import com.klef.jfsd.model.Order;
import com.klef.jfsd.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order addOrder(Order order) {
        if (order.getOrderId() == null) {
            throw new IllegalArgumentException("Order ID must not be null.");
        }
        return orderRepository.save(order);
    }
}
