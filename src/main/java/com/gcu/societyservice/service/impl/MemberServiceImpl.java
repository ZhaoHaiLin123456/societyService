package com.gcu.societyservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.societyservice.dao.OrganizationNumberMapper;
import com.gcu.societyservice.dto.OrganizationNumber;
import com.gcu.societyservice.entity.Member;
import com.gcu.societyservice.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private OrganizationNumberMapper mapper;
	
	@Override
	public List<OrganizationNumber> listMember(Member member) {
		return mapper.listOrgNumber(member);
	}

	@Override
	public int addMember(Member member) {
		return mapper.addOrgNumber(member);
	}

	@Override
	public int updateMember(Member member) {
		return mapper.updateNumber(member);
	}

	@Override
	public int deleteMember(Member member) {
		return mapper.deleteNumber(member);
	}

}
