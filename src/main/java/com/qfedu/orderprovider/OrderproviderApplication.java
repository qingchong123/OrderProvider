package com.qfedu.orderprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //标记这是一个Eureka的客户端 实现服务的发布 提供者
public class OrderproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderproviderApplication.class, args);
    }

}

