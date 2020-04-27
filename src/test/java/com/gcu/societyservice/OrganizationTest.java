package com.gcu.societyservice;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.entity.Organization;
import com.gcu.societyservice.service.OrganizationService;

public class OrganizationTest extends BaseTest{
	
	@Autowired
	private OrganizationService organizationService;
	
	@Autowired
	private Organization org;
	
	@Test
	public void testListOrganization() {
		org.setOrgType(3);
		List<Organization> list = organizationService.listOrganization(org);
		System.out.println("===========================");
		System.out.println(list);
	}
	
	@Test
	public void testAddOrganization() {
		org.setOrgName("篮球协会");
		org.setOrgType(3);
		org.setOrgDesc("篮球协会");
		int row = organizationService.addOrganization(org);
		System.out.println(row);
	}
	
	@Test
	public void testUpdateOrganization() {
		org.setOrgId(3);
		org.setOrgType(3);
		int row = organizationService.updateOrganization(org);
		System.out.println("**************" + row);
	}
	
	@Test
	public void testDeleteOrganization() {
		org.setOrgId(4);
		int row = organizationService.deleteOrganization(org);
		System.out.println("*************" +  row);
	}
	
	

}
