package com.gcu.societyservice;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.ActivityApply;
import com.gcu.societyservice.service.ActivityApplyService;

public class ActivityApplyTest extends BaseTest{
	
	@Autowired
	private ActivityApplyService activityApplyService;
	
	@Autowired
	private ActivityApply activityApply;
	
	@Test
	public void testListActivityApply() {
		activityApply.setActivityId(1);
		activityApply.setUserId("201610098001");
		activityApply.setStatus(1);;
		List<ActivityApply> list = activityApplyService.listActivityApply(activityApply);
		System.out.println("================================");
		System.out.println(list);
	}
	
	@Test
	public void testAddActivityApply() {
		activityApply.setUserId("201610098001");
		activityApply.setActivityId(1);
		activityApply.setStatus(0);
		activityApply.setDate(new Timestamp(System.currentTimeMillis()));
		int row = activityApplyService.addActivityApply(activityApply);
		System.out.println("=======================" + row);
	}
	
	@Test
	public void testUpdateActivityApply() {
		activityApply.setUserId("201610098001");
		activityApply.setActivityId(1);
		activityApply.setStatus(1);
		activityApply.setDate(new Timestamp(System.currentTimeMillis()));
		int row = activityApplyService.updateActivityApply(activityApply);
		System.out.println("=======================" + row);
	}
	
	@Test
	public void testdeleteActivityApply() {
		activityApply.setUserId("201610098122");
		activityApply.setActivityId(1);
		int row = activityApplyService.deleteActivtyApply(activityApply);
		System.out.println("======================" + row);
	}

}
