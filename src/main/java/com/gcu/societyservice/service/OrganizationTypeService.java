package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.entity.OrganizationType;

public interface OrganizationTypeService {
	
	public List<OrganizationType> listOrgType(OrganizationType type);
	
	public int addOrgType(OrganizationType type);
	
	public int updateType(OrganizationType type);
	
	public int deleteType(OrganizationType type);

}
