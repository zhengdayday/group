package com.zdd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 上午9:48
 * @Description: Hello Controller
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index() {
        return "Hello World!,端口:" + port;
    }
}
