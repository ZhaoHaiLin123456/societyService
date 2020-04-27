package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.ActivityTypeMapper;
import com.gcu.societyservice.entity.ActivityType;
import com.gcu.societyservice.service.ActivityTypeService;

@Service("activityTypeService")
public class ActivityTypeServiceImpl implements ActivityTypeService{

	@Autowired
	private ActivityTypeMapper mapper;
	
	@Override
	public List<ActivityType> listActivityType(ActivityType type) {
		return mapper.listActivityType(type);
	}

	@Override
	public int addActivityType(ActivityType type) {
		return mapper.addActivityType(type);
	}

	@Override
	public int updateActivityType(ActivityType type) {
		return mapper.updateActivityType(type);
	}

	@Override
	public int deleteActivityType(ActivityType type) {
		return mapper.deleteActivityType(type);
	}
	

}
