package com.muyun.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product")
public interface ProductClient {

    @GetMapping("name/{id}")
    String getName(@PathVariable Long id);

    @GetMapping("count/{id}")
    Long getCount(@PathVariable Long id);
}
