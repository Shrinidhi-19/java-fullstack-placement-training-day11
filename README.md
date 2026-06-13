# Student & Course Management System

## Overview

This project is a Spring Boot REST API application developed as part of Java Full Stack Development Placement Training.

The application demonstrates the implementation of a layered architecture using:

* Spring Boot
* Spring Data JPA
* PostgreSQL
* REST APIs
* Entity Mapping
* Repository Pattern
* Service Layer
* Controller Layer

The project manages Student and Course records through RESTful endpoints.

---

## Project Architecture

The application follows a standard three-layer architecture:

```text
Client
   ↓
Controller Layer
   ↓
Service Layer
   ↓
Repository Layer
   ↓
PostgreSQL Database
```

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* REST API
* Postman

---

## Project Structure

```text
src/main/java/com/example/dbdemo

├── DbdemoApplication.java
├── Student.java
├── Course.java
├── StudentController.java
├── StudentService.java
├── StudentRepository.java
└── CourseRepository.java
```

---

## Features

### Student Management

* Add Student Record
* View All Student Records
* Store Data in PostgreSQL Database

### Course Management

* Add Course Record
* View All Course Records
* Database Integration using JPA

---

## Entity Classes

### Student Entity

Contains:

* Student ID
* Student Name
* Course ID

### Course Entity

Contains:

* Course ID
* Course Name
* Student ID

---

## REST API Endpoints

### Student APIs

#### Get All Students

```http
GET /record/stu
```

#### Add Student

```http
POST /record/stu
```

Sample JSON:

```json
{
  "stu_name": "Shrinidhi"
}
```

---

### Course APIs

#### Get All Courses

```http
GET /record/cors
```

#### Add Course

```http
POST /record/cors
```

Sample JSON:

```json
{
  "cus_name": "Java Full Stack"
}
```

---

## Database Configuration

The project uses PostgreSQL as the backend database.

Configuration is managed through:

```properties
application.properties
```

Key configurations include:

* Database URL
* Username
* Password
* Hibernate Auto Update
* SQL Query Display

---

## Concepts Practiced

* Spring Boot Project Setup
* REST API Development
* Controller Layer
* Service Layer
* Repository Layer
* Dependency Injection
* Spring Data JPA
* PostgreSQL Connectivity
* Entity Mapping
* HTTP GET Methods
* HTTP POST Methods
* JSON Request Handling

---

## Learning Outcomes

Through this project, I learned:

* Building RESTful APIs using Spring Boot
* Connecting Spring Boot applications with PostgreSQL
* Implementing layered architecture
* Managing entities using JPA
* Using Repository interfaces for database operations
* Handling JSON requests and responses
* Testing APIs using Postman

---

## Training Details

**Placement Training:** Java Full Stack Development

**Day:** 11

**Date:** 12 June 2026

---

## Author

**Shrinidhi Dhamodharan**

Aspiring Java Full Stack Developer

Focused on learning Spring Boot, REST APIs, Database Integration, and Full Stack Application Development through hands-on projects and continuous practice.
