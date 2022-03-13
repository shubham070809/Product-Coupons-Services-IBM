package com.example.coupongenerationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoupongenerationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoupongenerationServiceApplication.class, args);
    }

}
