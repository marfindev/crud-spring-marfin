
# CRUD Spring Marfin

## Introduction
This project is a **Spring Boot CRUD application** designed to manage customer data. It provides basic Create, Read, Update, and Delete (CRUD) functionality using Spring Boot, Spring Data JPA, and a web-based interface.

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Documentation](#documentation)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

## Installation

### Prerequisites
- Java 17+
- Maven 3+
- IDE (optional): IntelliJ IDEA, Eclipse, etc.
- Database (default is H2, can be customized)

### Steps
1. Clone or extract the repository.
2. Navigate to the project root.
3. Build the project with:
    ```bash
    ./mvnw clean install
    ```
4. Run the application with:
    ```bash
    ./mvnw spring-boot:run
    ```

## Usage
Once the application is running, access the customer management pages in your browser.

- Default URL: [http://localhost:8080](http://localhost:8080)

### Endpoints
| Method | Endpoint | Description |
|---|---|---|
| GET | `/` | View all customers |
| GET | `/new` | Form to add a new customer |
| POST | `/save` | Save a new customer |
| GET | `/edit/{id}` | Edit customer form |
| POST | `/update/{id}` | Update customer details |
| GET | `/delete/{id}` | Delete customer |

## Features
- Customer Management (Create, Read, Update, Delete)
- Web-based UI using Thymeleaf templates
- Simple navigation between customer views
- In-memory H2 database for easy setup
- Service and repository layers following good separation of concerns

## Dependencies
- **Spring Boot Starter Web**: For building the web application.
- **Spring Boot Starter Thymeleaf**: For rendering HTML templates.
- **Spring Boot Starter Data JPA**: For data persistence.
- **H2 Database**: In-memory development database.
- **Lombok**: To reduce boilerplate code.

Refer to the `pom.xml` for complete dependency list.

## Configuration
The application can be configured via `application.properties` in:

```
src/main/resources/application.properties
```

Example properties:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```

## Documentation
- `CustomerController`: Handles all web requests.
- `CustomerService`: Business logic layer.
- `CustomerRepository`: Interface for CRUD operations.
- `Customer`: Entity class representing the customer.

### Directory Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.jrp.mfn/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── CrudSpringMarfinApplication.java
│   └── resources/
│       ├── templates/
│       └── application.properties
└── test/
```

## Examples
After running the application, you can:

- Create a new customer via the "New Customer" button.
- Edit or delete existing customers directly from the homepage.
- All changes persist in the in-memory H2 database during runtime.

## Troubleshooting
| Issue | Solution |
|---|---|
| Port already in use | Change `server.port` in `application.properties` |
| Dependency issues | Run `mvn clean install` again |
| Templates not rendering | Ensure Thymeleaf templates are under `/resources/templates/` |

## Contributors
- **Marfin**

## License
This project is licensed under the MIT License. See [LICENSE](LICENSE) file for details.
