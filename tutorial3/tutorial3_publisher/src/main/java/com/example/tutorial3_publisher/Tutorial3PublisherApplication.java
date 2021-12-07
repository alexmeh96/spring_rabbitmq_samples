package com.example.tutorial3_publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Tutorial3PublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tutorial3PublisherApplication.class, args);
    }

}
