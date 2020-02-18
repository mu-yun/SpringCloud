package com.muyun.order.controller;

import com.muyun.order.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("product/{id}")
    public String getProduct(@PathVariable Long id) {
        return productClient.getName(id);
    }
}
