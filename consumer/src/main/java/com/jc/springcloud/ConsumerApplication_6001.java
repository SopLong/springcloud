package com.jc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.jc.springcloud"})
public class ConsumerApplication_6001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication_6001.class, args);
    }
}
