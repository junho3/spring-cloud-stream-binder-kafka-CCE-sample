# spring-cloud-stream-binder-kafka-sample

This is a sample project to verify a ClassCastException when using Consumer and @Component combination in spring-cloud-stream.  

It worked correctly before in 2021.0.3.  
It seems like starting with spring cloud stream 2021.0.4.  

```
# 1. run kafka
docker-compose up -d

# 2. run application

# 3. publish message
curl --location 'localhost:8080/publish'
or
run publish.http file in /http package
```
