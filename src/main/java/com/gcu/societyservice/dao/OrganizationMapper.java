package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.Organization;

public interface OrganizationMapper {
	
	public List<Organization> listOrganization(Organization org);
	
	public int addOrganization(Organization org);
	
	public int updateOrganization(Organization org);
	
	public int deleteOrganization(Organization org);
}
