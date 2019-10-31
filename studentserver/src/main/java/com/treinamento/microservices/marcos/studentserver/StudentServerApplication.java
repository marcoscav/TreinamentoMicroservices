package com.treinamento.microservices.marcos.studentserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.treinamento.microservices.marcos.studentserver.services", "com.treinamento.microservices.marcos.studentserver.controllers"})
@EnableJpaRepositories("com.treinamento.microservices.marcos.studentserver.repositories")
public class StudentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServerApplication.class, args);
	}

}
