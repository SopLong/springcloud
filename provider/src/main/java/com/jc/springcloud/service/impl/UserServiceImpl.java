package com.jc.springcloud.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jc.springcloud.mapper.UserMapper;
import com.jc.springcloud.pojo.User;
import com.jc.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectList(new EntityWrapper<User>());
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectById(id);
    }
}
