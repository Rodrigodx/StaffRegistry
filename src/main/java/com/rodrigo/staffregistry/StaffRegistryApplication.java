package com.rodrigo.staffregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class StaffRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffRegistryApplication.class, args);
    }

}
