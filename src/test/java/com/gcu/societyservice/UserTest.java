package com.gcu.societyservice;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.User;
import com.gcu.societyservice.service.UserService;

public class UserTest extends BaseTest{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private User user;
	
	@Test
	public void testListUser() {
		user.setUserId("201610098001");
		user.setPassword("123456");
		user.setUserType(1);
		List<User> list = userService.listUser(user);
		System.out.println("=======================");
		System.out.println(list);
	}
	
	@Test
	public void testUpdateUser() {
		user.setUserId("201610098001");
		user.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
		System.out.println(user);
		int row = userService.updateUser(user);
		System.out.println("************" + row);
	}
	

}
