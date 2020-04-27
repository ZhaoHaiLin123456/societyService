package com.gcu.societyservice.entity;

import org.springframework.stereotype.Component;

/**
 * 社团成员实体类
 */
@Component
public class Member {

	private Integer id;

	private String userId;

	private Integer orgId;

	private Integer deptId;

	public Member() {
		super();
	}

	public Member(String userId, Integer orgId, Integer deptId) {
		super();
		this.userId = userId;
		this.orgId = orgId;
		this.deptId = deptId;
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

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", userId=" + userId + ", orgId=" + orgId + ", deptId=" + deptId + "]";
	}

}
