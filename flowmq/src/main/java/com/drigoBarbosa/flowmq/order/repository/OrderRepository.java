package com.drigoBarbosa.flowmq.order.repository;

import com.drigoBarbosa.flowmq.order.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    Order save(Order order);
}
