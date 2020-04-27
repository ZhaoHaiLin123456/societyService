package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.User;

public interface UserMapper {
	
	public List<User> listUser(User user);
	
	public int addUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(User user);

}
