package com.smartlogix.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {
//    http://localhost:8080/swagger-ui/index.html
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
