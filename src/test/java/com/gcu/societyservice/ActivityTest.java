package com.gcu.societyservice;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.Activity;
import com.gcu.societyservice.service.ActivityService;

public class ActivityTest extends BaseTest{

	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private Activity activity;
//通过	
	@Test
	public void testListAct() {
//		activity.setActId(2);
		activity.setActType(3);
		List<Activity> list = activityService.listAct(activity);
		System.out.println("查询结果" + list);
	}
	
	@Test
	public void testAddAct(){
		java.sql.Timestamp dateTime =new java.sql.Timestamp(1000000000);
		activity.setTitle("Ps设计大赛");
		activity.setTime(dateTime);
		activity.setPlace("B-404");
		activity.setActType(1);
		activity.setActHost("计算机学院团委秘书部");
		activity.setPrincipal("梁浩瀚");
		activity.setPhone("5208208820");
		activity.setActIntro("该活动可以锻炼你们美感，还可以展现出你们非凡的电脑技术。");
		activity.setActDesc("该活动可以锻炼你们美感，还可以展现出你们非凡的电脑技术。");
		activity.setActImg("www.baidu.cn.pic");
		activity.setFollowNumber(100);
		activity.setTime(new Timestamp(System.currentTimeMillis()));
		int row = activityService.addAct(activity);
		System.out.println("添加结果" + row + activity.toString());
	}
	
	
	@Test
	public void testUpdateAct(){
		java.sql.Timestamp dateTime =new java.sql.Timestamp(1000000000);
		activity.setActId(2);
		activity.setTitle("Ps设计大赛");
		activity.setTime(dateTime);
		activity.setPlace("B-404");
		activity.setActType(1);
		activity.setActHost("梁浩瀚1221");
		activity.setPrincipal("计算机学院团委秘书部");
		activity.setPhone("5208208820");
		activity.setActIntro("该活动可以锻炼你们美感，还可以展现出你们非凡的电脑技术。");
		activity.setActDesc("该活动可以锻炼你们美感，还可以展现出你们非凡的电脑技术。");
		activity.setActImg("www.baidu.cn.pic");
		activity.setFollowNumber(100);
		activity.setDate(new Timestamp(System.currentTimeMillis()));
		int row = activityService.updateAct(activity);
		System.out.println("修改结果：" + row + activity.toString());
		
	}
	
//通过
	@Test
	public void testDeleteAct(){
		activity.setActId(2);
		int row = activityService.deleteAct(activity);
		System.out.println("刪除结果：" + row + activity.toString());
		
	}
	
	
	public static void main(String[] args) {
		ActivityTest one = new  ActivityTest();
		one.testAddAct();
	}
	
}
