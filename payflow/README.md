# PayFlow API

## Overview

PayFlow is a Spring Boot REST API that simulates a simple payment platform. It allows users to register, retrieve user information, and record money transfer transactions.

## Tech Stack

* Java 17
* Spring Boot 3.5.5
* Spring Data JPA
* H2 Database
* Maven
* Lombok

## Project Structure

```text
entity      -> Database entities (User, Transaction)
repository  -> Database access layer
service     -> Business logic layer
controller  -> REST API endpoints
```

## How to Run

1. Clone the repository

```bash
git clone <repo-url>
```

2. Build the project

```bash
mvn clean install
```

3. Run the application

```bash
mvn spring-boot:run
```

4. Access H2 Console

```text
http://localhost:8080/h2-console
```

5. Access Swagger UI

```text
http://localhost:8080/swagger-ui/index.html
```

## API Endpoints

### User APIs

```http
POST /users/register
GET  /users/id/{id}
GET  /users/upi/{upiId}
GET  /users
```

### Transaction APIs

```http
POST /transactions
```

## Spring Boot Features Used

### Embedded Server

Spring Boot provides an embedded Tomcat server, so no external server installation is required.

### Auto Configuration

Spring Boot automatically configures DataSource, JPA, Hibernate, and REST components based on project dependencies.

### Production-Ready Defaults

Spring Boot provides sensible defaults such as logging, JSON serialization, exception handling, and connection pooling.

## Layers

### Entity Layer

Represents database tables using JPA entities.

### Repository Layer

Handles database operations using Spring Data JPA.

### Service Layer

Contains business logic and validation.

### Controller Layer

Exposes REST APIs and handles HTTP requests/responses.
