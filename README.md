# 🗂️ Employee Directory CRUD Application

A simple full-stack **Employee Directory** application built using:

- 🎯 **Spring Boot + Spring MVC** (Backend)
- 🎨 **Thymeleaf + Bootstrap** (Frontend)
- 🛢️ **MySQL** (Database)

This project allows users to **Create, Read, Update, and Delete (CRUD)** employee records via a web interface.

---

## 🚀 Features

- View all employees in a responsive table layout
- Add new employees
- Edit existing employee details
- Delete employees
- Clean UI using Bootstrap and Thymeleaf
- Seamless integration with MySQL

---

## 🏗️ Tech Stack

- **Frontend**: Thymeleaf, Bootstrap
- **Backend**: Spring Boot, Spring MVC
- **Database**: MySQL

---

## 📦 Getting Started

### 1. **Clone the Repository**

```bash
git clone https://github.com/Jitprakash/Employee-Directory-CRUD-Application.git
cd Employee-Directory-CRUD-Application
```
### 2\. **Set Up the Database**

-   Make sure MySQL is installed and running.

-   Run the SQL script located at `sql-scripts/employee-directory.sql` to create the database and table:
`  -- Run this in your MySQL client
source sql-scripts/employee-directory.sql;`

### 3\. **Configure `application.properties`**

Go to `src/main/resources/application.properties` and set your MySQL credentials:

```
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4\. **Run the Application**

Use your IDE (like IntelliJ or Eclipse) or run via command line:

```
./mvnw spring-boot:run
```

Or run the main class:

`CrudThymeleafApplication.java`

### 5\. **Access the Application**

Open your browser and go to:

```
http://localhost:8080
```
