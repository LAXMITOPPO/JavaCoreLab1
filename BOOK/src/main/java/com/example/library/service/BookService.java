package com.example.library.service;

import java.util.List;

import com.example.library.Entity.Book;
import com.example.library.exception.BookAlreadyExistsException;
import com.example.library.exception.BookNotFoundException;

public interface BookService {

	Book saveBook(Book book) throws BookAlreadyExistsException;

	List getAllBooks() throws BookNotFoundException;

	Book getBookById(int id) throws BookNotFoundException;

	List getAllBook();
}
