package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.ActivityType;

public interface ActivityTypeMapper {
	
	public List<ActivityType> listActivityType(ActivityType activityType);
	
	public int addActivityType(ActivityType activityType);
	
	public int updateActivityType(ActivityType activityType);
	
	public int deleteActivityType(ActivityType activityType);

}
