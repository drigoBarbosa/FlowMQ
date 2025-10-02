package com.drigoBarbosa.flowmq.order.service;

import com.drigoBarbosa.flowmq.order.model.entities.Order;
import com.drigoBarbosa.flowmq.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
