package com.helloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
	/**
	 * This is the main method of the application. It starts the Spring Boot application.
	 *
	 * @param args An array of command-line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
