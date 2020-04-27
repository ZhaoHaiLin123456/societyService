package com.gcu.societyservice.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 部门实体类
 */
@Component
public class Department implements Serializable {

	private static final long serialVersionUID = -201643307198663527L;

	private Integer deptId;

	private String deptName;

	public Department() {
		super();
	}

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
