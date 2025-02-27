package com.example.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	
	@Bean
	GroupedOpenApi controllerApi(){
		return GroupedOpenApi
				.builder()
				.group("SwaggerProject-2Youtube")
				.packagesToScan("com.example.demo")
				.build();	
		
	}

}
