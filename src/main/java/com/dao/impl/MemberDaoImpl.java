package com.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.MemberDao;
import com.dto.CommentDto;
import com.dto.MemberDto;
import com.dto.PostDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession session;
	
	String map = "Member.";
	
	@Override
	public MemberDto login(MemberDto dto) {
		return session.selectOne(map + "login", dto);
	}
	
	@Override
	public List<PostDto> getMyPost(MemberDto dto) {
		return session.selectList(map + "getMyPost", dto);
	}
	
	@Override
	public List<CommentDto> getMyComment(MemberDto dto) {
		return session.selectList(map + "getMyComment", dto);
	}
	
	@Override
	public int idCheck(String id) {
		return session.selectOne(map + "idCheck", id);
	}
	
}
