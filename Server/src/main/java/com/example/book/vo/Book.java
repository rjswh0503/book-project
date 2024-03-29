package com.example.book.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private int bookNo;
	private String bookIsbn;
	private String bookTitle;
	private String bookContents;
	private String bookInfoDate;
	private String bookAuthor;
	private String bookPublisher;
	private String bookPrice;
	private String bookCategory;
	private Date bookDate;
	private String bookImg;
	private String bookAuthorc;
	private String bookImg2;
	
}
