package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TestController {
	@RequestMapping("/greet")
	
	public String greeet() {
		return "greet";
	}

	@RequestMapping("/greet2")
	public String greeet2() {
		return "greet2";
	}

}