package co.edu.javeriana.as.boot.spring.personapp.rest;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSpringBootApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${spring.application.name}") String appName,
                                 @Value("${spring.application.description}") String description) {
        return new OpenAPI().components(new Components()).info(new Info().title(appName).description(description));
    }
}
