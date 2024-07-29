package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbatang.service.EmailService;

@Controller
public class MailController {
	
	@Autowired
	private EmailService mailService;
	
	
	@ResponseBody
	@PostMapping("/mail")
	public String mailSend(String mail, int count) {
		int number = mailService.sendMail(mail, count);
		String num = "" + number;
		return num;
	}

}
