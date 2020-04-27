package com.gcu.societyservice;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.Department;
import com.gcu.societyservice.service.DepartmentService;

public class DepartmentTest extends BaseTest{
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private Department dept;
	
	@Test
	public void testListDept() {
		dept.setDeptName("宣传部");
		List<Department> list = departmentService.listDept(dept);
		System.out.println("============================");
		System.out.println(list);
	}
	
	@Test
	public void testAddDept() {
		dept.setDeptName("策划部");
		int row = departmentService.addDept(dept);
		System.out.println("****************" + row);
	}
	
	@Test
	public void testUpdateDept() {
		dept.setDeptName("公关部");
		dept.setDeptId(5);
		int row = departmentService.updateDept(dept);
		System.out.println("****************" + row);
	}
	
	@Test
	public void testDeleteDept() {
		dept.setDeptId(4);
		int row = departmentService.deleteDept(dept);
		System.out.println("****************" + row);
	}

}
