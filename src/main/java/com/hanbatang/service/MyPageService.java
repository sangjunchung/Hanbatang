package com.hanbatang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.Members;
import com.hanbatang.mapper.MyPageMapper;

@Service
public class MyPageService {
	@Autowired
	private MyPageMapper myPageMapper;
	
	public void updateMemberAddress(String member_id, String member_address) {
		myPageMapper.updateMemberAddress(member_id, member_address);
	}
	
	public void updateMember(Members updateMember) {
		myPageMapper.updateMember(updateMember);
	}
	
	public void deleteMember(String member_id) {
		myPageMapper.deleteMember(member_id);
	}
}
