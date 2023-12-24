package com.example.dataEx.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import model.User;


@Controller
public class TestController {

	@GetMapping("/")
	public String displayUserPage(Model model){
		User user = new User();
		model.addAttribute("user", user);
		initializeFormValues(model);
		return "/form";
	}
	

	@PostMapping("/register")
	public String displayUserDetails(@ModelAttribute User user,Model model){
		model.addAttribute("user", user);
		System.out.println(user.name);
		return "/result";
	}
	
	private void initializeFormValues(Model model) {
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("J2EE");
		courses.add("Spring");
		courses.add("Hibernate");
		courses.add("Jquery");
		model.addAttribute("courses", courses);
		
		List<String> genders = new ArrayList<String>();
		genders.add("Male");
		genders.add("Female");
		model.addAttribute("genders", genders);
		
		List<String> batches = new ArrayList<String>();
		batches.add("morning");
		batches.add("evening");
		model.addAttribute("batches", batches);
		
	}
}