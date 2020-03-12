# Zuul

### Step

1. add the configuration of `EurekaClient`
2. add `spring-cloud-starter-netflix-zuul` dependency
3. add `@EnableZuulProxy` annotation
##### Note:
`zuul.routes.order.stripPrefix=true` (localhost/api/order/order/get -> localhost/api/order/get),
`zuul.strip-prefix=true` (localhost/api/order/order/get -> localhost/order/order/get)

### Todo

1. login identify
2. authority

