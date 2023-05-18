package com.dto;

import java.io.Serializable;

public class MemberDto implements Serializable {

	private int memberSeq;
	private String ID;
	private String password;
	private String nickname;
	private String email;
	
	public MemberDto() {
		
	}

	public MemberDto(int memberSeq, String id, String password, String nickname, String email) {
		super();
		this.memberSeq = memberSeq;
		this.ID = id;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
	}

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDto [memberSeq=" + memberSeq + ", ID=" + ID + ", password=" + password + ", nickname=" + nickname
				+ ", email=" + email + "]";
	}
	
}
