package com.gcu.societyservice.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 关注实体类
 */
@Component
public class Follow implements Serializable {

	private static final long serialVersionUID = 3858006245129862764L;

	private Integer id;

	private String userId;

	private Integer orgId;

	private Integer actId;

	public Follow() {
		super();
	}

	public Follow(String userId, Integer orgId, Integer actId) {
		super();
		this.userId = userId;
		this.orgId = orgId;
		this.actId = actId;
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

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	@Override
	public String toString() {
		return "Follow [id=" + id + ", userId=" + userId + ", orgId=" + orgId + ", actId=" + actId + "]";
	}

}
