package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.Activity;

public interface ActivityService {
	
	public List<Activity> listAct(Activity activity);
	
	public int addAct(Activity activity);//发布活动
	
	public int updateAct(Activity activity);//修改活动信息
	
	public int deleteAct(Activity activity);//删除活动

	

}
