package com.persoff68.fatodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FaToDoDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaToDoDiscoveryServiceApplication.class, args);
    }

}
