package com.gcu.societyservice;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.societyservice.dto.OrganizationNumber;
import com.gcu.societyservice.entity.Member;
import com.gcu.societyservice.service.MemberService;

public class MemberTest extends BaseTest{
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private Member member;
	
	@Test
	public void testListMember() {
		member.setOrgId(1);
		List<OrganizationNumber> list = memberService.listMember(member);
		System.out.println("***************************");
		System.out.println(list);
	}
	
	@Test
	public void testAddMember() {
		member.setOrgId(3);
		member.setUserId("201610098001");
		member.setDeptId(3);
		int row = memberService.addMember(member);
		System.out.println("*************************" + row);
	}
	
	@Test
	public void testUpdateMember() {
		member.setUserId("201610098122");
		member.setOrgId(3);
		member.setDeptId(2);
		int row = memberService.updateMember(member);
		System.out.println("*************************" + row);
	}
	
	@Test
	public void testDeleteMember() {
		member.setUserId("201610098001");
		member.setOrgId(3);
		int row = memberService.deleteMember(member);
		System.out.println(row);
	}

}
