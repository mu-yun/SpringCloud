package com.muyun.order.service;

import com.muyun.order.client.ProductClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    //https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica#configuration
    //https://github.com/Netflix/Hystrix/wiki/Configuration#CommandCircuitBreaker
    @HystrixCommand(fallbackMethod = "getProductNameDefault", commandProperties = {
            //This property determines whether a circuit breaker will be used to track health and to short-circuit requests if it trips.
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            //This property sets the minimum number of requests in a rolling window that will trip the circuit.
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"),
            //This property sets the minimum number of requests in a rolling window that will trip the circuit.
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),
            //This property sets the error percentage at or above which the circuit should trip open and start short-circuiting requests to fallback logic.
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
            //This property sets the duration of the statistical rolling window, in milliseconds.
            // This is how long Hystrix keeps metrics for the circuit breaker to use and for publishing.
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000"),
            //This property sets the number of buckets the rolling statistical window is divided into.
            @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "10")
    })
    public String getProductName(Long id) {

        return productClient.getName(id);
    }

    public String getProductNameDefault(Long id) {
        return "hystrix-" + id;
    }
}
