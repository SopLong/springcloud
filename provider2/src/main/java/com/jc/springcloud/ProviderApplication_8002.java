package com.jc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jc.springcloud.mapper")
public class ProviderApplication_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication_8002.class, args);
    }
}
