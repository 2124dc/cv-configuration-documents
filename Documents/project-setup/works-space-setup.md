Here’s a sample project setup file in markdown format for your Java microservice project:

# Java Microservices Project Setup

This document provides a step-by-step guide to set up the microservices-based project using the following components:

- **Eureka Server**
- **Config Server**
- **API Gateway**
- **Auth Service**
- **Admin Microservice**
- **Owner Microservice**
- **Hotel Microservice**
- **Order Microservice**
- **Payment Microservice**

## Prerequisites

Ensure the following tools are installed on your system:

- **Java 21** (JDK 21+)
- **Maven 3.9.6**
- **MongoDB** (running instance)
- **Git**

Each microservice is hosted in its own repository. Make sure to clone the repositories locally to begin.

## Project Setup Steps

### 1. Clone All Microservices Repositories

Start by cloning each repository into your workspace:

```bash
git clone <eureka-server-repo-url>
git clone <config-server-repo-url>
git clone <api-gateway-repo-url>
git clone <auth-service-repo-url>
git clone <admin-microservice-repo-url>
git clone <owner-microservice-repo-url>
git clone <hotel-microservice-repo-url>
git clone <order-microservice-repo-url>
git clone <payment-microservice-repo-url>
```

### 2. Setup Config Server

- Navigate to the **Config Server** folder:

    ```bash
    cd config-server
    ```

- Run the Config Server using Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

- Verify that the Config Server is running on `localhost:8888`.

### 3. Setup Eureka Server

- Navigate to the **Eureka Server** folder:

    ```bash
    cd ../eureka-server
    ```

- Run the Eureka Server:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

- Eureka should be available at `localhost:8761`.

### 4. Setup API Gateway

- Navigate to the **API Gateway** folder:

    ```bash
    cd ../api-gateway
    ```

- Build and run the API Gateway:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

- The API Gateway will route the microservices and should be available at `localhost:8080`.

### 5. Setup Auth Service

- Navigate to the **Auth Service** folder:

    ```bash
    cd ../auth-service
    ```

- Run the Auth Service:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

- Authentication Service should be available at `localhost:8081`.

### 6. Setup Admin Microservice

- Navigate to the **Admin Microservice** folder:

    ```bash
    cd ../admin-microservice
    ```

- Run the Admin Microservice:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

### 7. Setup Owner Microservice

- Navigate to the **Owner Microservice** folder:

    ```bash
    cd ../owner-microservice
    ```

- Run the Owner Microservice:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

### 8. Setup Hotel Microservice

- Navigate to the **Hotel Microservice** folder:

    ```bash
    cd ../hotel-microservice
    ```

- Run the Hotel Microservice:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

### 9. Setup Order Microservice

- Navigate to the **Order Microservice** folder:

    ```bash
    cd ../order-microservice
    ```

- Run the Order Microservice:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

### 10. Setup Payment Microservice

- Navigate to the **Payment Microservice** folder:

    ```bash
    cd ../payment-microservice
    ```

- Run the Payment Microservice:

    ```bash
    mvn clean install
    mvn spring-boot:run -Dspring-boot.run.profiles=<profile name(prod/dev)>
    ```

## Common Configurations

Each microservice is configured to connect to:

- **Eureka Server:** URL `localhost:8060`
- **Config Server:** URL `localhost:8061`
- **API Gateway:** URL `localhost:8062`
- **MongoDB:** Ensure MongoDB is running locally on port `27017` or configure the connection string in each microservice’s `application.properties` or `application.yml`.

## Swagger Documentation

Each microservice is integrated with **Swagger 3.0.0**. Once running, you can access the Swagger UI for each microservice at:

- Auth Service: `http://localhost:8063/swagger-ui.html`
- Admin Microservice: `http://localhost:8071/swagger-ui.html`
- Owner Microservice: `http://localhost:8072/swagger-ui.html`
- Hotel Microservice: `http://localhost:8073/swagger-ui.html`
- Order Microservice: `http://localhost:8074/swagger-ui.html`
- Payment Microservice: `http://localhost:8075/swagger-ui.html`

### Sample Swagger Configuration

Each microservice should have Swagger configuration similar to:

```java
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                .title("Microservice API")
                .version("1.0.0")
                .description("API documentation for microservice"));
    }
}
```

## Running the Full System

Once all the microservices are up and running, you can access the system through the API Gateway at `localhost:8062`.

- The gateway will route the requests to the respective microservices based on the defined routes.
- Authentication and authorization are handled by the **Auth Service**.

---

For further details, check the respective microservice's repository.
