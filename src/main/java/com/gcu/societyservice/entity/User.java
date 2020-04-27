package com.gcu.societyservice.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

/**
 * 用户实体类
 */
@Component
public class User implements Serializable {

	private static final long serialVersionUID = -3222195513220131869L;

	private String userId;

	private String userName;

	private String password;

	// 头像存储路径
	private String userImg;

	private String birth;

	private String grade;

	private String college;

	private String cls;

	private String address;

	private String phone;

	private String qq;

	private String wechat;

	private String buildingNumber;

	private Integer userType;

	private Integer orgId;

	private Timestamp lastLoginTime;

	public User() {
		super();
	}
	
	public User(String userId, String userName, String password, String userImg, String birth, String grade,
			String college, String cls, String address, String phone, String qq, String wechat, String buildingNumber,
			Integer userType, Integer orgId, Timestamp lastLoginTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userImg = userImg;
		this.birth = birth;
		this.grade = grade;
		this.college = college;
		this.cls = cls;
		this.address = address;
		this.phone = phone;
		this.qq = qq;
		this.wechat = wechat;
		this.buildingNumber = buildingNumber;
		this.userType = userType;
		this.orgId = orgId;
		this.lastLoginTime = lastLoginTime;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	
	

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userImg=" + userImg
				+ ", birth=" + birth + ", grade=" + grade + ", college=" + college + ", cls=" + cls + ", address="
				+ address + ", phone=" + phone + ", qq=" + qq + ", wechat=" + wechat + ", buildingNumber="
				+ buildingNumber + ", userType=" + userType + ", orgId=" + orgId + ", lastLoginTime=" + lastLoginTime
				+ "]";
	}
	
	
}
