package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hanbatang.dto.Members;
import com.hanbatang.service.MyPageService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MyPageController {
	@Autowired
	private MyPageService myPageService;
	
	@GetMapping("/editAddress")
	public String showEditAddress(HttpSession session, Model model) {
		Members member = (Members) session.getAttribute("loginSession");
		model.addAttribute("member", member);
		
		return "editAddress";
	}
	@PostMapping("/editAddress")
	public String modifyEditAddress(Members modifyMember, HttpSession session, Model model) {
		String modifyAddress = modifyMember.getMember_address();
		
		Members updateMember = (Members) session.getAttribute("loginSession");
		updateMember.setMember_address(modifyAddress);
		
		myPageService.updateMemberAddress(updateMember.getMember_id(), modifyAddress);
		session.setAttribute("loginSession", updateMember);
		
		model.addAttribute("msg", "주소가 성공적으로 수정되었습니다.");

		return "getMyPage";
	}
	
	
	@GetMapping("/editMember")
	public String showEditMemeber(HttpSession session, Model model) {
		Members member = (Members) session.getAttribute("loginSession");
		model.addAttribute("member", member);
		
		return "editMember";
	}
	@PostMapping("/editMember")
	public String modifyEditMember(Members modifyMember, HttpSession session, Model model) {
		Members updateMember = (Members) session.getAttribute("loginSession");
		updateMember.setMember_nickname(modifyMember.getMember_nickname());
		updateMember.setMember_name(modifyMember.getMember_name());
		updateMember.setMember_phone(modifyMember.getMember_phone());
		
		myPageService.updateMember(updateMember);
		session.setAttribute("loginSession", updateMember);
		
		model.addAttribute("msg", "회원 정보가 성공적으로 수정되었습니다.");
		
		return "getMyPage";
	}
	
	
	@GetMapping("/memberBye")
	public String showMemberBye(HttpSession session) {
		Members member = (Members) session.getAttribute("loginSession");
		
		myPageService.deleteMember(member.getMember_id());
		session.invalidate();
		
		return "memberBye";
	}
}
