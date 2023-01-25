package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.library.Entity.Book;
import com.example.library.exception.BookAlreadyExistsException;
import com.example.library.exception.BookNotFoundException;
import com.example.library.service.BookService;

public class Bookcontroller {

	private BookService bookService;

	@Autowired
	public Bookcontroller(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping("/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) throws BookAlreadyExistsException {
		Book savedBook = bookService.saveBook(book);
		return new ResponseEntity<>(savedBook, HttpStatus.CREATED);

	}

	@GetMapping("/books")
	public ResponseEntity<List> getAllBook() throws BookNotFoundException {
		return new ResponseEntity<List>((List) bookService.getAllBook(), HttpStatus.OK);
	}

	@GetMapping("book/{id}")
	public ResponseEntity getBookById(@PathVariable("id") int id) throws BookNotFoundException {
		return new ResponseEntity(bookService.getBookById(id), HttpStatus.OK);
	}
}
