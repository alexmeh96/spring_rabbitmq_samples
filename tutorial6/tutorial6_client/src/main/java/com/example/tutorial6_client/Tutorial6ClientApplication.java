package com.example.tutorial6_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Tutorial6ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tutorial6ClientApplication.class, args);
    }

}
