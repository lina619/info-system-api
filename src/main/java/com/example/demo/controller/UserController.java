package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@RestController
//@RequestMapping("/user")
//@CrossOrigin
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@GetMapping("/user/list")
	public List<User> list() {
		
		return userMapper.findAll();

	}
}