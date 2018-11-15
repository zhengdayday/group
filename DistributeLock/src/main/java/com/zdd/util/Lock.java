package com.zdd.util;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 上午10:33
 * @Description: 全局锁包括锁名称
 */
public class Lock {

    private String name;

    private String value;

    public Lock(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
