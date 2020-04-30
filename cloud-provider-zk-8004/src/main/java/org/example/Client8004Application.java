package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//用于zookeeper和consul作为注册中心的时注册服务
public class Client8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Client8004Application.class,args);
    }
}
