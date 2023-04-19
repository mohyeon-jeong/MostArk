package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aop.AopSkip;

@Controller
public class CharInfoController {

	// 전투 정보실 메인
	@AopSkip
	@GetMapping("charInfo.do")
	public String charInfo() {
		return "charInfo";
	}
	
}
