package com.zdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 上午9:55
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApplicationZull {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZull.class, args);
    }
}
