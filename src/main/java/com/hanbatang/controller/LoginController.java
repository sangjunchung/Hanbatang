package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbatang.dto.Members;
import com.hanbatang.service.EmailService;
import com.hanbatang.service.LoginService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("mem", new Members());
		return "login";
	}
	
	@PostMapping("/login")
	public String getLogin(Model model,
			@RequestParam("member_id") String member_id,
			@RequestParam("member_pw") String member_pw,
			HttpSession session, HttpServletResponse response) {
		
		Members member = loginService.getLogin(member_id, member_pw);
		
		if(member != null) {
			session.setAttribute("loginSession", member);
			return "mainPage";
		} else {
			model.addAttribute("msg", "로그인에 실패하였습니다. 다시 입력해주세요.");
			model.addAttribute("mem", new Members());
			
			return "login";
		}
	}
	
	@GetMapping("/findId")
	public String findIdPage(Model model) {
		model.addAttribute("mem", new Members());
		return "findId";
	}
	
	@PostMapping("/findId")
	public String getFindId(Model model,
			@RequestParam("member_name") String member_name,
			@RequestParam("member_email") String member_email,
			HttpSession session) {
		
		Members member = loginService.getFindId(member_name, member_email);

		if(member != null) {
			model.addAttribute("msg", "회원님의 아이디는 : "+member.getMember_id()+" 입니다.");
		} else {
			model.addAttribute("msg", "일치하는 회원이 없습니다. 다시 입력해주세요.");
		}
		model.addAttribute("mem", new Members());
		
		return "findId";
	}
	
	@GetMapping("/findPw")
	public String findPwPage(Model model) {
		model.addAttribute("mem", new Members());
		return "findPw";
	}
	
	@PostMapping("/findPw")
	public String getFindPw(Model model,
			@RequestParam("member_id") String member_id,
			@RequestParam("member_name") String member_name,
			HttpSession session) {
		
		Members member = loginService.getFindPw(member_id, member_name);

		if(member != null) {
			int number = emailService.sendMail("wjtkwn19@gmail.com", 1);
			loginService.updateNewPw(member_id, member_name, Integer.toString(number));
			model.addAttribute("msg", "회원님의 임시 비밀번호가 발급되었습니다.");
			model.addAttribute("mem", new Members());
			return "login";
		} else {
			model.addAttribute("msg", "입력된 값이 잘못되었습니다. 다시 입력해주세요.");
			model.addAttribute("mem", new Members());
			return "/findPw";
		}	
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
