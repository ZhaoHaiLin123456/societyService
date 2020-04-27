package com.gcu.societyservice.service;

import java.util.List;

import com.gcu.societyservice.dto.OrganizationNumber;
import com.gcu.societyservice.entity.Member;

public interface MemberService {
	
	public List<OrganizationNumber> listMember(Member member);
	
	public int addMember(Member member);
	
	public int updateMember(Member member);
	
	public int deleteMember(Member member);

}
