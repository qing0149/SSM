package com.llkj.service.Impl;

import com.llkj.dao.UserMapper;
import com.llkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 11:08
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(String username, String password) {
        System.out.println("UserServiceImpl调用");
        if (!username.isEmpty() && !password.isEmpty()) {
            boolean login = userMapper.login(username, password);
            return login;
        }
        return false;
    }
}
