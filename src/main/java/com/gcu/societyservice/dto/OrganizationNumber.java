package com.gcu.societyservice.dto;

import org.springframework.stereotype.Component;

@Component
public class OrganizationNumber {

	private String userId;

	private String userName;

	private String deptName;

	private String phone;

	private String qq;

	private String wechat;

	private String buildingNumber;

	private String college;

	private String cls;

	private String birth;

	private Integer deptId;

	private Integer orgId;

	public OrganizationNumber() {
		super();
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

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	@Override
	public String toString() {
		return "OrganizationNumber [userId=" + userId + ", userName=" + userName + ", deptName=" + deptName + ", phone="
				+ phone + ", qq=" + qq + ", wechat=" + wechat + ", buildingNumber=" + buildingNumber + ", college="
				+ college + ", cls=" + cls + ", birth=" + birth + ", deptId=" + deptId + ", orgId=" + orgId + "]";
	}
}
