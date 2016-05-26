package com.bestseller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestseller.entity.User;
import com.bestseller.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	@Override
	public void createUser(User user) {
		userMapper.createUser(user);
	}
	
	
	@Override
	public User getByUserName(String userName) {
		return userMapper.getByUserName(userName);
	}
	
	
}
