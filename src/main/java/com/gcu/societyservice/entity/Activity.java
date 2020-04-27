package com.gcu.societyservice.entity;

import java.io.Serializable;
//import java.security.Timestamp;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

/**
 * 活动实体类
 */
@Component
public class Activity implements Serializable{

	private static final long serialVersionUID = -8336440552348133326L;

	private Integer actId;

	private String title;

	private Timestamp time;

	private String place;

	private Integer actType;

	private String actHost;

	private String principal;

	private String phone;

	private String actIntro;

	private String actDesc;

	private String actImg;

	private Integer followNumber;
	
	private Timestamp date;

	public Activity() {
		super();
	}

	public Activity(Integer actId, String title, Timestamp time, String place, Integer actType, String actHost,
			String principal, String phone, String actIntro, String actDesc, String actImg, Integer followNumber) {
		super();
		this.actId = actId;
		this.title = title;
		this.time = time;
		this.place = place;
		this.actType = actType;
		this.actHost = actHost;
		this.principal = principal;
		this.phone = phone;
		this.actIntro = actIntro;
		this.actDesc = actDesc;
		this.actImg = actImg;
		this.followNumber = followNumber;
	}

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getActType() {
		return actType;
	}

	public void setActType(Integer actType) {
		this.actType = actType;
	}

	public String getActHost() {
		return actHost;
	}

	public void setActHost(String actHost) {
		this.actHost = actHost;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getActIntro() {
		return actIntro;
	}

	public void setActIntro(String actIntro) {
		this.actIntro = actIntro;
	}

	public String getActDesc() {
		return actDesc;
	}

	public void setActDesc(String actDesc) {
		this.actDesc = actDesc;
	}

	public String getActImg() {
		return actImg;
	}

	public void setActImg(String actImg) {
		this.actImg = actImg;
	}

	public Integer getFollowNumber() {
		return followNumber;
	}

	public void setFollowNumber(Integer followNumber) {
		this.followNumber = followNumber;
	}
	
	

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Activity [actId=" + actId + ", title=" + title + ", time=" + time + ", place=" + place + ", actType="
				+ actType + ", actHost=" + actHost + ", principal=" + principal + ", phone=" + phone + ", actIntro="
				+ actIntro + ", actDesc=" + actDesc + ", actImg=" + actImg + ", followNumber=" + followNumber
				+ ", date=" + date + "]";
	}
}
