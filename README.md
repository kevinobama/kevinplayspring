What is the Spring Framework?
The Spring Framework is an open-source framework for building enterprise Java applications. Spring aims to simplify the complex and cumbersome enterprise Java application development process by offering a framework that includes technologies such as:

Aspect-oriented programming (AOP)
Dependency injection (DI)
Plain Old Java Object (POJO)
Even with all these technologies, Spring is a lightweight framework that can be used to create scalable, secure, and robust enterprise web applications.

At a macro-level, we can consider the Spring framework a collection of sub frameworks such as Spring Web Flow, Spring MVC, and Spring ORM. In addition to Java, Spring also supports Kotlin and Groovy.

The Spring framework is also the base that powers all the other Spring-based projects, such as:

Spring Boot
Spring Cloud
Spring GraphQL
Core Features of Spring Framework
Let’s look at the core features of the Spring framework.

IoC (Inversion of Control) Container
IoC container is one of the core features of Spring that provides a streamlined way to configure and manage Java objects. This container is responsible for managing the lifecycle of a defined Java object, significantly increasing the configurability of a Spring-based application.

IoC uses the dependency injection or dependency lookup patterns to provide the object reference during runtime. The container consists of assembler code that is required for configuration management.

Spring provides org.springframework.beans and org.springframework.context packages that can be used to facilitate these functions.

Support for aspect-oriented programing
AOP aims to provide more modularity to the cross-cutting concerns, which are functions that span across the application, such as:

Logging
Caching
Transaction management
Authentication
Etc.
Moreover, AOP complements object-oriented programming by providing a different way to structure the program, where OOP modularity is based on classes.

In AOP, the main unit of modularity is an aspect (cross-cutting concern). This enables users to use AOP to create custom aspects and declarative enterprise services. The IoC container does not depend on AOP, offering further freedom for developers to select their preferred programming method.

However, Aspect-Oriented Programming combined with the Spring IoC provides a robust middleware solution.

Data access framework
Database communication issues are one of the common issues developers face when developing applications. Spring simplifies the database communication process by providing direct support for popular data access frameworks in Java, such as JDBC, Hibernate, Java Persistence API (JPA), etc.

Additionally, it offers features such as resource management, exception handling, and resource wrapping for all the supported data access frameworks, further simplifying the development process.

Transaction management framework
Unlike the Java Transaction API (JTA), the Spring Transaction Management Framework is not limited to global and nested transactions. Spring offers an abstraction mechanism for Java that enables users to:

Work with local, global, and nested transactions
Save points
Simplify transaction management across the application
The Spring Data Access Framework directly integrates with the Transaction Management Framework with support for messaging and caching. This enables developers to create feature-rich transactional systems that span across the applications without depending on EJB or JTA.

Spring MVC framework
The Spring MVC enables developers to create applications using the popular MVC pattern. It is a request-based framework that allows developers to easily create customized MVC implementations that exactly suit their needs.

The core component of Spring MVC is the DispatcherServlet class which handles user requests and then forwards them to the correct controller. This allows the controller to process the request, create the model and then provide the information to the end-user via a specified view.

Spring web service
This Spring Web Service component provides a streamlined way to create and manage web service endpoints in the application. It offers a layered approach that can be managed using XML and can be used to provide mapping for web requests to a specific object.

Spring test frameworks
Testing is a core part of any development. Spring simplifies testing within the framework with components like:

Mock objects
TestContext framework
Spring MVC Test
Etc.
(Read about test automation frameworks.)

Spring Framework Architecture
OK, we’ve looked at the core features that makes Spring an excellent framework. Now we’ll look into the architecture of Spring—the architecture that facilitates all these features.

Spring Architecture
The above diagram represents the basic components of the Spring architecture. As you can see, Spring is built using different modules that enable different functionality.

Core container
This contains the fundamental modules that are the cornerstone of the Spring framework.

Core (spring-core) is the core of the framework that power features such as Inversion of Control and dependency injection.
Beans (spring-beans) provides Beanfactory, which is a sophisticated implementation of the factory pattern.
Context (spring-context) builds on Core and Beans and provides a medium to access defined objects. ApplicationContext interface is the core part of the Context module, and the spring-context-support provides support for third-party interactions such as caching, mailing, and template engines.
SpEL (spring-expression) enables users to use the Spring Expression Language to query and manipulate the object graph at runtime.
Data access/integration
This includes the modules that are used to handle data access and transaction processing in an application.

JDBC (spring-jdbc) provides a JDBC abstraction layer that eliminates the need to separate JDBC coding when dealing with databases.
ORM (spring-orm) are integration layers for popular object-relational mapping API such as JPA, JDO Hibernate.
OXM (spring-oxm) is the abstraction layer that supports Object/XML mapping implementations like JAXB, XStream.
JMS (spring-jms) is the Java Messaging Service module that creates and consumes messages that directly integrate with the Spring messaging module.
Transaction (spring-tx) offers programmatic and declarative transaction management for classes that include special interfaces and POJOs.
Web
The Web layer relates to modules that power web-based functions in Spring.

WebSocket (spring-websocket) powers the web socket-based communication for clients and servers.
Servlet (spring-webmvc) is the Spring WebMVC module that contains the MVC and REST implementations.
Web (spring-web) provides all the basic web-oriented features and contains an HTTP client and web-related parts of the Spring remoting.
Portlet (spring-webmvc-portlet) provides the MVC implementation to be used in a portlet environment.
Other Modules
AOP (spring-aop) provides an aspect-oriented programming implementation that can be used when creating applications.
Aspects (spring-aspects) enables direct integration with the AspectJ programming extension by the eclipse foundation.
Instrumentation (spring-instrument) is the class instrumentation support and class loader implementations for application servers.
Messaging (spring-messaging) provides a robust platform to manage messaging in applications.
Test (spring-test) is the Spring test module that supports unit and integration testing with JUnit and TestNG.
Getting started with the Spring framework
Now that we understand what makes Spring a truly great framework, let’s see how to start developing a Spring project.

We will be using a Windows environment and Visual Studio Code as our IDE for the following example. First, we need Java installed on our PC. You can get the latest prebuilt open-source Java (OpenJDK) binaries from the Adoptium project. We will be using the latest LTS release at the time of writing this article which is OpenJDK 17 (LTS).

OpenJDK console

While you can always create a Spring project manually, the spring initializer (https://start.spring.io/) provides users with an easy way to configure the project using spring boot. Spring Boot is an extension of the Spring framework that enables users to create standalone Spring-based applications with minimal dependencies.

The spring initializer provides a centralized platform to easily create a Spring project with different options, including project type (Maven/Gradle), language (Java, Kotlin, Groovy), Project metadata, Packaging, Java version, and dependencies.

We will create a simple Maven Project named test_app in com.myproject group using Java and Spring Boot 2.5.5 targeting Java 17 (OpenJDK) with Spring Web as the dependency.

Spring Intializr
The above action will generate a zip file. Extract that zip file and open the folder in the IDE. Since we are using Visual Studio Code as our IDE, make sure that you have installed the appropriate VSCode extensions to support Java and Spring. Following are the recommended extensions.

Extension Pack for Java – Visual Studio Marketplace
Spring Boot Extension Pack – Visual Studio Marketplace
Navigate to the primary java file (Example :<Name>\src\main\java\com\myproject\test_app\TestAppApplication.java) and change the code as follows. It will create a simple web server that returns a greeting when a user navigates to the greetings URL.

Copy
package com.myproject.test_app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class TestAppApplication {
public static void main(String[] args) {
SpringApplication.run(TestAppApplication.class, args);
}
@GetMapping("/greeting")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("<h1>Hello %s!, This is My First Spring Project</h1>", name);
}
}
VS Code view:

Code Editor
Now we can build and execute the project by opening the terminal in the root of the project folder and running the following command.