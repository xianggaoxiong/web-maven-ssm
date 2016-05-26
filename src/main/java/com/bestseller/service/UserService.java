package com.bestseller.service;

import com.bestseller.entity.User;

public interface UserService {
	public void createUser(User user);
	public User getByUserName(String userName);
}
