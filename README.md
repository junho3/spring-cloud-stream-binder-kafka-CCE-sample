# spring-cloud-stream-binder-kafka-sample

This is a sample project for https://github.com/spring-cloud/spring-cloud-stream/issues/2704.  

Using Consumer and @Component worked correctly before in 2021.0.3.  
ClassCastException started occurring after spring cloud stream 2021.0.4.  

```
# 1. run Kafka
docker-compose up -d

# 2. run application

# 3. publish message
curl --location 'localhost:8080/publish'
or
run publish.http file in /http package
```
