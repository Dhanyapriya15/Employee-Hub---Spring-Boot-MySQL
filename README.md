# Employee-Hub---Spring-Boot-MySQL

Overview
This is a Spring Boot application for managing employee data. The application uses a RESTful API and can be tested with tools like Postman.
Features
REST API to manage employees (Add, View, Update, Delete).
Uses Spring Boot for backend and MySQL for data storage.
Deployed locally on port 8086.

Prerequisites
JDK 11 or later,
Maven,
Postman (to test API endpoints).
The application will start on http://localhost:8086.

Testing with Postman
Use the following endpoints to test the API in Postman:
Get All Employees
Method: GET
URL: http://localhost:8086/api/employees

Add an Employee
Method: POST
URL: http://localhost:8086/api/employees

Body (JSON):
json
{
  "emp_id": 1,
  "emp_name": "Alice",
  "emp_dept": "HR"
}
{
  "emp_id": 2,
  "emp_name": "Bob",
  "emp_dept": "Finance"
}
{
  "emp_id": 3,
  "emp_name": "Charlie",
  "emp_dept": "Engineering"
}

Tools and Technologies Used
Backend: Spring Boot
Database: MySQL
Testing: Postman
Build Tool: Maven
Language: Java




