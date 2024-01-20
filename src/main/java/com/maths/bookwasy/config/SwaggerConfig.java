package com.maths.bookwasy.config;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
      return new OpenAPI()
          .info(new Info().title("Gestão de Vagas").description("API responsável pela gestão de vagas").version("1"))
          .schemaRequirement("jwt_auth", creaSecurityScheme());
    }
  
    private SecurityScheme creaSecurityScheme() {
      return new SecurityScheme().name("jwt_auth").type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT");
    }
}
