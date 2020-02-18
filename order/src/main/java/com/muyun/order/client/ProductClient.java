package com.muyun.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("product")
@RequestMapping("product")
public interface ProductClient {

    @GetMapping("name/{id}")
    String getName(@PathVariable Long id);

    @GetMapping("count/{id}")
    Long getCount(@PathVariable Long id);

    @GetMapping("price/{id}")
    Long getPrice(@PathVariable Long id);

}
