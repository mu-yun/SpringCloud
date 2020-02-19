package com.muyun.order.service;

import com.muyun.order.client.ProductClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    @HystrixCommand(fallbackMethod = "getProductNameDefault")
    public String getProductName(Long id) {
        return productClient.getName(id);
    }

    public String getProductNameDefault(Long id) {
        return "hystrix-" + id;
    }
}
