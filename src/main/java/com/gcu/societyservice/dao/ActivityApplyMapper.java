package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.ActivityApply;

public interface ActivityApplyMapper {

	public List<ActivityApply> listActivityApply(ActivityApply activityApply);
	
	public int addActivityApply(ActivityApply activityApply);
	
	public int updateActivityApply(ActivityApply activityApply);
	
	public int deleteActvityApply(ActivityApply activityApply);
}
