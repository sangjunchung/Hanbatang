package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hanbatang.dto.Board;
import com.hanbatang.dto.Members;
import com.hanbatang.service.BoardService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UploadBoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/uploadBoard")
	public String uploadBoard(Model model) {
		
		model.addAttribute("board", new Board());
		return "uploadBoard";
	}

	
	@PostMapping("/posting")
	public String insertBoard(Board newBoard, Model model, HttpSession session) {
		
		Members member = (Members) session.getAttribute("loginSession");
		boardService.uploadPost(member.getMember_no(), member.getMember_name(), member.getMember_nickname(), newBoard);
		
		return "redirect:/board";
	}
	
}