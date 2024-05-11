package com.example.ordercli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example.ordercli"})
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients("com.example.ordercli")
public class OrderCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderCliApplication.class, args);
    }

}
