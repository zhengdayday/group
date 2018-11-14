package com.zdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dayday
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicatonClient {

    public static void main(String[] args) {
        SpringApplication.run(ApplicatonClient.class, args);
    }
}
