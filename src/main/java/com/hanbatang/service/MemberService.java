package com.hanbatang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.Member;
import com.hanbatang.mapper.MemberMapper;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;

	public void insertMember(Member member) {

		memberMapper.insertMember(member);
	}
	
}

