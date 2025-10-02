package com.drigoBarbosa.flowmq.product.repository;

import com.drigoBarbosa.flowmq.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    Product save(Product product);

}
