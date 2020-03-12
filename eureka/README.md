# Eureka

## Server

### Step

1. add `spring-cloud-starter-netflix-eureka-server` dependency
2. add `@EnableEurekaServer` annotation
3. set the value of `eureka.client.service-url.defaultZone` property

##### Note:

启动eureka集群时，需要正确配置域名，defaultZone也要使用域名（如果时本地启动需要修改host文件）,否则eureka界面General Info下的available-replicas显示不正确

#### Securing The Eureka Server

1. add `spring-cloud-starter-security` dependency
2. add `WebSecurityConfig` class
3. set the value of `spring.security.user` property (e.g. `name` and `password`)                                                            

## Client

### Step

1. add `spring-cloud-starter-netflix-eureka-client` dependency
2. add `@EnableDiscoveryClient` annotation
3. set the value of `eureka.client.service-url.defaultZone` property







