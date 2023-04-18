package com.dto;

import java.io.Serializable;

public class PostDto implements Serializable {
	
	private int postSeq;
	private String title;
	private String content;
	private String nickname;
	private String writeDate;
	private int readCount;
	private int likeCount;
	
	public PostDto() {
		
	}

	public PostDto(int postSeq, String title, String content, String nickname, String writeDate, int readCount,
			int likeCount) {
		super();
		this.postSeq = postSeq;
		this.title = title;
		this.content = content;
		this.nickname = nickname;
		this.writeDate = writeDate;
		this.readCount = readCount;
		this.likeCount = likeCount;
	}

	public int getPostSeq() {
		return postSeq;
	}

	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "PostDto [postSeq=" + postSeq + ", title=" + title + ", content=" + content + ", nickname=" + nickname
				+ ", writeDate=" + writeDate + ", readCount=" + readCount + ", likeCount=" + likeCount + "]";
	}
	
}
