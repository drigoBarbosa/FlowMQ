package com.drigoBarbosa.flowmq.order.controller;

import com.drigoBarbosa.flowmq.order.model.entities.Order;
import com.drigoBarbosa.flowmq.order.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

}
