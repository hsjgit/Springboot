package com.xiaojia.service;

import com.xiaojia.bean.User;
import com.xiaojia.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 黄仕杰 on 2019/3/9.
 */
@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selece(String username,String password) {
        return userMapper.select(username, password);
    }
}
