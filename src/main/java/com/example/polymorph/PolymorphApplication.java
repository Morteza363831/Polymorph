package com.example.polymorph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.example")
public class PolymorphApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolymorphApplication.class, args);
    }

}
