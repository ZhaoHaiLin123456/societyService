package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.Department;

public interface DepartmentMapper {
	
	public List<Department> listDepartment(Department department);
	
	public int addDepartment(Department department);
	
	public int updateDepartment(Department department);
	
	public int deleteDepartment(Department department);
	

}
