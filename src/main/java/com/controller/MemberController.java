package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aop.AopSkip;
import com.dto.CommentDto;
import com.dto.MemberDto;
import com.dto.PostDto;
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
	
	// 로그인 페이지로 이동
	@AopSkip
	@GetMapping("login.do")
	public String login() {
		return "login";
	}
	
	// TODO 로그아웃
	@GetMapping("logout.do")
	public String logout() {
		return "main";
	}
	
	// 마이 페이지 - 내 정보 수정으로 이동
	@GetMapping("memberUpdate.do")
	public String memberUpdate() {
		return "memberUpdate";
	}
	
	// 회원가입 페이지로 이동
	@AopSkip
	@GetMapping("register.do")
	public String register() {
		return "register";
	}
	
	// 로그인
	@PostMapping("loginAf.do")
	public String loginAf(MemberDto beforeLoginDto, HttpServletRequest req, Model model) {
		MemberDto afterLoginDto = service.login(beforeLoginDto);
		
		List<PostDto> myPost = new ArrayList<>();
		myPost = service.getMyPost(afterLoginDto);
		
		List<CommentDto> myComment = new ArrayList<>();
		myComment = service.getMyComment(afterLoginDto);
		
		if (afterLoginDto != null) {
			req.getSession().setAttribute("login", afterLoginDto);
			req.getSession().setAttribute("myPost", myPost);
			req.getSession().setAttribute("myComment", myComment);
			req.getSession().setMaxInactiveInterval(60 * 60 * 2); // 세션 만료 기한 설정 (2시간)
			
			return "main";
		} else {
			String msgParam = "LOGIN_FAILED";
			model.addAttribute("login", msgParam);
			
			return "message";
		}
	}
	
}
