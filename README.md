# Spring-cloud-stream-binder-kafka-CCE-sample

This is a sample project for https://github.com/spring-cloud/spring-cloud-stream/issues/2704.  

💡 This issue is fixed with spring-cloud-stream 2023.0.3-SNAPSHOT  
Fixed commit: https://github.com/spring-cloud/spring-cloud-function/commit/05416dbc30ecab8a2bda237923ef205c9a3bda06

---

Using `Consumer` and `@Component` worked correctly before in 2021.0.3.  
`ClassCastException` started occurring after spring cloud stream 2021.0.4.  

```
Caused by: java.lang.ClassCastException: class com.example.demo.SampleConsumer cannot be cast to class java.util.function.Function (com.example.demo.SampleConsumer is in unnamed module of loader 'app'; java.util.function.Function is in module java.base of loader 'bootstrap')
at org.springframework.cloud.function.context.config.KotlinLambdaToFunctionAutoConfiguration$KotlinFunctionWrapper.invoke(KotlinLambdaToFunctionAutoConfiguration.java:126) ~[spring-cloud-function-context-4.1.2.jar:4.1.2]
at org.springframework.cloud.function.context.config.KotlinLambdaToFunctionAutoConfiguration$KotlinFunctionWrapper.apply(KotlinLambdaToFunctionAutoConfiguration.java:99) ~[spring-cloud-function-context-4.1.2.jar:4.1.2]
at org.springframework.cloud.function.context.config.KotlinLambdaToFunctionAutoConfiguration$KotlinFunctionWrapper.accept(KotlinLambdaToFunctionAutoConfiguration.java:146) ~[spring-cloud-function-context-4.1.2.jar:4.1.2]
at org.springframework.cloud.function.context.catalog.SimpleFunctionRegistry$FunctionInvocationWrapper.invokeConsumer(SimpleFunctionRegistry.java:1055) ~[spring-cloud-function-context-4.1.2.jar:4.1.2]
at org.springframework.cloud.function.context.catalog.SimpleFunctionRegistry$FunctionInvocationWrapper.doApply(SimpleFunctionRegistry.java:753) ~[spring-cloud-function-context-4.1.2.jar:4.1.2]
at org.springframework.cloud.function.context.catalog.SimpleFunctionRegistry$FunctionInvocationWrapper.apply(SimpleFunctionRegistry.java:592) ~[spring-cloud-function-context-4.1.2.jar:4.1.2]
at org.springframework.cloud.stream.function.PartitionAwareFunctionWrapper.apply(PartitionAwareFunctionWrapper.java:92) ~[spring-cloud-stream-4.1.2.jar:4.1.2]
at org.springframework.cloud.stream.function.FunctionConfiguration$FunctionWrapper.apply(FunctionConfiguration.java:823) ~[spring-cloud-stream-4.1.2.jar:4.1.2]
at org.springframework.cloud.stream.function.FunctionConfiguration$FunctionToDestinationBinder$1.handleMessageInternal(FunctionConfiguration.java:654) ~[spring-cloud-stream-4.1.2.jar:4.1.2]
at org.springframework.integration.handler.AbstractMessageHandler.doHandleMessage(AbstractMessageHandler.java:105) ~[spring-integration-core-6.3.0.jar:6.3.0]
... 36 common frames omitted
```

```
# 1. run Kafka
docker-compose up -d

# 2. run application

# 3. publish message
curl --location 'localhost:8080/publish'
or
run publish.http file in /http package
```
