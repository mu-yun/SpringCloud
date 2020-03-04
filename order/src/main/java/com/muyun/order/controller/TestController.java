package com.muyun.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${test-config}")
    private String testConfig;

    @GetMapping("test-config")
    public String test() {
        return testConfig;
    }

}
