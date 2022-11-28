package com.llkj.dao.Impl;

import com.llkj.dao.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapperImpl
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 11:13
 * @Version 1.0
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Override
    public boolean login(String username, String password) {
        if (username.equals("root")&&password.equals("123456")){
            System.out.println("UserMapperImpl调用");
            return true;
        }
        return false;
    }
}
