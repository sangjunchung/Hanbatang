package com.hanbatang.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
  private int member_no;
  private String member_id;
  private String member_pw;
  private String member_nickname;
  private String member_email;
  private String member_name;
  private String member_ssn;
  private String member_phone;
  private String member_address;
	
}
