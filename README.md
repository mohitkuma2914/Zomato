# Zomato Backend

A REST API project inspired by **Zomato**, built using **Spring Boot**, **Java 21**, and **MySQL**.

## Tech Stack

* Java 21
* Spring Boot 3.5.14
* Spring Data JPA
* MySQL
* Lombok
* Maven

## Database Configuration

```properties
spring.application.name=zomato
spring.datasource.url=jdbc:mysql://localhost:3306/zomato?createTableIfNotExists=true
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```

## Run the Project

```bash
mvn clean install
mvn spring-boot:run
```

## Features

* Restaurant Management
* Menu Management
* REST APIs
* MySQL Integration
