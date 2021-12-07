package com.example.tutorial5_publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Tutorial5PublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tutorial5PublisherApplication.class, args);
    }

}
