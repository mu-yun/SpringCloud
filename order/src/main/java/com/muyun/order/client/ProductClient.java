package com.muyun.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//fallback使用@Component的类时，不能使用@RequestMapping
@FeignClient(name = "product", fallback = ProductClient.ProductClientFallback.class)
public interface ProductClient {
    String REQUEST_MAPPING = "product/";

    @GetMapping(REQUEST_MAPPING + "name/{id}")
    String getName(@PathVariable Long id);

    @GetMapping(REQUEST_MAPPING + "count/{id}")
    Long getCount(@PathVariable Long id);

    @GetMapping(REQUEST_MAPPING + "price/{id}")
    Long getPrice(@PathVariable Long id);

    @Component
    class ProductClientFallback implements ProductClient {
        @Override
        public String getName(Long id) {
            return "fallback-" + id;
        }

        @Override
        public Long getCount(Long id) {
            return null;
        }

        @Override
        public Long getPrice(Long id) {
            return null;
        }
    }

}


