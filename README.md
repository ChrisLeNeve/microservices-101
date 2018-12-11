# microservices-101
A minimalistic example of microservices - define a registration server, and a microservice that registers to it. No actual functionality is exposed.

Run the RegistrationServer.java main, then the MovieServer.java main. Then open localhost:1994, wait up to 30 seconds (default client refresh time), then the Eureka dashboard will indicate that our Movie service instance is registered to our Eureka server.

# What makes this a microservice?
A microservice is a standalone process that handles a well defined requirement. You can expose as many microservices as you like. This makes your project much easier to work on than a monolith - in case there's a bug on a specific functionality, you'll only need to redeploy the fix on the concerned microservice, rather than redeploy the whole app. It's also easier to diagnose where bugs come from, since (and this is an important aspect to microservices) exception handling needs to be handled with much more care.

For microservices to be able to talk to each other, they need a central "phone book" which will allow them to find the microservice they want to talk to - a discovery, or registration server. Spring Cloud incorporates Netflix's discovery server, called Eureka, which is used in this POC.

So, what's done here is really the basics of microservices:
 - I created a discovery server, and configured it (for instance, it's important to tell the registration server not to register itself to the Eureka server)
 - I created a microservice, which registers to the discovery server.
 
 Eureka's dashboard then shows the registered microservice.
