package com.llkj.dao;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 11:13
 * @Version 1.0
 */
public interface UserMapper {
    boolean login(String username ,String password);
}
