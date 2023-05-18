package com.service;

import java.util.List;

import com.dto.CommentDto;
import com.dto.MemberDto;
import com.dto.PostDto;

public interface MemberService {
	
	MemberDto login(MemberDto dto);
	
	List<PostDto> getMyPost(MemberDto dto);
	
	List<CommentDto> getMyComment(MemberDto dto);
	
	int idCheck(String id);

}
