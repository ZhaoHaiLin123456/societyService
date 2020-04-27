package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.DepartmentMapper;
import com.gcu.societyservice.entity.Department;
import com.gcu.societyservice.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentMapper mapper;
	
	@Override
	public List<Department> listDept(Department dept) {
		return mapper.listDepartment(dept);
	}

	@Override
	public int addDept(Department dept) {
		return mapper.addDepartment(dept);
	}

	@Override
	public int updateDept(Department dept) {
		return mapper.updateDepartment(dept);
	}

	@Override
	public int deleteDept(Department dept) {
		return mapper.deleteDepartment(dept);
	}

}
