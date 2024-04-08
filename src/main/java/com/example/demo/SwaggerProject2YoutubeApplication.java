package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class SwaggerProject2YoutubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerProject2YoutubeApplication.class, args);
	}

}
