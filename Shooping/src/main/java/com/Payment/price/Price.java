package com.Payment.price;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Price {
	@GetMapping("/")
	public String show() {
		return"hello Rahul";
	}
}
