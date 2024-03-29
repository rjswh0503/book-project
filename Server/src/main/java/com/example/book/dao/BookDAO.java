package com.example.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.book.vo.Book;

@Mapper
public interface BookDAO {
	
	
	//책 정보 리스트 
	
	List<Book> getAllBooks();
		
}
