package com.hanbatang.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hanbatang.dto.Board;
import com.hanbatang.service.BoardService;

@Controller
public class ReadBoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/readBoard/{board_no}")
	public String getBoardById(Model model, @PathVariable int board_no) {
		Board board = boardService.getBoardById(board_no);
		model.addAttribute("board", board);
		
		return "readBoard";
	}
	
	
}
