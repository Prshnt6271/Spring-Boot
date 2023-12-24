package com.example.dataEx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Testcontroller {
	
	@GetMapping("/")
	public String name() {
		
		return "check";
		
	}
	
	@GetMapping("/res")
    public String check(@RequestParam String uname, @RequestParam String psw, Model model) {
	      String userName = "prshnt";
	        String password = "1234";

	        if (userName.equals(uname) && password.equals(psw)) {
	            model.addAttribute("message", "Login successful!");
	        } else {
	            model.addAttribute("message", "Login failed. Please check your credentials.");
	        }

	        return "result";
	    }
}
	