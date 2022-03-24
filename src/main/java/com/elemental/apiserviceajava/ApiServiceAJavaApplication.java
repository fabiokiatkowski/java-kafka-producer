package com.elemental.apiserviceajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ApiServiceAJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiServiceAJavaApplication.class, args);
    }

}
