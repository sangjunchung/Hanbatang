package com.hanbatang.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
	private int board_no;
	private int member_no;
	private String member_name;
	private String member_nickname;
	private String board_title;
	private String board_text;
	private char board_public;
}
