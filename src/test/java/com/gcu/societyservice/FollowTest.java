package com.gcu.societyservice;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.Activity;
import com.gcu.societyservice.entity.Follow;
import com.gcu.societyservice.entity.Organization;
import com.gcu.societyservice.service.FollowService;

public class FollowTest extends BaseTest{
	
	@Autowired
	private FollowService followService;
	
	@Autowired
	private Follow follow;
	@Test
	public void testListFollowActivity() {
		follow.setUserId("201610098001");
		List<Activity> list = followService.listFollowActivity(follow);
		System.out.println(list);
	}
	
	@Test
	public void testListFollowOrganization() {
		follow.setUserId("201610098122");
		List<Organization> list = followService.listFollowOrganization(follow);
		System.out.println(list);
	}
	
	@Test
	public void testAddFollow() {
		follow.setUserId("201610098122");
		follow.setActId(1);
		int row = followService.addFollow(follow);
		System.out.println("*****************" + row);
	}
	
	@Test
	public void testDeleteFollow() {
		follow.setUserId("201610098122");
		follow.setActId(1);;
		int row = followService.deleteFollow(follow);
		System.out.println("*****************" + row);
		
	}

}
