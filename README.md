# Spring Boot 2.1.5 + Java 11 Modules

## Installation Steps
1. Open the root folder in IntelliJ after cloning.
2. Enable auto import from pop up in IntelliJ after opening the project.
3. In case of compilation errors, make sure that all the sdks are set to Java 11.

### Setting up SDK
1. Open File -> Module Settings
2. Choose Dependencies tab
3. Choose Module SDK as 11

## Running the application
### Directly from Intellij
1. Open `Main.java` class can be found in `main` module.

### Running from command line
```bash
mvn clean spring-boot:run
```

>Make sure that Postgres server is Up and Running and the credentials match the one in `application.properties` file in `main module`.
