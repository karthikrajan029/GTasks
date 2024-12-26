package com.demo.thymeleaf;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThymeleafdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

}
