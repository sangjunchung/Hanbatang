package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hanbatang.dto.Member;
import com.hanbatang.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	

	@GetMapping("/memberSign")
	public String registerForm(Model model) {
		model.addAttribute("mem", new Member());
		return "/memberSign";
	}
	
	@PostMapping("/register")
	public String insertMember(Member member, Model model) {
		memberService.insertMember(member);
		model.addAttribute("msg", "한바탕 회원가입을 축하합니다!");
		return"success";
	}
	
	
}
