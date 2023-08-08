package com.rodrigo.staffregistry.application;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("API StaffRegistry")
                        .description("Api para cadastrar informações dos funcionários da empresa")
                        .contact(new Contact().name("Rodrigo Correia").email("rodrigodx52@gmail.com"))
                        .version("1.0.0"));
    }



}
