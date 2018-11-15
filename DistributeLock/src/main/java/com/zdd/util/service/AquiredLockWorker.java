package com.zdd.util.service;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 上午11:09
 * @Description: 获取锁后的处理
 */
public interface AquiredLockWorker<T> {

    T invokeAfterLockAquire() throws Exception;
}
