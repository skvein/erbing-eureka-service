package com.erbing.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErbingEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErbingEurekaServiceApplication.class, args);
    }

}
