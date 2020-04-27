package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.UserMapper;
import com.gcu.societyservice.entity.User;
import com.gcu.societyservice.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<User> listUser(User user) {
		return mapper.listUser(user);
	}

	@Override
	public int updateUser(User user) {
		return mapper.updateUser(user);
	}

}
