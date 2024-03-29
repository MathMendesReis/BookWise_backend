package com.maths.bookwasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Bookwasy", description = "", version = "1"))
public class BookwasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookwasyApplication.class, args);
	}

}
