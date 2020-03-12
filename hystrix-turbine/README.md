# Hystrix Dashboard

### Step

1. add `spring-cloud-starter-netflix-hystrix-dashboard` dependency

2. add `@EnableHystrixDashboard` annotation

3. exposure the `hystrix.stream` endpoint of services

   ```yml
   #enable connect to hystrix dashboard
   management:
     endpoints:
       web:
         exposure:
           include: hystrix.stream
   ```

# Turbine
### Step
1. add `spring-cloud-starter-netflix-turbine` dependency

2. add the configuration of `EurekaClient` (don't need to add dependency)

3. add `@EnableTurbine` annotation

4. configure properties

   ```yml
   turbine:
     #application name
     app-config: order,product
     #eureka application name
     aggregator:
       cluster-config: ORDER,PRODUCT
   ```

