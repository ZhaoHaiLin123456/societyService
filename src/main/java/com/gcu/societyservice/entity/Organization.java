package com.gcu.societyservice.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 社团实体类
 */
@Component
public class Organization implements Serializable {

	private static final long serialVersionUID = -7376131191676413602L;

	private Integer orgId;

	private String orgName;

	private Integer orgType;

	private String orgDesc;
	
	private String orgImg;

	public Organization() {
		super();
	}

	public Organization(String orgName, Integer orgType, String orgDesc, String orgImg) {
		super();
		this.orgName = orgName;
		this.orgType = orgType;
		this.orgDesc = orgDesc;
		this.orgImg = orgImg;
	}
	
	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Integer getOrgType() {
		return orgType;
	}

	public void setOrgType(Integer orgType) {
		this.orgType = orgType;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
	
	public String getOrgImg() {
		return orgImg;
	}

	public void setOrgImg(String orgImg) {
		this.orgImg = orgImg;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", orgType=" + orgType + ", orgDesc=" + orgDesc
				+ ", orgImg=" + orgImg + "]";
	}

}
