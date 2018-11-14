package com.zdd.service;

import com.zdd.config.ApiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 上午11:01
 * @Description:
 */
@FeignClient(value = "eurekaclient", fallback = ApiServiceError.class)
public interface ApiService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index();
}
