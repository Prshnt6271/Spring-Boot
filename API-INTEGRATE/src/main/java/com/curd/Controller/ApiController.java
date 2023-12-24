package com.curd.Controller;

//ApiController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.curd.service.ApiService;

//@RestController
@Controller

public class ApiController {

 @Autowired
 private ApiService apiService;

 @RequestMapping("/api")
 public String Login() {
	 System.out.println("hello");
     return "login";
 }
 @PostMapping("/authenticate")
 public String authenticateUser(@RequestParam String loginId, @RequestParam String password) {
	 try {
		 System.out.println(loginId+" "+password);
		 return apiService.authenticateUser(loginId, password);
		 
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	 return "hh";
    
 }

 // Implement methods for createCustomer, getCustomerList, deleteCustomer, and updateCustomer
}
