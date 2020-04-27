package com.gcu.societyservice.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 社团类型实体类
 */
@Component
public class OrganizationType implements Serializable {

	private static final long serialVersionUID = 4718585981220019409L;

	private Integer orgTypeId;

	private String orgTypeName;

	public OrganizationType() {
		super();
	}

	public OrganizationType(String orgTypeName) {
		super();
		this.orgTypeName = orgTypeName;
	}

	public Integer getOrgTypeId() {
		return orgTypeId;
	}

	public void setOrgTypeId(Integer orgTypeId) {
		this.orgTypeId = orgTypeId;
	}

	public String getOrgTypeName() {
		return orgTypeName;
	}

	public void setOrgTypeName(String orgTypeName) {
		this.orgTypeName = orgTypeName;
	}

	@Override
	public String toString() {
		return "OrganizationType [orgTypeId=" + orgTypeId + ", orgTypeName=" + orgTypeName + "]";
	}

}
