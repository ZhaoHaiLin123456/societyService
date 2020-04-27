package com.gcu.societyservice.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

/**
 * 活动报名实体类
 */
@Component
public class ActivityApply implements Serializable {

	private static final long serialVersionUID = 3040150072997788160L;

	private Integer id;

	private String userId;

	private Integer activityId;

	private Integer status;

	private Timestamp date;

	public ActivityApply() {
		super();
	}

	public ActivityApply(String userId, Integer activityId, Integer status, Timestamp date) {
		super();
		this.userId = userId;
		this.activityId = activityId;
		this.status = status;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ActivityApply [id=" + id + ", userId=" + userId + ", activityId=" + activityId + ", status=" + status
				+ ", date=" + date + "]";
	}

}
