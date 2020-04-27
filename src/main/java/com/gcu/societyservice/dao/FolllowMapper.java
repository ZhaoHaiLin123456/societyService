package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.Activity;
import com.gcu.societyservice.entity.Follow;
import com.gcu.societyservice.entity.Organization;

public interface FolllowMapper {
	
	public List<Activity> listFollowActivity(Follow follow);
	
	public List<Organization> listFollowOrganization(Follow follow);
	
	public int addFollow(Follow follow);
	
	public int updateFollow(Follow follow);
	
	public int deleteFollow(Follow follow);

}
