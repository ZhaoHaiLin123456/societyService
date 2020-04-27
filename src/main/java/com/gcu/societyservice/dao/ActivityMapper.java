package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.Activity;

public interface ActivityMapper {
	
	public List<Activity> listActivity(Activity activity);
	
	public int addActivity(Activity activity);
	
	public int updateActivity(Activity activity);
	
	public int deleteActivity(Activity activity);

}
