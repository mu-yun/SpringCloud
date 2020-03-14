# Spring Cloud
Spring Cloud Demo

# Environment

+ zookeeper
+ kafka

# Step

### Eureka client

1. add `spring-cloud-starter-netflix-eureka-client` dependency
2. add `@EnableDiscoveryClient` annotation
3. set the value of `eureka.client.service-url.defaultZone` property

### Feign

1. add `spring-cloud-starter-openfeign` dependency

2. add `@EnableFeignClients` annotation

   > [FeignClientExample](https://github.com/mu-yun/spring-cloud/blob/master/order/src/main/java/com/muyun/order/client/ProductClient.java)

### Hystrix

1. add `spring-cloud-starter-netflix-hystrix` dependency

2. add `@EnableCircuitBreaker` annotation

3. if need to connect to `hystrix-dashboard`  ,exposure the `hystrix.stream` endpoint

   ```yml
   #enable connect to hystrix dashboard
   management: 
     endpoints:
       web:
         exposure:
           include: hystrix.stream
   ```

   > [HystrixCommandExample](https://github.com/mu-yun/spring-cloud/blob/master/order/src/main/java/com/muyun/order/service/OrderService.java)

### Config Client

1. add the configuration of `EurekaClient`

2. add `spring-cloud-starter-config` dependency

3. configure properties

   ```yml
   spring:
     cloud:
       config:
         username: root
         password: root
         discovery:
           enabled: true
           service-id: config-server
   ```

   ###### Spring Cloud Bus(Kafka)

   1. add `spring-cloud-starter-bus-kafka` dependency

### Zipkin

1. add `spring-cloud-starter-zipkin` denpendency
2. set the value of `spring.zipkin.base-url and spring.zipkin.sleuth.sampler.probability`