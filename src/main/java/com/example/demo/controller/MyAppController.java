package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyAppController {

	@RequestMapping("/welcome")
	@ResponseBody
	public String handler() {
		return "Hello World!!! Welcome to new change.... again a change123";
	}
	
	@RequestMapping("/")
	public String handlerHtml() {
		return "myapp.html";
	}
}
