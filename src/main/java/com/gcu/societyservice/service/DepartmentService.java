package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.Department;

public interface DepartmentService {
	
	public List<Department> listDept(Department dept);
	
	public int addDept(Department dept);
	
	public int updateDept(Department dept);
	
	public int deleteDept(Department dept);

}
