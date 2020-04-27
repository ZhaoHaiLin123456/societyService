package com.gcu.societyservice.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 活动类型实体
 */
@Component
public class ActivityType implements Serializable {

	private static final long serialVersionUID = -9150571270391955166L;

	private Integer actTypeId;

	private String actTypeName;

	public ActivityType() {
		super();
	}

	public ActivityType(String actTypeName) {
		super();
		this.actTypeName = actTypeName;
	}

	public Integer getActTypeId() {
		return actTypeId;
	}

	public void setActTypeId(Integer actTypeId) {
		this.actTypeId = actTypeId;
	}

	public String getActTypeName() {
		return actTypeName;
	}

	public void setActTypeName(String actTypeName) {
		this.actTypeName = actTypeName;
	}

	@Override
	public String toString() {
		return "ActivityType [actTypeId=" + actTypeId + ", actTypeName=" + actTypeName + "]";
	}

}
