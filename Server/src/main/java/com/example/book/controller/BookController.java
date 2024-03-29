package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.Service.BookService;
import com.example.book.vo.Book;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:3000",allowCredentials = "true", allowedHeaders = "*")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Book>> getAllBooks(@PathVariable int bookNo){
		List<Book> book = bookService.getAllBooks(bookNo);
		
		if(book != null) {
			return ResponseEntity.ok(book);
			
			
		} else {
			return ResponseEntity.notFound().build();
		}
		
		
	}

}
