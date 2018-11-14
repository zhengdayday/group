package com.zdd.config;

import com.zdd.service.ApiService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 下午2:02
 * @Description:
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生变化";
    }
}
