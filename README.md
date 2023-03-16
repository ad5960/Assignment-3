
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Ayush Dixit                |
| Date         | 03/16/2023                 |
| Course       | Spring                     |
| Assignment # | 3                          |

# Assignment Overview
The task is to develop an Email Generation application that can automatically generate personalized emails for different customer segments, including Business, Returning, Frequent, New, and VIP. The solution has been implemented in Java using the Factory Method pattern. Separate classes have been created for each customer type, and a factory class has been used to create an instance of the appropriate email factory object based on the customer type. The implementation has been demonstrated through unit tests, which create instances of each customer type and generate unique email text using the corresponding factory object.

# GitHub Repository Link:
https://github.com/{YOUR_USERNAME}/cs-665-assignment-{ASSIGNMENT_NUMBER}

# Implementation Description 


For each assignment, please answer the following:

- If we choose to implement the Factory Method pattern for generating personalized emails for different customer types, our code becomes more flexible in several ways:

1. Easy to add new customer types: If we want to add a new customer type, we can simply create a new EmailFactory implementation for that type and add it to the EmailFactoryCreator. The existing code for generating emails for other customer types does not need to be modified.

2. Easy to change email generation logic: If we want to change the email generation logic for a specific customer type, we can simply modify the corresponding EmailFactory implementation. The existing code for other customer types does not need to be modified.

3. Easy to test: The Factory Method pattern allows us to test each EmailFactory implementation in isolation, making it easier to test our email generation logic and identify any issues or bugs.
   Overall, by using the Factory Method pattern, our code becomes more flexible and easier to maintain. We can add new customer types and change email generation logic without affecting the existing code, and we can select the email generation logic at runtime based on some input.
# Simplicity and understandability of the implementation.
The implementation I provided is relatively simple and understandable.

Firstly, the implementation uses the Factory Method design pattern, which is a widely recognized and well-understood pattern. This means that other developers who are familiar with the pattern should have no trouble understanding the code.

Secondly, the implementation uses clear and descriptive class names, making it easy to understand the purpose of each class. The names of the classes reflect the different customer types and the EmailFactory interface indicates that each class is responsible for generating emails.

Thirdly, the implementation includes a separate class for each customer type, which makes it easy to add new customer types or modify the implementation for existing ones. Additionally, the implementation separates the responsibility of creating an EmailFactory object from the individual email generation classes. This makes the code more modular and easier to maintain.

Finally, the implementation includes a test class that demonstrates how to use the EmailFactoryCreator to generate emails for each customer type. The test class shows how the EmailFactoryCreator can be used to obtain the correct EmailFactory object based on the customer type and how to use it to generate an email. This makes it easy for other developers to understand how the implementation works and how it can be used.

Overall, the implementation is simple, modular, and easy to understand. Other developers should have no trouble reading and maintaining the code, even if they are not familiar with the specific implementation details.








# Why Factory Method Pattern was chosen
The Factory Method design pattern was chosen for this question because it is a good fit for the requirement of generating personalized emails for different customer segments.

The Factory Method pattern defines an interface for creating objects, but allows subclasses to determine which class to instantiate. This means that the Factory Method pattern allows us to create objects without specifying the exact class that will be instantiated. In our case, we can use the Factory Method pattern to create different email generators for each customer segment without having to specify the exact implementation of each generator.

Using the Factory Method pattern in this scenario allows us to separate the responsibility of email generation from the rest of the application logic. This means that we can easily add or modify email generators for different customer segments without having to modify the rest of the application. Additionally, using the Factory Method pattern makes the code more modular and easier to maintain.

Overall, the Factory Method pattern was chosen because it provides a simple and effective solution for generating personalized emails for different customer segments. It allows us to separate the email generation logic from the rest of the application and provides a clear and modular implementation.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




