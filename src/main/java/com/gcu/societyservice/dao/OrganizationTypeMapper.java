package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.entity.OrganizationType;

public interface OrganizationTypeMapper {
	
	public List<OrganizationType> listOrgType(OrganizationType type);
	
	public int addOrgType(OrganizationType type);
	
	public int updateOrgType(OrganizationType type);
	
	public int deleteOrgType(OrganizationType type);

}
