package com.example.library.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int BookId;
	private String BookTitle;
	private String BookAuthor;
	private int BookPage;
	private int Price;

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookTitle() {
		return BookTitle;
	}

	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public int getBookPage() {
		return BookPage;
	}

	public void setBookPage(int bookPage) {
		BookPage = bookPage;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookTitle, String bookAuthor, int bookPage, int price) {
		super();
		BookId = bookId;
		BookTitle = bookTitle;
		BookAuthor = bookAuthor;
		BookPage = bookPage;
		Price = price;
	}

}
