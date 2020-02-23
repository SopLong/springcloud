package com.jc.springcloud.controller;

import com.jc.springcloud.pojo.User;
import com.jc.springcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
     *
     * @return
     */
    @GetMapping("list")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("getUserById/{id}")
//    @HystrixCommand(fallbackMethod = "hystrixGetUser") //一旦服务调用失败,就调用【hystrixGetUser】方法
    public User getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        if (null == user) {
            throw new RuntimeException("不存在id =>" + id + "对应的用户信息");
        }
        return user;
    }

    public User hystrixGetUser(@PathVariable("id") int id) {
        User user = new User(Long.parseLong(String.valueOf(id)), "不存在该用户", "");
        return user;
    }

}
