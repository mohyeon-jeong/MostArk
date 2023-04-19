package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aop.AopSkip;
import com.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	// 세션 아웃
	@AopSkip
	@GetMapping("sessionOut.do")
	public String sessionOut(Model model) {
		String sessionOut = "logout";
		model.addAttribute("sessionOut", sessionOut);
		
		return "message";
	}
	
	// 로그인
	@AopSkip
	@GetMapping("login.do")
	public String login() {
		return "login";
	}
	
	// 로그아웃
	@GetMapping("logout.do")
	public String logout() {
		return "main";
	}
	
	// 마이 페이지 - 내 정보 수정
	@GetMapping("memberUpdate.do")
	public String memberUpdate() {
		return "memberUpdate";
	}
	
}
