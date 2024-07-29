package com.hanbatang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hanbatang.dto.Members;

@Mapper
public interface LoginMapper {
	Members getLogin(@Param("member_id") String member_id, @Param("member_pw") String member_pw);
	Members getFindId(@Param("member_name") String member_name, @Param("member_email") String member_email);
	Members getFindPw(@Param("member_id") String member_id, @Param("member_name") String member_name);
	void updateNewPw(String member_id, String member_name, String member_pw);
}
