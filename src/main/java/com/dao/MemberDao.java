package com.dao;

import java.util.List;

import com.dto.CommentDto;
import com.dto.MemberDto;
import com.dto.PostDto;

public interface MemberDao {
	
	MemberDto login(MemberDto dto);
	
	List<PostDto> getMyPost(MemberDto dto);
	
	List<CommentDto> getMyComment(MemberDto dto);

}
