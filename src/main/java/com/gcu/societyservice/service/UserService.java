package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.User;

public interface UserService {
	
	public List<User> listUser(User user);
	
	public int updateUser(User user);

}
