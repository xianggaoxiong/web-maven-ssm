package com.bestseller.mapper;

import com.bestseller.entity.User;

public interface UserMapper {
	public void createUser(User user);
	
	public User getByUserName(String userName);
}
