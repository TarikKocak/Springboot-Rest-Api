# Spring Boot REST API Demo

This is a simple Spring Boot REST API project built with **Spring Boot**, **PostgreSQL**, and **Spring Data JPA**.  
The API provides basic CRUD operations for a `User` entity and can be tested using **Postman**.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Spring Security (basic configuration)
- Maven

---

## Project Structure

src/main/java/com/restApi/demo
├── controller # REST controllers< br / >
├── service # Business logic< br / >
├── repository # Database access layer< br / >
├── entity # JPA entities< br / >
├── dto # Data Transfer Objects< br / >
├── mapper # DTO ↔ Entity mapping< br / >
└── config # Security configuration< br / >
