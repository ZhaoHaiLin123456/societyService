package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.OrganizationTypeMapper;
import com.gcu.societyservice.entity.OrganizationType;
import com.gcu.societyservice.service.OrganizationTypeService;

@Service("organizationTypeService")
public class OrganizationTypeServiceImpl implements OrganizationTypeService{

	@Autowired
	private OrganizationTypeMapper mapper;
	
	@Override
	public List<OrganizationType> listOrgType(OrganizationType type) {
		return mapper.listOrgType(type);
	}

	@Override
	public int addOrgType(OrganizationType type) {
		return mapper.addOrgType(type);
	}

	@Override
	public int updateType(OrganizationType type) {
		return mapper.updateOrgType(type);
	}

	@Override
	public int deleteType(OrganizationType type) {
		return mapper.deleteOrgType(type);
	}
	

}
