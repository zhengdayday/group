package com.zdd.util.test01;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: zhengtiantian
 * @Date: 18-11-15 下午1:57
 * @Description:
 */
@Mapper
public interface UserMapper1 {
    @Insert("insert into test_user(name,age) values(#{name},#{age})")
    void addUser(@Param("name") String name, @Param("age") int age);
}
