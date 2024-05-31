# Employee Management Application

This project demonstrates building RESTful web services using Spring Boot 3, Spring Data JPA (Hibernate), and the H2 database.

**Key Features:**

* **RESTful Web Services:** Learn how to create and implement RESTful APIs using Spring Boot.
* **Three-Layer Architecture:** Understand and implement the controller, service, and repository layers in your Spring Boot application.
* **H2 Database:** Explore the use of H2 database for development and testing purposes.
* **Lombok:** Reduce boilerplate code with the Lombok library.
* **Spring Data JPA:** Leverage Spring Data JPA for data persistence and interactions with the H2 database.
* **IntelliJ IDEA:** Develop your Spring Boot application efficiently using IntelliJ IDEA.
* **Postman:** Test and interact with your REST APIs using Postman.

**Getting Started:**

1. **Prerequisites:**
   - **Java 17:** Ensure you have Java 17 installed on your system. Download and install the latest version from [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html).
   - **H2 Database:** Download the H2 database JAR file from [https://www.h2database.com/html/download.html](https://www.h2database.com/html/download.html). You can either place it in your project's classpath or configure your build system to include it as a dependency.

2. **Building and Running:**
   - **Maven:** If you're using Maven, run the following command to build and package your project:
     ```bash
     mvn clean package
     ```
   - **Gradle:** If you're using Gradle, run the following command to build and package your project:
     ```bash
     gradle build
     ```
   - **Running:**
     - Locate the generated JAR or executable file (usually in the `target` directory).
     - Run the application using the appropriate command for your environment. For example, on Windows:
       ```bash
       java -jar target/your-project-name-1.0-SNAPSHOT.jar
       ```

**H2 Database Configuration:**

- **Embedded Mode:**
   - By default, H2 runs in embedded mode, creating an in-memory database. This is suitable for development and testing.
