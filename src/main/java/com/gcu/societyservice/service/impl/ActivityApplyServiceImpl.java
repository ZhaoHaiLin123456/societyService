package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.ActivityApplyMapper;
import com.gcu.societyservice.entity.ActivityApply;
import com.gcu.societyservice.service.ActivityApplyService;

@Service("activityApplyService")
public class ActivityApplyServiceImpl implements ActivityApplyService{

	@Autowired
	private ActivityApplyMapper mapper;
	
	@Override
	public List<ActivityApply> listActivityApply(ActivityApply activityApply) {
		return mapper.listActivityApply(activityApply);
	}

	@Override
	public int addActivityApply(ActivityApply activityApply) {
		return mapper.addActivityApply(activityApply);
	}

	@Override
	public int updateActivityApply(ActivityApply activityApply) {
		return mapper.updateActivityApply(activityApply);
	}

	@Override
	public int deleteActivtyApply(ActivityApply activityApply) {
		return mapper.deleteActvityApply(activityApply);
	}
	
}
