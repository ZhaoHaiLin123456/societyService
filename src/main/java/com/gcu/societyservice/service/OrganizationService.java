package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.Organization;

public interface OrganizationService {
	
	public List<Organization> listOrganization(Organization org);
	
	public int addOrganization(Organization org);
	
	public int updateOrganization(Organization org);
	
	public int deleteOrganization(Organization org);

}
