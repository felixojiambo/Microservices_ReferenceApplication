# E-commerce Microservices Application - README

## Introduction

This project is an e-commerce application built using a microservices architecture. The application is designed to be scalable, maintainable, and secure.

## Setup Guide

### Prerequisites

- Docker
- Java (JDK 11+)
- Maven

### Steps to Run the Application

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/fojiamboe/java-ecom.git
   cd java-ecom
   ```

2. **Build the Projects:**
   ```bash
   mvn clean install
   ```

3. **Run Docker Compose:**
   ```bash
   docker-compose up
   ```

### Services

1. **Configuration Server:**
   - Manages configurations centrally.

2. **Discovery Server:**
   - Service registration and discovery.

3. **Customer Microservice:**
   - Manages customer information.

4. **Product Microservice:**
   - Manages product catalog.

5. **Order Microservice:**
   - Handles order processing.

6. **Payment Microservice:**
   - Manages payments.

7. **Notification Microservice:**
   - Handles notifications.

8. **API Gateway:**
   - Routes requests to appropriate microservices.

### Tools and Technologies

- **Kafka and Zookeeper:**
  - For asynchronous communication.

- **Zipkin:**
  - Distributed tracing.

- **Keycloak:**
  - Security and authentication.

## Testing the Application

- Ensure all microservices are up and running.
- Access the API Gateway to interact with the services.
- Use provided test data and scripts to validate functionalities.

## Monitoring and Security

- Use Zipkin for monitoring application logs and tracing requests.
- Keycloak is set up for security, including creating realms and clients for authentication.

