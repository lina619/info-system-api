package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void add(User user){
        userMapper.add(user);
    }

    public void delete(Long id){
        userMapper.delete(id);
    }

    public void update(User user){
        userMapper.update(user);
    }
}
