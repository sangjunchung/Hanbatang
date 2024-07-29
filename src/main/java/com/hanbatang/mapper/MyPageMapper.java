package com.hanbatang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hanbatang.dto.Members;

@Mapper
public interface MyPageMapper {
	void updateMemberAddress(@Param("member_id") String member_id, @Param("member_address") String member_address);
	void updateMember(Members updateMember);
	void deleteMember(@Param("member_id") String member_id);
}
