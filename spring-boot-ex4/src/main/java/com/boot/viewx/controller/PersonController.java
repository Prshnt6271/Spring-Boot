package com.boot.viewx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.viewx.model.Person;

@Controller
public class PersonController {
	
	@GetMapping("/persons")
	public String perList(Model model) {
		
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("prshnt","singh","prshnt@1234"));
		persons.add(new Person("rahul","shamra","rahul@1234"));
		persons.add(new Person("naman","batra","naman@1234"));
		
		persons.add(new Person("alok","kush","alok@1234"));
		
		model.addAttribute("persons",persons);
		
		return "persons-list";  
		
	}

}
