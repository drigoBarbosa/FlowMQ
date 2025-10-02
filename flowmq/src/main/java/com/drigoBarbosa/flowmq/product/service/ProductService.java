package com.drigoBarbosa.flowmq.product.service;

import com.drigoBarbosa.flowmq.product.entity.Product;
import com.drigoBarbosa.flowmq.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;

    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
       return productRepository.save(product);
    }
}
