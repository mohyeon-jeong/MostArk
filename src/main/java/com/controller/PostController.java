package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.PostService;

@Controller
public class PostController {

	@Autowired
	PostService service;
	
}
