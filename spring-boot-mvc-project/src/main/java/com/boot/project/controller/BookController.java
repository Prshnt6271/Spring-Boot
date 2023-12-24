package com.boot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.boot.project.model.Book;
import com.boot.project.service.BookService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/viewBooks")
	public String getAllBooks(Model model) {
		
		// read the books and send the book to view layer using model object
		List<Book> books=bookService.getbooks();
		model.addAttribute("books",books);
		return "view-books";
		
	}
	
	@GetMapping("/addbook")
	
	public String addBookPage() {
		
		return "add-book";
	}
	
	@PostMapping("/savebook")
	
	public String savebook(@Valid @ModelAttribute Book book, BindingResult result,Model model) {
	    if (result.hasErrors()) {
	        // Validation errors, return to the form page with error messages
//	    	model.addAttribute(Errors,result);
	        return "add-book";
	    }
	    
	    bookService.savebookData(book);
	    return "redirect:/books/viewBooks";
	    
	}
}
