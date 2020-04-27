package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.FolllowMapper;
import com.gcu.societyservice.entity.Activity;
import com.gcu.societyservice.entity.Follow;
import com.gcu.societyservice.entity.Organization;
import com.gcu.societyservice.service.FollowService;

@Service("followService")
public class FollowServiceImpl implements FollowService{

	@Autowired
	private FolllowMapper mapper;
	
	@Override
	public List<Activity> listFollowActivity(Follow follow) {
		return mapper.listFollowActivity(follow);
	}
	
	@Override
	public List<Organization> listFollowOrganization(Follow follow) {
		return mapper.listFollowOrganization(follow);
	}

	@Override
	public int addFollow(Follow follow) {
		return mapper.addFollow(follow);
	}

	@Override
	public int updateFollow(Follow follow) {
		return mapper.updateFollow(follow);
	}

	@Override
	public int deleteFollow(Follow follow) {
		return mapper.deleteFollow(follow);
	}

	
	
	

}
