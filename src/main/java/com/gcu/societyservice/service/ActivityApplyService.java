package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.ActivityApply;

public interface ActivityApplyService {
	
	public List<ActivityApply> listActivityApply(ActivityApply activityApply);
	
	public int addActivityApply(ActivityApply activityApply);
	
	public int updateActivityApply(ActivityApply activityApply);
	
	public int deleteActivtyApply(ActivityApply activityApply);

}
