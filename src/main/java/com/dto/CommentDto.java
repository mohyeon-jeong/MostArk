package com.dto;

import java.io.Serializable;

public class CommentDto implements Serializable {

	private int commentSeq;
	private String content;
	private String nickname;
	private int postSeq;
	private String writeDate;
	
	public CommentDto() {

	}

	public CommentDto(int commentSeq, String content, String nickname, int postSeq, String writeDate) {
		super();
		this.commentSeq = commentSeq;
		this.content = content;
		this.nickname = nickname;
		this.postSeq = postSeq;
		this.writeDate = writeDate;
	}

	public int getCommentSeq() {
		return commentSeq;
	}

	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPostSeq() {
		return postSeq;
	}

	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "CommentDto [commentSeq=" + commentSeq + ", content=" + content + ", nickname=" + nickname + ", postSeq="
				+ postSeq + ", writeDate=" + writeDate + "]";
	}
	
}
