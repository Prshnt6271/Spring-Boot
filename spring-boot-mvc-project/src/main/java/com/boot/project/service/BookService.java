package com.boot.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.project.model.Book;

@Service
public class BookService {
	public static List <Book> books=new ArrayList<Book>();
	static {
		books.add(new Book(101,"spring","prshnt"));
		books.add(new Book(102,"java","alok"));
		books.add(new Book(103,"python","rahul"));
		books.add(new Book(101,"sql","shubham"));
	}
	
	public List<Book> getbooks() {
		return books;
	}

	public void savebookData(Book book) {
		books.add(book);
	}
}
