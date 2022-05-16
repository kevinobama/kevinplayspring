package com.kevingates.kevinplayspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring Boot introduces the @SpringBootApplication annotation.
// This single annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class KevinplayspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KevinplayspringApplication.class, args);
	}

}
