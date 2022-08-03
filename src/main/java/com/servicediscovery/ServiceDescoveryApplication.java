package com.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
Preciso indicar que eu vou trabalhar com o EurekaServer,
por isso incluo a anotação @EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDescoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDescoveryApplication.class, args);
    }

}
