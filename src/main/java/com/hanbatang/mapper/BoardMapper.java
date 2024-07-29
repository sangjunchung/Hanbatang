package com.hanbatang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hanbatang.dto.Board;
import com.hanbatang.dto.Members;

@Mapper
public interface BoardMapper {
	List<Board> getAllPostNotLogin();
	
	List<Board> getAllPost(Members member);

	void insertBoard(Board board);
	
	public void uploadPost(Board board);
	
	Board getBoardById(int board_no);
	
	
	
}

