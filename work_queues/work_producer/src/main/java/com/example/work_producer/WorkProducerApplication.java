package com.example.work_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WorkProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkProducerApplication.class, args);
    }

}
