# Gateway

### Step

1. add the configuration of `EurekaClient`

2. add `spring-cloud-starter-gateway` dependency

3. configure properties

   ```yml
   spring:
   	cloud:
   		gateway:
       	discovery:
         	locator:
         		#Flag that enables DiscoveryClient gateway integration.
           	enabled: true
           	#Option to lower case serviceId in predicates and filters, defaults to false. Useful with eureka when it automatically uppercases serviceId. so MYSERIVCE, would match /myservice/**
             lowerCaseServiceId: true
   ```

   

    

   