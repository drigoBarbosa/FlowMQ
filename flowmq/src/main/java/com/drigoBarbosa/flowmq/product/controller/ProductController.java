package com.drigoBarbosa.flowmq.product.controller;

import com.drigoBarbosa.flowmq.product.entity.Product;
import com.drigoBarbosa.flowmq.product.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

}
