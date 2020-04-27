package com.gcu.societyservice;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.OrganizationType;
import com.gcu.societyservice.service.OrganizationTypeService;

public class OrganizationTypeTest extends BaseTest{
	
	@Autowired
	private OrganizationTypeService organizationTypeService;
	
	@Autowired
	private OrganizationType type;
	
	@Test
	public void testListOrgType() {
		type.setOrgTypeName("学校组织");
		List<OrganizationType> list = organizationTypeService.listOrgType(type);
		System.out.println("*******" + list);
		
	}
	
	@Test
	public void testAddOrgType() {
		type.setOrgTypeName("个体组织");
		int row = organizationTypeService.addOrgType(type);
		System.out.println("*******" + row);
		
	}
	
	@Test
	public void testUpdateOrgType() {
		type.setOrgTypeId(1);
		type.setOrgTypeName("学校组织");
		int row = organizationTypeService.updateType(type);
		System.out.println("*******" + row);
	}
	
	@Test
	public void testDeleteOrgType() {
		type.setOrgTypeId(5);
		int row = organizationTypeService.deleteType(type);
		System.out.println("*******" + row);
	}

}
