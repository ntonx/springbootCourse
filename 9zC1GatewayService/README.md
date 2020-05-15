GatewayService makes funcionality like a proxy server, where all the request to a specific microservice endpoint (url) pass thought this gateway. This service uses @EnableZuulProxy annotation (to use it is necessary dependendies on pom.xml)

Zuul is a project from Netflix

This service also needs to be registered in a EurekaServer, so to test this project you must to run 9z7EurekaServer, 9zC1GatewayServer, 9zC1Service1, 9zC1Service2, in this sequence.

If 9zC1GatewayServer is down, you can access to the 9zC1Service1 or Service2 but you will need to access to the specific port given on the application.properties file of every microservice, but if the 9zC1GatewayService is up, you can access to the microservices with the same url that 9zC1GatewayService adding a "/"and the name of the microservice registered in his own application.properties


If 9zC1GatewayService is down
Access to 9zC1Service1
		http://localhost:8001/ 
				Result: Service 1 - Order Service

If 9zC1GatewayService is up:
	The application.properties of 9zC1GatewayService doesn't specify a port so the default port is localhost:8080 to acces to the GatewayService
	In order to access to the 9zC1Service1 lets open the application.properties of this project:
	spring.application.name=fx-order
	So let's request the 9zC1Service1 throught the Gateway using this url
	 	http://localhost:8080/fx-order
			Result: Result: Service 1 - Order Service


You must use the annotation @EnableZuulProxy in the Gateway project, also register the application in the Eureca server using the annotation @EnableDiscoveryClient	 	