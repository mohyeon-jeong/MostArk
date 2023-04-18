package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.PostService;

@Controller
public class PostController {

	@Autowired
	PostService service;
	
	// 메인 화면
	@GetMapping("main.do")
	public String goMain() {
		return "Main";
	}
	
}
