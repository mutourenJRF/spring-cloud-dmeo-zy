package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumer8006Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumer8006Application.class,args);
    }
}
