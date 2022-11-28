package com.llkj.controller;

import com.llkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author qing
 * @Date 2022/11/26 11:13
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public boolean login(String account, String password) {
        System.out.println("UserController.login");
        return userService.login(account, password);
    }
}
