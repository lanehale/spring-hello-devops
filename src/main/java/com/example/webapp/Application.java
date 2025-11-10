package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from Spring Boot on Kubernetes!";
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}