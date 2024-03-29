package com.example.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.dao.BookDAO;
import com.example.book.vo.Book;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	
	//도서 리스트 출력
	public List<Book> getAllBooks(int bookNo){
		return bookDAO.getAllBooks(bookNo);
	}
	

}
