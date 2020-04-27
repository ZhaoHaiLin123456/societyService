package com.gcu.societyservice;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.ActivityType;
import com.gcu.societyservice.service.ActivityTypeService;

public class ActivityTypeTest extends BaseTest{
	
	@Autowired
	private ActivityTypeService activityTypeService;
	
	@Autowired
	private ActivityType activityType;
	
	@Test
	public void testListActivityType() {
		List<ActivityType> list = activityTypeService.listActivityType(activityType);
		System.out.println("=========================");
		System.out.println(list);
	}
	
	@Test
	public void testAddActivityType() {
		activityType.setActTypeName("艺术");
		int row = activityTypeService.addActivityType(activityType);
		System.out.println("**************" + row);
	}
	
	@Test
	public void testUpdateActivityType() {
		activityType.setActTypeId(4);
		activityType.setActTypeName("街舞");
		int row = activityTypeService.updateActivityType(activityType);
		System.out.println("**************" + row);
	}
	
	@Test
	public void testDeleteActivityType() {
		activityType.setActTypeId(4);
		int row = activityTypeService.deleteActivityType(activityType);
		System.out.println("**************" + row);
	}

}
