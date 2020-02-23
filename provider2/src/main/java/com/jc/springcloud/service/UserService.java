package com.jc.springcloud.service;

import com.baomidou.mybatisplus.service.IService;
import com.jc.springcloud.pojo.User;

import java.util.List;

public interface UserService extends IService<User> {

    /**
     * 获取用户列表
     * @return
     */
    List<User> getUsers();
}
