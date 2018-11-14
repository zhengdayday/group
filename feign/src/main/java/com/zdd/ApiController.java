package com.zdd;

import com.zdd.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-14 下午2:05
 * @Description: 服务异常处理
 */
@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index() {
        return apiService.index();
    }
}
