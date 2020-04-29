package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client8002MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(Client8002MainApplication.class,args);
    }
}
