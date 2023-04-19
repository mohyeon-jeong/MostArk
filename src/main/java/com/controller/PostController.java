package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aop.AopSkip;
import com.service.PostService;

@Controller
public class PostController {

	@Autowired
	PostService service;
	
	// 메인 화면
	@AopSkip
	@GetMapping("main.do")
	public String goMain() {
		return "main";
	}
	
	// 자유 게시판 목록
	@AopSkip
	@GetMapping("freePostList.do")
	public String freePostList() {
		return "freePostList";
	}
	
}
