package com.zdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 上午9:53
 * @Description:
 */
@SpringBootApplication
@EnableZipkinServer
public class ApplicationZipkin {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZipkin.class, args);
    }
}
