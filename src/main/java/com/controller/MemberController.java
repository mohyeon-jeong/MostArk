package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	// 세션 아웃
	@GetMapping("sessionOut.do")
	public String sessionOut(Model model) {
		String sessionOut = "logout";
		model.addAttribute("sessionOut", sessionOut);
		
		return "message";
	}
	
}
