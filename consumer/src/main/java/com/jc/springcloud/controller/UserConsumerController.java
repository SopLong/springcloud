package com.jc.springcloud.controller;

import com.jc.springcloud.pojo.User;
import com.jc.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    //使用ribbon后，不在使用根据地址和端口号调用，而是直接根据微服务名调用
//    private static final String REST_URL_PERFIX = "http://localhost:8001";
//    private static final String REST_URL_PERFIX = "http://springcloud-provider/";

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public List<User> getUsers() {
        return userService.list();
//        return restTemplate.getForObject(REST_URL_PERFIX + "provider/user/list", List.class);
    }

    @GetMapping("getUserById/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
}
