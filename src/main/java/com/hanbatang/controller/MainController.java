package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String mainPage() {
		return "mainPage";
	}

	@GetMapping("/wayToMarket")
	public String showMarketGuide() {
		return "MarketGuide";
	}
	
	@GetMapping("/introCompany")
	public String showIntroCompany() {
		return "introCompany";
	}
	
	@GetMapping("/beefInfo")
	public String showBeefInfo() {
		return "beefKindsInfo";
	}
	
	@GetMapping("/memberSignUp")
	public String showSignUp() {
		return "member-register";
	}
	
	@GetMapping("/getMyPage")
	public String showMyPage() {
		return "getMyPage";
	}
}
