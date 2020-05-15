Ribbon is a dependency that is used as load balancer

This app also requires Eureka Server

The line 26 of Controller get an instance of a specific service registered by his name "currency-server" in the Eureka server. This name is how the CurrencyServer project is defined in his application.properties file, "false" is for non secure 

#####  InstanceInfo instanceInfo = client.getNextServerFromEureka("currency-service",false);

The next annotation
 @Bean & @LoadBalanced are used to defined that the restTemplate has to be created using a Load Balancer, in this case is Ribbon


When we run this app as Spring boot app, it is redirected to a specific instance by Ribbon using the instances registered in EurekaServer, and the response is the instance in which this app is been connected.

To access to this app go to localhost:8080/

Response------->>>> Exchange value is Current exchange rate from 8001


The response of localhost:8001 ---------->>>>>Current exchange rate from 8001