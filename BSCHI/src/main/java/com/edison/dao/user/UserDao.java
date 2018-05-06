package com.edison.dao.user;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.edison.entity.User;

public interface UserDao {

    //添加用户  
    public void addUser(User user);  
      
    //根据用户名和密码查询用户  
    //注解的两个参数会自动封装成map集合，括号内即为键  
    public User findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
    
    public User findUserByName(String name);
    
    public void resetUserPassword(@Param("name")String name, @Param("password")String password);
}
