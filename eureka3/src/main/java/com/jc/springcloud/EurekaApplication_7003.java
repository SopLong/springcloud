package com.jc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //激活eureka服务端
public class EurekaApplication_7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7003.class, args);
    }
}
