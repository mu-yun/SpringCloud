# Config
## Server
### Step
1. add the configuration of `EurekaClient`

2. add `spring-cloud-config-server` dependency

3. add `@EnableConfigServer` annotation

4. configure properties

   ```yml
   spring:
   	cloud:
   		config:
   			server:
   				git:
   					uri: https://github.com/***/spring-cloud-config.git
   					search-paths: config/
   ```

#### Securing The Eureka Server

1. add `spring-cloud-starter-security` dependency
2. set the value of `spring.security.user` property (e.g. `name` and `password`)                                                            


#### Spring Cloud Bus(Kafka)

1. add `spring-cloud-starter-bus-kafka` dependency

2. exposure `bus-refresh` endpoint

   ```yml
   management:
     endpoints:
       web:
         exposure:
           include: bus-refresh
   ```



## Client

### Step

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

   

#### Spring Cloud Bus(Kafka)

1. add `spring-cloud-starter-bus-kafka` dependency

   

