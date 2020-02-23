package com.jc.springcloud.service;

import com.jc.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "springcloud-provider")
public interface UserService {

    @GetMapping("provider/user/list")
    List<User> list();

    @GetMapping("provider/user/getUserById/{id}")
    User getUserById(@PathVariable(name = "id") int id);
}
