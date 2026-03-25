package com.smartlogix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
//    http://localhost:8761 local de Eureka
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
