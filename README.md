
# Employee Management System
A simple web-based Employee Management System built using Spring Boot, JSP, and PostgreSQL, with Spring Security for role-based access control.

This project is a CRUD-based Employee Management System that allows users to Add, update, delete, and view employees via REST APIs and JSP frontend.

This system demonstrates a basic full-stack Java web application setup, integrating backend, frontend, database, and security.

## Technology Used
Spring Boot (REST APIs, JPA)
JSP (Frontend with HTML forms)
PostgreSQL (Database)
Spring Security (Role-based access)

## Role Based Access
ADMIN (can Add/Update/Delete)

Username: admin
Password: admin123

USER (can View only)

Username: user
Password: user123

## How To Run
1. Configure PostgreSQL DB with credentials in application.properties.

2. Run the Spring Boot App using your IDE or mvn spring-boot:run.

3. Access endpoints at: http://localhost:8080/employees
