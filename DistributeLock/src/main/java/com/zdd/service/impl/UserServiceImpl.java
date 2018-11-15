package com.zdd.service.impl;

import com.zdd.entiry.User;
import com.zdd.service.UserService;
import com.zdd.util.test01.UserMapper1;
import com.zdd.util.test02.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 下午2:03
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper1 userMapper1;

    @Autowired
    private UserMapper2 userMapper2;

    @Override
    public void addUser(User user) {
        userMapper1.addUser(user.getName(), user.getAge());
        userMapper2.addUser(user.getName(), user.getAge());
    }
}
