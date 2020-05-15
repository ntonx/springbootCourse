This project requires the Eureka Server, so run this one before test this project


Then, run an instance of this project as "Run as spring project"

We can run two or more instances of the same project using the RUN window...

1. Click on Run
2. Click on Run configurations
3. Click on Spring Boot App
4. Click on the top, in the "New launch configuration" icon
5. Write a new name
6. Select a project to parallel
7. Select the main class to execute
8. Click on Aply
9. Close this window
10. Change the port to execute a new instance
11. Open again the Run configuration
12. Select the Run configuration saved previously
13. Click on Run
14. Now two instances of the same project are running 


Now we can create two instances of one project that can be used to make more efficient a system; if one of this fails, the other is up... but to make a load balancer running we have to configure in the other side: On the application "CurrencyApp" using Ribbon as LoadBalancer