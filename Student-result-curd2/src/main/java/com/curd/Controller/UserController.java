package com.curd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curd.Entity.Student;
import com.curd.service.serviceImp;

@Controller
public class  UserController{
	@Autowired
	private serviceImp service;
	@RequestMapping("/")
	public String homepage() {
	
		return "home";
	}
	
    @GetMapping("/add")
    public String showAddForm() {
        // Your code
        return "add"; 
    }
    
    @RequestMapping("/register")
    public String regestration(Student student,ModelMap model) {
        // Your code
    	Student s1=service.saveStudent(student);
//    	System.out.println(s1.getName());
    	System.err.println(s1.getHibarnate());
        return "sucess"; 
    }
    
    @RequestMapping("/view")
	public String getAll(ModelMap model) {
		model.put("students",service.getAllStudent());
		return "view";
	}
    
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		service.deleteStudent(id);
		return "redirect:/view";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id,ModelMap model) {
		model.put("command",service.getStudent(id));
		return "update";
		
	}
	
	@RequestMapping("/Update")
	public String updateSavee( Student student) {
		Student edit=service.updateStudent(student);
		return "redirect:/view";
		
	}
}