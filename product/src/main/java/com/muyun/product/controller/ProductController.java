package com.muyun.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Value("${spring.profiles}")
    private String profile;

    @GetMapping("name/{id}")
    public String getName(@PathVariable Long id) {
        return profile + "-name-" + id;
    }

    @GetMapping("count/{id}")
    public Long getCount(@PathVariable Long id) {
        return id * 10;
    }

    @GetMapping("price/{id}")
    public Long getPrice(@PathVariable Long id) {
        return id * 100;
    }
}
