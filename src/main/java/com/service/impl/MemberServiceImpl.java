package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDao;
import com.dto.CommentDto;
import com.dto.MemberDto;
import com.dto.PostDto;
import com.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;
	
	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	
	@Override
	public List<PostDto> getMyPost(MemberDto dto) {
		return dao.getMyPost(dto);
	}
	
	@Override
	public List<CommentDto> getMyComment(MemberDto dto) {
		return dao.getMyComment(dto);
	}
	
	@Override
	public int idCheck(String id) {
		return dao.idCheck(id);
	}

}