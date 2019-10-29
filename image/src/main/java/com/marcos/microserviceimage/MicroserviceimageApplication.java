package com.marcos.microserviceimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceimageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceimageApplication.class, args);
	}

}
