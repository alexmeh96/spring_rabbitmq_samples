package com.example.tutorial4_publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Tutorial4PublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tutorial4PublisherApplication.class, args);
    }

}
