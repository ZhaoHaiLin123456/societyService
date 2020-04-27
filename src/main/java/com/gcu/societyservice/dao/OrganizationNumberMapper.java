package com.gcu.societyservice.dao;

import java.util.List;

import com.gcu.societyservice.dto.OrganizationNumber;
import com.gcu.societyservice.entity.Member;

public interface OrganizationNumberMapper {
	
	public List<OrganizationNumber> listOrgNumber(Member member);
	
	public int addOrgNumber(Member member);
	
	public int updateNumber(Member member);
	
	public int deleteNumber(Member member);

}
