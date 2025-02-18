package com.example.gk.gk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class Swagger {
    @Bean
    OpenAPI openAPI() {
        return new OpenAPI().info(new Info()
                .title("My name Trung")
                .version("3.0.1")
        );
    }
}


