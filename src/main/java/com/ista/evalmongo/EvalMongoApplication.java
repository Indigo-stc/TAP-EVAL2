package com.ista.evalmongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class EvalMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvalMongoApplication.class, args);
    }

}
