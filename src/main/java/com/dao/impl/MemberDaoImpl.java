package com.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.MemberDao;
import com.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession session;
	
	String map = "Member.";
	
	@Override
	public MemberDto login(MemberDto dto) {
		return session.selectOne(map + "login", dto);
	}
	
}
