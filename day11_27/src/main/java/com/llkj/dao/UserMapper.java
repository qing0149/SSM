package com.llkj.dao;

import com.llkj.pojo.User;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/27 17:10
 * @Version 1.0
 */

public interface UserMapper {
    User Login(User user);

    Integer InsertAccount(User user);

    Integer UpdateAccountByName(String name, String password);

    Integer DeleteAccountByName(String name);

    List<User> QueryAllAccount();
}
