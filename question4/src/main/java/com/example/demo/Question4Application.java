package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Question4Application {

	public static void main(String[] args) {
		SpringApplication.run(Question4Application.class, args);
	}
		
		@Bean 
		public RestTemplate getrestTemplate()
		{
			return new RestTemplate();
		
	}

}
