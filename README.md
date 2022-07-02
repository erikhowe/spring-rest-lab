## Table of Contents
1. [Introduction](#introduction)
2. [Technologies and Languages](#technologies)

## Introduction
Objects are stored in an H2 database, accessed by JPA, and then wrapped in a web layer by Spring MVC so that they can be served on the web.

## Technologies and Languages
1. Spring Boot
2. Spring Data
3. Spring MVC
4. Spring HATEOAS
5. H2 database
6. Java Persistence API
7. Docker
8. Maven

## HAL (Hypertext Application Language)
Hal is a hypermedia format used to represent resources and to connect them in a usable way by (1) embedding related resources and (2) listing related links to other resources. Each HAL representation includes a map containing a list of links to navigate from the resource and an optional map of embedded resources to find the entire resource via its `self` link. 

## REST
First rule of REST is to never talk about...is to never delete a column, even if it means repeating information

## Reference
1. [Method References](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)
2. [Streams](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
3. [HATEOAS](https://restfulapi.net/hateoas/)
4. [Spring HATEOAS](https://spring.io/projects/spring-hateoas#overview)
5. [String Request and Response Body](https://www.baeldung.com/spring-request-response-body)
6. [REST and HAL](https://www.innoq.com/en/articles/2020/12/rest-apis-with-hal/)
7. [REST and HAL 2](https://www.baeldung.com/spring-rest-hal)
8. [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
9. [Spring Boot Maven](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html#build-tool-plugins.maven)

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.1/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Personal Notes for Eventual Blog post
#### Spring Data JPA
Classes are package-private by default. To define the JPA entity, an empty protected constructor that wont be used is written to follow the bean structure and a public constructor is the one used to create instances of the model to be stored in the database. The unique id for each object is annotated with @Id so that JPA recognizes it to be such and @GeneratedValue tells JPA to generate the value instead of doing so manually. Other properties of the object are left unannotated and assumed to be mapped to columns of the same name. JPA requires a repository to work. The apex interface, `Crudrepository`, provides CRUD functions that operate on the database, `PagingAndSortingRepository` extends `CrudRepository` and provides methods to do pagination and sorting records, and `JpaRepository` extends `PagingAndSortingRepository` to provide JPA-related methods (i.e. flushing the persistence context and deleting records in a batch) [(Ken Chan 2012)](https://stackoverflow.com/a/14025100). Usually in Java applications, an interface containing abstract methods needs an implementation, but Spring Data JPA does this automatically when the application is run. 

Basically, a Spring Boot application uses Hibernate to map application-domain-model-objects to the relational-database. Usually, a Java programmer would use the Java Persistence API (JPA) to interact with the object relational mapper which involves declaring `Entity`'s and relationships between `Entity`'s, using an `EntityManager` to perform database interactions and defining a repository interface. By adding Spring Data JPA, the repository interface is generated automatically and `EntityManager` operations are abstracted into a black box, saving the programmer from writing more-or-less boilerplate database interaction code and XML configurations. 

#### Spring Boot
The @SpringBootApplication annotation adds the @Configuration, @EnableAutoConfiguration and @ComponentScan annotations. The SpringApplication.run() method launches the application
