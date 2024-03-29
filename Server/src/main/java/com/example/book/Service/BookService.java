package com.example.book.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.book.dao.BookDAO;
import com.example.book.vo.Book;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	
	
	private final BookDAO bookDAO;
	
	
	//도서 리스트 출력
	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}
	

}
