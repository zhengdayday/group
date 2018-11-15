package com.zdd.controller;

import com.zdd.util.DistributedLockHandler;
import com.zdd.util.Lock;
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
    private DistributedLockHandler distributedLockHandler;

    @RequestMapping("index")
    public String index() {
        Lock lock = new Lock("ztt", "min");
        if (distributedLockHandler.tryLock(lock)) {
            try {
                System.out.print("执行方法");
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            distributedLockHandler.releaseLock(lock);
        }
        return "hello world";
    }
}
