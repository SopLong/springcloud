package com.jc.springcloud.controller;

import com.jc.springcloud.pojo.User;
import com.jc.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("provider/user")
public class UserProviderController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     * @return
     */
    @GetMapping("list")
    public List<User> getUsers(){
        return userService.getUsers();
    }

}
