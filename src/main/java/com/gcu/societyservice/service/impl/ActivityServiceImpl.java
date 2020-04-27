package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.ActivityMapper;
import com.gcu.societyservice.entity.Activity;
import com.gcu.societyservice.service.ActivityService;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService{
	
	@Autowired
	private ActivityMapper mapper;
	
	@Override
	public List<Activity> listAct(Activity activity) {
		return mapper.listActivity(activity);
	}

	@Override
	public int addAct(Activity activity) {
		return mapper.addActivity(activity);
	}

	@Override
	public int updateAct(Activity activity) {
		return mapper.updateActivity(activity);
	}

	@Override
	public int deleteAct(Activity activity) {
		return mapper.deleteActivity(activity);
	}

}
