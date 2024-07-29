package com.hanbatang.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hanbatang.dto.Member;

@Mapper
public interface MemberMapper {
     
	void insertMember(Member member);
}
