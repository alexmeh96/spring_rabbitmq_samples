package com.example.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean
    public Sender sender() {
        return new Sender();
    }
}