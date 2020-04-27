package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.OrganizationMapper;
import com.gcu.societyservice.entity.Organization;
import com.gcu.societyservice.service.OrganizationService;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService{

	@Autowired
	private OrganizationMapper mapper;
	@Override
	public List<Organization> listOrganization(Organization org) {
		return mapper.listOrganization(org);
	}

	@Override
	public int addOrganization(Organization org) {
		return mapper.addOrganization(org);
	}

	@Override
	public int updateOrganization(Organization org) {
		return mapper.updateOrganization(org);
	}

	@Override
	public int deleteOrganization(Organization org) {
		return mapper.deleteOrganization(org);
	}

}
