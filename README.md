# Spring boot + Apache kafka

A poc of an application that runs a consumer and a producer who send a message in a topic called "topic1". <br>
the topics, replicas and partitions are created with a config class in the app called : __`KafkaConfig.java`__

## installation :
### requirements :

- docker latest.
- docker-compose latest.
- jdk 8 or 11.
- maven latest.

### Steps : 
1. clone the project : 
> `git clone <url>`
2. run docker compose : 
> `docker-compose up -d`
3. check docker containers :
> `docker ps`
>> you should see the zookeeper and kafka running.
4. run the application with your IDE or : 
> `mvn spring-boot:run`
5. test the consumer with : 
> `POST : http://localhost:9292/api/test`
>> and you'll see a "hello consumer in your console".

---

