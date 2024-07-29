package com.hanbatang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.Members;
import com.hanbatang.mapper.LoginMapper;

@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper;
	
	public Members getLogin(String member_id, String member_pw) {
		return loginMapper.getLogin(member_id, member_pw);
	}
	
	public Members getFindId(String member_name, String member_email) {
		return loginMapper.getFindId(member_name, member_email);
	}
	public Members getFindPw(String member_id, String member_name) {
		return loginMapper.getFindPw(member_id, member_name);
	}
	
	public void updateNewPw(String member_id, String member_name, String member_pw) {
		loginMapper.updateNewPw(member_id, member_name, member_pw);
	}
}
