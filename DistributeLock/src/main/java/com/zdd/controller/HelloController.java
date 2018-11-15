package com.zdd.controller;


import com.zdd.util.service.DistributedLocker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 上午10:55
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private DistributedLocker distributedLocker;

    @RequestMapping("index")
    public String index() throws Exception{
        distributedLocker.lock("test", () -> threadRun());
        return "hello world!";
    }

    public Object threadRun() {
        try {
            System.out.println("执行方法！");
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
