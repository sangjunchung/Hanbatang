package com.hanbatang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.Board;
import com.hanbatang.dto.Members;
import com.hanbatang.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	public List<Board> getAllPostNotLogin(){
		return boardMapper.getAllPostNotLogin();
	}
	
	public List<Board> getAllPost(Members member){
		return boardMapper.getAllPost(member);
	}
	
	public void insertBoard(Board board) {
		boardMapper.insertBoard(board);
	}

	
	public void uploadPost(int member_no, String member_name, String member_nickname, Board newBoard) {
		Board board = newBoard;

		board.setMember_no(member_no);
		board.setMember_name(member_name);
		board.setMember_nickname(member_nickname);
		boardMapper.uploadPost(board);
	}
	
	public Board getBoardById(int board_no) {
		return boardMapper.getBoardById(board_no);
	}
}