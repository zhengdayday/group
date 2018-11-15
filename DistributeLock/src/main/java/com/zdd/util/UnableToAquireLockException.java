package com.zdd.util;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 上午11:12
 * @Description: 异常类
 */
public class UnableToAquireLockException extends RuntimeException {

    public UnableToAquireLockException() {
    }

    public UnableToAquireLockException(String message) {
        super(message);
    }

    public UnableToAquireLockException(String message, Throwable cause) {
        super(message, cause);
    }
}
