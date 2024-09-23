To deploy multiple Spring Boot applications as standalone JAR files on localhost, you can follow these steps. Here, we'll cover the deployment of Eureka Server, Config Server, and API Gateway. For simplicity, we'll assume you have built each application into a JAR file.

### Prerequisites
- Java 21 installed
- Maven installed
- Each application (Eureka Server, Config Server, API Gateway) built as a JAR file

### 1. Set Up Eureka Server

#### **1.1. Build Eureka Server**

Ensure your Eureka Server application has been built into a JAR file. For example:
```bash
mvn clean package
```
This will create a JAR file in the `target` directory.

#### **1.2. Run Eureka Server**

Run the Eureka Server JAR file using the following command:
```bash
java -jar eureka-server.jar
```
Assuming your `eureka-server.jar` file is in the current directory, this will start the Eureka Server on the default port (8761) or the port specified in the `application.properties` file.

#### **1.3. Verify Eureka Server**

Navigate to `http://localhost:8761` in your browser to ensure the Eureka Server is running and accessible.

### 2. Set Up Config Server

#### **2.1. Build Config Server**

Ensure your Config Server application has been built into a JAR file:
```bash
mvn clean package
```
This will create a JAR file in the `target` directory.

#### **2.2. Run Config Server**

Run the Config Server JAR file:
```bash
java -jar config-server.jar
```
Assuming your `config-server.jar` file is in the current directory, this will start the Config Server on the default port (8888) or the port specified in the `application.properties` file.

#### **2.3. Verify Config Server**

Navigate to `http://localhost:8888` in your browser to ensure the Config Server is running and accessible.

### 3. Set Up API Gateway

#### **3.1. Build API Gateway**

Ensure your API Gateway application has been built into a JAR file:
```bash
mvn clean package
```
This will create a JAR file in the `target` directory.

#### **3.2. Run API Gateway**

Run the API Gateway JAR file:
```bash
java -jar api-gateway.jar
```
Assuming your `api-gateway.jar` file is in the current directory, this will start the API Gateway on the default port (8080) or the port specified in the `application.properties` file.

#### **3.3. Verify API Gateway**

Navigate to `http://localhost:8080` in your browser or test the routing to your microservices to ensure the API Gateway is running and routing requests properly.

### Summary of Ports
- **Eureka Server:** `http://localhost:8761`
- **Config Server:** `http://localhost:8888`
- **API Gateway:** `http://localhost:8080`

### Additional Tips
- **Configuration Files:** Ensure each application’s `application.properties` or `application.yml` file is correctly set up for local deployment. For example, the Eureka Server should be configured to register services, and the API Gateway should be set up with the correct routes.
- **Networking:** Ensure that all services can communicate with each other. The API Gateway should be able to route requests to the Eureka Server and other microservices registered with it.
- **Logs:** Check the logs if any service fails to start or if there are any issues. Logs can provide insight into what might be going wrong.

This setup should help you run and test your microservices locally using JAR files. If you need further customization or encounter any issues, feel free to ask!