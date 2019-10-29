package com.marcos.microservicegallery;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	// Create a bean for RestTemplate to call services
	@Bean
	@LoadBalanced // Load balance between service instances at different ports.
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
