# Quarkus Multi-Module Starter App

## Introduction

This project serves as a starter template for a Quarkus-based multi-module Maven application. It provides a clean structure to organize your code into reusable modules and ensures compatibility with Quarkus features.

---

## Getting Started

### Install Dependencies

Before running or debugging the application, install all dependencies with:

`mvn install -DskipTests`

### Running the Application

To start the application in development mode:

`mvn quarkus:dev`

Note: Starting the app in Intellij, open the Maven panel, and click on the tree node 
`api -> plugins -> quarkus -> quarkus:dev` 

### Debugging

For debugging, you can use your IDE debugger or attach to the Quarkus debug port (5005). From the terminal, start with:

`mvn quarkus:dev -Ddebug`

Then attach your debugger to port `5005`.

---

## Testing

### Unit Tests

Run unit tests for the application with:

`mvn test`

### Integration Tests

Integration tests can be executed with:

`mvn verify`

---

## Formatting

Run the formatter before checking in code:

`mvn formatter:format`

---

This starter project is ready to be extended with more modules and features!
