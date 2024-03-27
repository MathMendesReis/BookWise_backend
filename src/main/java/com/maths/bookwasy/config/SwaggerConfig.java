package com.maths.bookwasy.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

public class SwaggerConfig {
  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .info(new Info().title("Book wase").description("").version("1"))
        .servers(Collections.singletonList(new Server().url("http://www.example.com")))
        .schemaRequirement("jwt_auth", creaSecurityScheme());
  }

  private SecurityScheme creaSecurityScheme() {
    return new SecurityScheme().name("jwt_auth").type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT");
  }
}
