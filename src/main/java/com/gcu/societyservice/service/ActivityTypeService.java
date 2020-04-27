package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.ActivityType;

public interface ActivityTypeService {
	
	public List<ActivityType> listActivityType(ActivityType type);
	
	public int addActivityType(ActivityType type);
	
	public int updateActivityType(ActivityType type);

	public int deleteActivityType(ActivityType type);

}
