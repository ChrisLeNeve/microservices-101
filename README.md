# microservices-101
A minimalistic example of microservices - define a registration server, and a microservice that registers to it. No actual functionality is exposed.

Run the RegistrationServer.java main, then the MovieServer.java main. Then open localhost:1994, wait up to 30 seconds (default client refresh time), then the Eureka dashboard will indicate that our Movie service instance is registered to our Eureka server.
